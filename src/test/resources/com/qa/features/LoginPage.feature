Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Free CRM software for customer relationship management, sales, and support."

#Scenario: Forgot Password link
#Given user is on login page
#Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "reddybabuaa"
And user enters password "bolleddupati"
And user clicks on Login button
Then user gets the title of the page
And page title should be "CRMPRO"