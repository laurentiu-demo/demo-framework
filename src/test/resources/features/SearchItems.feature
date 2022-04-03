Feature: Search Functionality and adding to the cart

  Scenario: Searching for item using search bar
    Given I am on the home page
    Then I search for "dress"
    And I add a random item to the cart
    Then I continue shopping
    And I go to category Women
    Then I choose the subcategory Blouses
    And I add a random item to the cart
