Feature: As a user, I should be able to access to Files module - Favorites button

  Background:

  Scenario: Verify users can add files to Favorites
    Given the user is logged in
    When the user clicks the "Files" module
    When the user clicks action-icon from any file on the page
    And user choose the "Add to favorites" option
    Then the user should see a confirmation message






