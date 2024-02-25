@smoke
Feature: F03_Currencies| users can use euro currencies
  Scenario: user can select the euro currencies
    Given Ensure that user is in home page
    When select Euro currency from drobdown
    Then verify euro symbol is shown on 4 products displayed in home page