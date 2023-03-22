
Feature:  Verify that user can find the new created Service Logs value
  under Service Logs list by using search box.


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
    Then user sees Audi/A1/ - Odoo as title

  Scenario:
    Given user clicks the Vehicle Service Logs Button
    Then user inputs Audi/A1/ to the search box
    And user goes to the last page of the list
    And user sees the new created Audi/A1/ on the screen displayed

