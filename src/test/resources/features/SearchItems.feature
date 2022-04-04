Feature: Search Functionality and adding to the cart

  @Smoke
  Scenario: Searching for item using search bar
    Given I am on the home page
    Then I search for "dress"
    And I add a random item to the cart

  @Smoke
  Scenario: Searching from category
    Given I am on the home page
    Then I go to category Women
    Then I choose the subcategory Blouses
    And I add a random item to the cart

  @Smoke
  Scenario: Adding to cart from home page
    Given I am on the home page
    Then I add the first item to the cart