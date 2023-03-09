Feature: As a user, I want to access to the Photos module.

  @US14Lamiya
  Scenario Outline: Verify user can access to the Photos module.
    Given User on the login page "https://qa.trycloud.net/"
    When User enter "<username>" and "<password>"
    And User click the login button
    And User clicks on Photo module
    Examples:
      | username | password    |
      | User199  | Userpass123 |


