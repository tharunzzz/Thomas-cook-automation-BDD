
Feature: Thomas Cook
  Scenario Outline: Test5
    Given User Enters the Thomas Cook website five
    When I hover over on forex five
    And I click on international univercity
    Then I enter phone number "<value>" click on get Quote also verify five
		Examples:
			| value |
			| 9876543210 |