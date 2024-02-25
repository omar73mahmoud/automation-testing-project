@smoke
Feature: Wishlist Functionality Verification


  Scenario: Add product to wishlist and verify success message and background color
    Given User is on the homepage of the website
    When User clicks on the wishlist button for the product "HTC One M8 Android L 5.0 Lollipop"
    Then Success message "The product has been added to your wishlist" is displayed with green background color


  Scenario: Verify the quantity of products in the wishlist
    Given User is on the homepage of the website
    When User clicks on the wishlist button for the product "HTC One M8 Android L 5.0 Lollipop"
    And User waits for the success message to disappear
    And User clicks on Wishlist tab
    Then Quantity of products in the wishlist is greater than 0
