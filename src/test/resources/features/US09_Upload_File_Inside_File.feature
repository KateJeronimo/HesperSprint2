Feature: As a user  I should upload a file inside a folder

  Scenario:Verify users can upload a file inside a folder


    Given user is on the Dashboard page
    When The user clicks the "Files" Module
    And user choose a folder from the page
    And user clicks the add icon on the top
    When the user uploads a file with the upload file option
    Then Verify the file is displayed on the page

