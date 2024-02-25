@Smoke
Feature: F04_Search| users can use search on products
  Scenario user can search on products by using product name
  Given user is on the home page
When User can search with productname
Then url must contain url of product
And Relevant search results are displayed
    And each result contains the search word "<ProductName>

  Scenario: User searches for product using SKU
    Given user is on the home page
    When I search for with SKU
    And I click on the first product in search results
    Then the SKU shown on the product page contains the searched SKU
