## Table dependencies in database

**GameVersion**
- Scenario
- Community
  - Tax
  - House
- MovingReason

**Scenario**
- MeasureCategory
  - MeasureType
    - InitialHouseMeasure (linking to the House from the corresponding GameVersion)
- NewsItem
  - NewsEffects (potentially linking to the Community from the corresponding GameVersion)
- WelfareType
- Question
  - QuestionItem

Note: ScenarioParameters are _used_ by the Scenario, so there is no dependency of the ScenarioParameters on the Scenario.
