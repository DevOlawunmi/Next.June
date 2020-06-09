@QAready
Feature: Product Search
  As a user
  I want to be able to search a product
  By typing the name of the product

  Background:
    Given I navigate to next website
  Scenario Outline: User can successfully search products

    When I enter "<product>" in the search field
    And I click on the search button
    Then a list of "<product>" is displayed
    And I click on any of the displayed products

    Examples:
      |product|
      |bra|
#      |ladies bag|
#
#
