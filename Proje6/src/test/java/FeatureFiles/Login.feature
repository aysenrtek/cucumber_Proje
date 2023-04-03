Feature: Login
  Background:
    Given Navigate to parabank site

    Scenario Outline: Login Functionality
      When Login the website with the current account "<username>" "<password>"
      And  Verify that you are logged in
      Then  Log out
      When Login with invalid account details "<wrongusername>" "<wrongpassword>"
      Then verify that you are not logged in


      Examples:
      |username |password | wrongusername|wrongpassword|
      |CdCode   |14589    | cdCod        |18963        |












