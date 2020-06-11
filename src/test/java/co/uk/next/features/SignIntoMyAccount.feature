Feature: Sign in to view an existing account
  As a user
  I want to sign into my account
  So I can view my details
  Background:
    Given I navigate to next website

  Scenario Outline: User can successfully sign in to their account

    When I click on any my account link
    And I enter my "<details>"
    And I enter my "<password>"
    And I click on the sign in button
    Then my account summary is displayed
    Examples:
      | details | password |
      |KW086669 |Olupelu91 |