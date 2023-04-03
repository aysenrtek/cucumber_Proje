Feature: Register
  Scenario: Create account
    Given Navigate to parabank site
    When  Click Register Link
    And   Enter user infos
    Then  Verify that account has been created

