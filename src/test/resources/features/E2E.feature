Feature: Checking full cycles 

  @E2E
  Scenario: The user logs in and adds 3 items to the cart in different ways and does checkout
    Given I am on the home page
    Then I go to Log In Page
    And I insert the "default" and "password"
    Then I check that I am on my account page
    Then I search for "shirt"
    And I add a random item to the cart
    Then I continue shopping
    And I go to category Women
    And I choose the subcategory Blouses
    And I add a random item to the cart
    And I continue shopping
    Then I am on the home page
    And I add the first item to the cart
    Then I go to checkout
    And I remove the item
    Then I click proceed to checkout from Summary
    Then I click proceed to checkout from Address
    Then I agree to terms of service
    Then I click proceed to checkout from Shipping
    Then I choose the payment via bank wire