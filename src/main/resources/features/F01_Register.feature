@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select ginder
    And user enters name "automation"& "tester"
    And user select date of birth
    And user enters email "tests@example.com"
    And user enters password "P@ssword" and confirms
    And user click register
    Then Account created
