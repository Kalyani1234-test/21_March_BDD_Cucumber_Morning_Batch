Feature:Home WebPage Functionality

Scenario: Validate Title
Given user is on the Home Page
Then HomePage title should be "Amaha - Trusted Psychiatrists, Therapists & In-patient Care"

Scenario: Verify Application logo
Given user is on the Home Page
Then the application logo should be displayed

Scenario Outline: Login with valid credentials
Given user is on the Home Page
And user clicks on Sign-in button
When user enters a valid "<email>" address
And user clicks on Continue button
And user clicks on the Use password to login link
And user enters a valid "<password>"
And user click on Continue button
Then user is navigated to "Therapists & Psychiatrists" page

Examples:
| email                    |    password|
|atelkalyani25@gmail.com  |Kallu@1234|
