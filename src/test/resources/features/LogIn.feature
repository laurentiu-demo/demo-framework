Feature: Log In

  @Smoke
  Scenario Outline: Log In Successfully
    Given I am on the home page
    Then I go to Log In Page
    And I insert the "<Username>" and "<Password>"
    Then I check that I am on my account page

    Examples:
      | Username | Password |
      | default  | password |