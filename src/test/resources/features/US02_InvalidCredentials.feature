Feature: As a user, I should not be able to log in with invalid credentials.

  Scenario: Verify user login fail with invalid credentials
    Given user on the login
    When user enter invalid
    And user click the login button
    Then verify message should be displayed

    #Examples:
      #| username | password | message
     # | User9 |   Wrong    | Wrong username or password.
     # | Userpass123 | Wrong| Wrong username or password.
     # | Wrong   |  Wrong    | Wrong username or password.
