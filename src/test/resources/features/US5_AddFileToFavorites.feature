#Toma's US, As a user, I should be able to add file to favorites.
  Feature: This is my US

    Scenario: As a user, I should be able add file to favorites.
      Given the user is logged in
      And the user is on the "My Files" page
      When the user selects a file
      And clicks the "Add to Favorites" button
      Then the file should be added to the user's favorites list
      And the user should see a confirmation message





