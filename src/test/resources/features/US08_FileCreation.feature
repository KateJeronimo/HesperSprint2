Feature: As a user, I should be able to add/create a folder.

   Scenario: Verify the users can create a folder from the Files page and verify the folder is displayed on the page.

    Given User is login on the dashboard
    When user click on the file module
   And user click On all files
    When user click on the icon add button
    And user click on new folder and enter the name
    Then user should see the new folder display on the file module section
