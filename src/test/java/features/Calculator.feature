@Basic
Feature: Verify Calculator Operations

  Scenario: Verify addition of two numbers
    Given I am on Calculator page
    When I enter number 1
    And I click on operator '+'
    And I enter number 2
    Then I verify the result as 3