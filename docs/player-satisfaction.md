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
The table `playerround` contains a number of fields that store various aspects for satisfaction. Since the exact meaning of each field is not always easy to understand, the precise definition and usage for each field is given below.


### Field `playerround.satisfaction_move_penalty`

#### When calculated:
if a player moves. I.e., when the player _sells_ a house. This is not used for round 1 when buying a house for the first time. 

#### How much:
The height of the penalty is determined by `scenarioparameters.satisfaction_move_penalty`. 

#### Adapted by news:
It is possible that the move penalty is changed by a `newsitem` and the associated `newseffects`. The parameter `newseffects.satisfaction_move_change` can increase or decrease the penalty. When the value of the move_penalty is 1, and the value of the parameter's move_change is -1, the effective penalty will be 0.


### Field `playerround.satisfaction_house_rating_delta`

#### When calculated:
- if a player buys a house. This is also used for round 1 when buying a house for the first time. When the `house.rating` >= `welfaretype.preferred_house_rating`, no penalty is given. If there is a delta, a penalty can be given.
- it is also possible that a player gets a satisfaction reduction in later rounds after buying. When the value of `scenarioparameters.satisfaction_house_rating_per_round` is TRUE, the value is **also** applied in later rounds until a player moves to a better house.

#### How much:
The height of the satisfaction penalty based on the rating delta is determined by the following components:
- `scenarioparameters.satisfaction_house_rating_too_low_fixed`: a fixed amount, independent of the height of the rating delta.
- `scenarioparameters.satisfaction_house_rating_too_low_per_delta`: a variable amount, calculated by multiplying the parameter value by the rating delta.
- Note that both values can apply if they are both larger than zero. Typically one of them is larger than zero.
- Note that these satisfaction decreases can be calculated once after buying, or at each round after buying. This is determined by the value of the boolean parameter `scenarioparameters.satisfaction_house_rating_per_round`.


### Field `playerround.satisfaction_debt_penalty`

#### When calculated:
At the end of each round. When the `playerround.spendable_income` < 0 at the end of the round, a satisfaction debt penalty can be applied.

#### How much:
The height of the penalty is determined by `scenarioparameters.satisfaction_debt_penalty`. 


### Field `playerround.satisfaction_fluvial_penalty` and `playerround.satisfaction_pluvial_penalty`

#### When calculated:
After the rolling of the dice for the flooding. 

#### How much:
The fluvial and pluvial penalty each have 3 components:
- fixed point loss if community floods (`scenarioparameters.f/pluvial_satisfaction_penalty_if_area_flooded`).
- fixed point loss if house floods (`scenarioparameters.f/pluvial_satisfaction_penalty_house_flooded_fixed`).
- variable point loss per damage points if house floods (`scenarioparameters.f/pluvial_satisfaction_penalty_per_damage_point`).


### Field `playerround.satisfaction_house_measures`

#### When calculated:
- When buying a house (copy the `housegroup.house_satisfaction`)
- When selling a house (set to 0).
- After buying measures in a round (`housegroup.house_satisfaction` will increase as well). 

#### How much:
The total sum is calculated based on the valid measures for the owned house at that point. The bought measures and/or available measures for the house contribute to the delta for that round for the house satisfaction. The value should be a copy of the `housegroup.house_satisfaction` at that point in the game. 
- when no house is owned, `playerround.satisfaction_house_measures` is zero.
- when a house is bought, `playerround.satisfaction_house_measures` is filled with the value of `housegroup.house_satisfaction`.
- when measures are bought, `housegroup.house_satisfaction` is recalculated. After that, `playerround.satisfaction_house_measures` is filled with the value of `housegroup.house_satisfaction`.

#### Note:
- The value is copied for each round to the `playerround`, since the history is not kept in the `housegroup`. 
- When selling a house, the total satisfaction is _decreased_ by the house_satisfaction of the _sold_ house.
- When buying a house, the total satisfaction is _increased_ by the current house_satisfaction of the _bought_ house. The value is later updated with the bought measures.


### Field `playerround.satisfaction_personal_measures`

#### When calculated:
After buying (personal) measures in a round. The bought personal measures are stored in records of the `personal_measure` table. Measures in `measuretype` are personal when the field `house_measure` is FALSE. The field stores the total satisfaction delta based on personal measures for this round.

#### How much:
Each round, after buying (personal) measures, it is calculated which of the personal measures from this round and previous rounds deliver satisfaction for the player in the current round. The sum for this round is stored in `playerround.satisfaction_personal_measures`. The following fields determine how many satisfaction points count in this round and subsequent rounds after buying:
- `satisfaction_delta_once`. This satisfaction exists only in the round where the measure was bought. In other words, when `groupround.round_number` is equal to the current round number.
- `satisfaction_delta_permanent`. This satisfaction exists in all rounds, starting in the round when the measure was bought. In other words, when `groupround.round_number` is larger than or equal to the current round number. 

#### Notes:
- Satisfaction points are only given if the measure is valid in the current round. When a measure is not valid anymore, no satisfaction points are calculated. The validity is determined based on the field `valid_one_round` (boolean). When TRUE, the measure is only valid in the round where it was bought. It does not accumulate historically. Note that the field `valid_until_used` has no meaning in a personal measure and is ignored.
- When both `satisfaction_delta_once` and `satisfaction_delta_permanent` have a value bigger than 0, the permanent value takes precedence.


### Field `playerround.satisfaction_total`

#### When calculated:
Every time one of the satisfaction parameters changes value, the value of `satisfaction_total` is recalculated.

#### Notes:
The value of `satisfaction_total` can **always** be recalculated as:

```
playerround.satisfaction_total = 
  + previous_playerround.satisfaction_total
  + playerround.satisfaction_house_measures 
  + playerround.satisfaction_personal_measures
  - playerround.satisfaction_fluvial_penalty
  - playerround.satisfaction_pluvial_penalty 
  - playerround.satisfaction_debt_penalty
  - playerround.satisfaction_house_rating_delta
  - playerround.satisfaction_move_penalty
```

