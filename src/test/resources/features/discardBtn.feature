Feature: Verify that user can cancel creating by clicking Discard button


  Scenario:
    Given user is on the login page
    When user enters "posmanager10@info.com" to email input box
    Then user enters "posmanager" to password input box
    And user click login button
    Then user is on the posmanager homepage


  Scenario:
    Given user clicks the More button
    Then user clicks the Fleet button
    And user clicks the Vehicle Service Logs Button
    Then user checks the total vehicle number


  Scenario:
    Given user clicks the create button
    When user chooses Audi/A1/ as vehicle
    Then user clicks Discard button
    And user sees warning to discard
    Then user clicks Ok for the warning message
    And user goes back to Vehicle Service Logs page
    Then user checks the total vehicle number