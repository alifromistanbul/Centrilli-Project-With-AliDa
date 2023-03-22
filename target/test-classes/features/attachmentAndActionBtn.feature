Feature: Verify that “Attachment” and Action buttons are displayed at the top of the
  page (after creating a new Service Logs).

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

  Scenario:
    Given user clicks the create button
    When user chooses Audi/A1/ as vehicle
    And user chooses service type as Summer tires
    Then user inputs "23.000" as total price
    And user clicks save button
    And user sees Attachment button
    Then user sees Action button