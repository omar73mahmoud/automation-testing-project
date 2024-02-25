@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given click on register page
    When  user enter your valid data in all fields
    And click on register button
    Then verify that sucess message is displayed