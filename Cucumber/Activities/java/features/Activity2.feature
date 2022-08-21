@activity2
Feature:Login Test

  Scenario:Testing Login
    Given Testing Login
    When User enters username and password
    Then Read the page title and confirmation message
    And quit the browser