
Feature: Verify that page title is changed to the new Service Logs value after user create the Service Logs

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
    And user chooses service type as Summer tires
    Then user sees Audi/A1/ - Odoo as title

