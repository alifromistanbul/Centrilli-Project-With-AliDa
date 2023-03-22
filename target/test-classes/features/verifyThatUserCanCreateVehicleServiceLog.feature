@wip
Feature: verify that user can create new Vehicle Service Logs

  Background: user is expected to be on posmanager home page
    Given user is on the posmanager homepage


  Scenario:
    Given user clicks the More button
    Then user clicks the Fleet button
    And user clicks the Vehicle Service Logs Button
    Then user checks the total vehicle number

  Scenario:
    Given user clicks the create button
    When user chooses Audi/A1/ as vehicle
    And user chooses service type as Summer tires
    Then user inputs "23.000" as total price
    And user clicks save button
    Then user sees Audi/A1/ - Odoo as title


  Scenario:
    Given user clicks Vehicle Service Logs link
    Then user checks the total vehicle number more than before