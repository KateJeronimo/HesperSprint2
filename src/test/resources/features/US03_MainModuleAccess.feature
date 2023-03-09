Feature: As a user, I should be accessing all the main modules of the app.

  Scenario: Verify users can access all of the main modules of the app.

    Given user is logged in with valid credentials Leila's user story
    When the user is on the Dashboard page Leila's user story
    Then user should be able to see all of the main modules:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk     |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |
