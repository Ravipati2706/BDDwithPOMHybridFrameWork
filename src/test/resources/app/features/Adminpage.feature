Feature: Admin page Feature

Background:
Given user has already logged in to application
|username|password|
|Admin|admin123|

Scenario: Admin page title
Given user is on Admin page
When user gets the title of the page
Then page Title should be "OrangeHRM"

Scenario: Admin page section count
Given user is on Admin page
Then user gets admin user management section
|User Management|
|Job|
|Organization|
|Qualifications|
|Nationalities|
|Corporate Branding|
|Configuration|
And accounts section count should be 7