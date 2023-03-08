
US10: As a user, I should be able to update settings

  Scenario:  Verify user can delete files/folders

  Given when the user is on the dashboard page
  When the user clicks on the "Files" module on the top of the screen
  And the user clicks the action-icon "..."  from any file or folder on the right of the page
  And the user chooses the "Delete File" option
  When the user clicks the "Deleted Files" sub-module on the bottom left of the screen
  Then verify the deleted file is displayed on the page