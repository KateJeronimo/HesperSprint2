# Kate's user story

Feature: Search feature

  Agile story: As a user, I should be able to search any item/ users from the search icon.

  @Kate
  Scenario: Search functionality
    Given user is logged in with valid credentials
    When user is on Files page
    And user clicks on the Search icon
    And user searches for one of the files from Files page
    Then user should see the file in the search results