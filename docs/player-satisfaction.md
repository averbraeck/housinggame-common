# Storage of player satisfaction

There are quite a number of fields that store the player satisfaction. Here, their use is defined, and it is shown how they are calculated and maintained.

## Table `housegroup`
The table `housegroup` has a field called `house_satisfaction`. The `house_satisfaction` is calculated for the house, and exists in a sense independent of the ownership of the house. When the house is sold, the `house_satisfaction` transfers with the sale to the new owner (another player or the bank). The `house_satisfaction` is the sum of satisfaction points from `housemeasure` instances for that house, for all rounds up to and including the current round, minus the subtracted points because of fluvial or pluvial damage in each round.


### Satisfaction points stemming from `housemeasure` 
For each `housemeasure`, look at the corresponding `measuretype`. The `measuretype` has the following fields:
- `satisfaction_delta_once`. This satisfaction exists only in the round where the measure was bought. In other words, when `housemeasure.bought_in_round` is equal to the current round number.
- `satisfaction_delta_permanent`. This satisfaction exists in all rounds, starting in the round when the measure was bought. In other words, when `housemeasure.bought_in_round` is larger than or equal to the current round number. 

**Note 1**: Satisfaction points are only given if the measure is valid in the current round. When a measure is not valid anymore, no satisfaction points are calculated. The validity is determined based on the following two fields:
- `valid_one_round` (boolean): This means that the measure is only valid in the round where it was bought. It does not accumulate historically.
- `valid_until_used` (boolean): This means that if it was necessary to use the measure for fluvial or pluvial protection, it is depleted after use. If it is used in the round where it was bought or in a later round, this can be seen in the `housemeasure.used_in_round` field. As long as that field is NULL or -1 (or any number lower that the round number in which it was bought), the measure has not been used yet.

**Note 2**: When both `satisfaction_delta_once` and `satisfaction_delta_permanent` have a value bigger than 0, the permanent value takes precedence.

**Example 1:** Sandbags are valid until used, but don't provide any satisfaction.

**Example 2:** A green garden stays valid after obtaining, and it provides satisfaction points for the round when it was bought.


### Table `housemeasure` in relation to table `initialhousemeasure`
The house can also have one or more `initialhousemeasure` records that are activated in a certain round. The `initialhousemeasure` is translated at the start of the round into regular `housemeasure` records. For calculating the `house_satisfaction`, the algorithm does not have to look at `initialhousemeasure` as a result.


### Calculation of flood damage -> satisfaction
In each round, flood damage can occur to the house that influences the satisfaction for that round. The protection level of the house is calculated for fluvial and for pluvial events. The protection level is a base level provided by the community plus the protection as a result of the house measures that increase the fluvial or pluvial protection.

The community has an _initial_ fluvial and pluvial protection (`community.fluvial_protection` and `community.pluvial_protection`), but based on news messages and news effects, there can be a `newseffects.fluvial_protection_change` and `newseffects.pluvial_protection_change` (positive or negative) that affects the actual protection level.

Each `measuretype` has a `fluvial_protection_delta` and a `pluvial_protection_delta` that calculate what the actual protection level of the house is. The following boolean fields in the `measuretype` indicating the type of use determine whether the flood protection:
- `valid_one_round` (boolean): This means that the measure is only valid in the round where it was bought. It does not accumulate historically.
- `valid_until_used` (boolean): This means that if it was necessary to use the measure for fluvial or pluvial protection, it is depleted after use. If it is used in the round where it was bought or in a later round, this can be seen in the `housemeasure.used_in_round` field. As long as that field is NULL or -1 (or any number lower that the round number in which it was bought), the measure has not been used yet.

**Note**: This only holds if the measure is valid in the current round. When a measure is not valid anymore, it does not count towards the flood protection.

If there is fluvial and/or pluvial flood damage to the community and/or to the house, this can result in a reduction in satisfaction points. The document  'flooding-effects.md' provides more information.
 

### Calculation of `house_satisfaction`
The value of `housegroup.house_satisfaction` is calculated by adding the _valid housemeasures_ for all rounds up till the current round.

Subsequently, the damage points for fluvial and pluvial flooding are subtracted.

If the resulting number is below zero, the field `scenarioparameters.allow_house_satisfaction_neg` determines whether the negative value will be allowed (TRUE), or capped at zero (FALSE). 

The current value of the resulting number is always stored in `housegroup.house_satisfaction`. 

**Note**: For all `measuretype` measures that lead to a `housegroup` measure, the value of `measuretype.house_measure` is TRUE.


## Table `playerround`
The table `playerround` contains a number of fields that store various aspects for satisfaction.


