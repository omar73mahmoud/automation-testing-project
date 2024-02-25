Feature: F07_followUs | users could open followUs links

  Scenario: user opens facebook link
    Given user is on the homepage of NopCommerce
    When user opens facebook link
    Then facebook url is opened in a new tab

  Scenario: user opens twitter link
    Given user is on the homepage of NopCommerce
    When user opens twitter link
    Then twitter url is opened in a new tab

  Scenario: user opens rss link
    Given user is on the homepage of NopCommerce
    When user opens rss link
    Then rss url is-open" is opened in a new tab

  Scenario: user opens youtube link
    Given user is on the homepage of NopCommerce
    When user opens youtube link
    Then youtube url is opened in a new tab