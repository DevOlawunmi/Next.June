@WIP
Feature: Search Navigation Links
  As a user
  I want to click on any link
  So I can view available items
  Background:
    Given I navigate to next website

  Scenario: User can successfully search by department

    When I click on any departmental link
    Then a list of items in the department is displayed
    And I click on any