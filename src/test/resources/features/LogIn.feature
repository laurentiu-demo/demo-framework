Feature: Log In

  @Smoke
  Scenario Outline: Log In Successfully
    Given I am on the main page
    Then I go to Log In Page
    And I insert the "<Email Address>" and "<Password>"
    Then I check that I am on home page

    Examples:
      | Email Address   | Password |
      | default account | password |