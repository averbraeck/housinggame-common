# Flooding effects

Several effects of a flood (fluvial or pluvial) influence the game:
1. Repair costs for the player
2. Satisfaction of the player
3. Value of the house, also for subsequent rounds

The flood can influence the entire _community_ depending on the community protection, and possibly the _house_ itself, depending on the house protection.

## 1. Repair costs for the player
When the _house_ floods because of a pluvial and/or fluvial event, damage costs are calculated. Four fields in the `scenarioparameters` determine the costs:

- `pluvial_repair_costs_per_damage_point`, which is multiplied with the pluvial damage points to the house to calculate the repair costs.
- `fluvial_repair_costs_per_damage_point`, which is multiplied with the fluvial damage points to the house to calculate the repair costs.
- `pluvial_repair_costs_fixed`, which is added to the repair costs if there is pluvial damage (1 or more pluvial damage points).
- `fluvial_repair_costs_fixed`, which is added to the repair costs if there is fluvial damage (1 or more fluvial damage points).

All four of the costs can occur in a single round, although often either the costs_per_damage_point or the costs_fixed will have a value and not both.


## 2. Satisfaction of the player
When the _community_ floods because of a pluvial and/or fluvial event, a satisfaction decrease due to the damage of the entire community is calculated. Two fields in the `scenarioparameters` determine the decrease in satisfaction:

- `pluvial_satisfaction_penalty_if_area_flooded`, which is subtracted from the satisfaction if there is pluvial damage to the community (pluvial damage points for community > 0).
- `fluvial_satisfaction_penalty_if_area_flooded`, which is subtracted from the satisfaction if there is fluvial damage to the community (fluvial damage points for community > 0).

**Note:** The community has an _initial_ fluvial and pluvial protection (`community.fluvial_protection` and `community.pluvial_protection`), but based on news messages and news effects, there can be a `newseffects.fluvial_protection_change` and `newseffects.pluvial_protection_change` (positive or negative) that affects the actual protection level.

When the _house_ floods because of a pluvial and/or fluvial event, a satisfaction decrease due to the damage is calculated. Four fields in the `scenarioparameters` determine the decrease in satisfaction:

- `pluvial_satisfaction_penalty_per_damage_point`, which is multiplied with the pluvial damage points to the house to calculate the decrease in satisfaction.
- `fluvial_satisfaction_penalty_per_damage_point`, which is multiplied with the fluvial damage points to the house to calculate the decrease in satisfaction.
- `pluvial_satisfaction_penalty_house_flooded_fixed`, which is added to the pluvial damage points if there is pluvial damage (pluvial damage points > 0).
- `fluvial_satisfaction_penalty_house_flooded_fixed`, which is added to the fluvial damage points if there is fluvial damage (fluvial damage points > 0).

All six of the decreases in satisfaction can occur in a single round, although often either the penalty_per_damage_point or the penalty_house_flooded_fixed will have a value and not both.


## Value of the house
The value of the house can decrease if the house (or the community) sustained damage. The value decrease is typically indicated by a news item and stored in a news effects record. The following fields play a role:

- `newseffects.house_discount_round1` (INT) indicates the house value discount in the round where the flooding occurred. For the meaning of the discount, see the note below.
- `newseffects.house_discount_round2` (INT) indicates the house value discount in the round after the one where the flooding occurred. For the meaning of the discount, see the note below.
- `newseffects.house_discount_round3` (INT) indicates the house value discount two rounds after the round where the flooding occurred. For the meaning of the discount, see the note below.
- `newseffects.house_discount_effect_pluvial` (boolean) indicates whether this happens after a pluvial event.
- `newseffects.house_discount_effect_fluvial` (boolean) indicates whether this happens after a fluvial event. Note that when both are true, the discount is only applied once, after a pluvial and/or a fluvial event.
- `newseffects.house_discount_community` (boolean) indicates whether the house discount happens after the _community_ flooded (TRUE) or after the house flooded (FALSE). 

**Note:** The value of `scenarioparameters.house_discount_in_euros` determines whether the discount applied is absolute costs (when TRUE, the value of the discount in rounds 1, 2, 3 is in Euros), or as a relative percentage (when false, the house is discounted by the percentage indicated for rounds 1, 2, 3). 
