Feature: Pay bills

  Background:
    Given Navigate to parabank site

  Scenario Outline: Login Functionality
    When Login the website with the current account "<username>" "<password>"
    And  Verify that you are logged in
    When Click the bill pay
    And  Payment of the bills  "<Amount>"
    Then Verify that you have paid for the bill


    Examples:
      | username | password | Amount |
      | CdCode   | 14589    | 85     |
      | CdCode   | 14589    | 45     |
      | CdCode   | 14589    | 120    |






