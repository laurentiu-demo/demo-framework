Feature: Search Functionality and adding to the cart

  Scenario: Searching for item using search bar
    Given I am on the home page
    Then I search for "dress"
    And I add a random item to the cart
