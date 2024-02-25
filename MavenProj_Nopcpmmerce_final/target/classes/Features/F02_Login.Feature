@smoke
Feature: F02_Login | users could Login to his accounts
  Scenario: guest user could Login to his account when he enter his valid data
    Given click on Login page
    When  user enter your valid data in username and password
    And click on Login button
    Then verify that user logined succssufully

  Scenario: user could login with invalid email and password
    Given click on Login page
    When  user enter your invalid data in username and password
    And click on Login button
    Then verify that user cant logined