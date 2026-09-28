
Feature: Thomas Cook
  Scenario Outline: Test6
    Given User Enters the Thomas Cook website six
    When I click on forex six
    And I click on learn more action
    Then I enter email "<value>" also verify six
		Examples:
			| value |
			| abcd123@gmail.com |