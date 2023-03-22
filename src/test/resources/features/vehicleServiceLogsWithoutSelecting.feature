Feature: Verify that user cannot create a Vehicle Service Logs without selecting vehicle


  Scenario:
    Given user clicks the More button
    Then user clicks the Fleet button
    And user clicks the Vehicle Service Logs Button
    Then user checks the total vehicle number


  Scenario:
    Given user clicks the create button
    And  user clicks save button without selecting vehicle
    Then user should see The following fields are invalid warning message
