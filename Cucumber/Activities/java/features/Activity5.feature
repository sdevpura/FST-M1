@activity5
Feature:Login Test

  Scenario Outline:Testing Login with Examples
    Given User is on Login page
    When User enters "<Usernames>" and "<Passwords>"
    Then Read the page title and confirmation message
    And quit the browser
    Examples:
      | Usernames  | Passwords |
      | admin  | password |
      | admin  | password |