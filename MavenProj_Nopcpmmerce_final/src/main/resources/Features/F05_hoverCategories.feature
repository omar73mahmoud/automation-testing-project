Feature: Hovering and clicking on categories and sub-categories

  @smoke
  Scenario: Hover on a main category and click on a sub-category
    Given User is on the Home page
    When User hover on random category
    And  user Click on random subcategory
    Then verify that category are the same of subcategory title
