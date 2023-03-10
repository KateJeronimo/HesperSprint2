Feature: As a user, I should be able to access to Files module.

  Scenario: verify users can access to Files module
    When the user is accessing the "Files" module
    Then verify the page title is "Files - Trycloud QA"

  Scenario: verify users can select all the uploaded files from the page
    When the user is accessing the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected





