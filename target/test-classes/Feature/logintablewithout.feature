Feature: User have to validate the login functionality with facebook application
Background:
Given  User have to Open the Facebook Application Through Chrome Browser

Scenario: User have to validate the valid username and invalid password in login functionality 
When  User have to Pass the Valid username and invalid password
|abinaya@gmail.com|abi@123|info@gmail.com|info|capgemini@gmail.com|cap123|
And User have to click login button
Then User have to close the browser

Scenario: User have to validate the invalid username and invalid password in login functionality 
When  User have to Pass the inValid username and invalid password
|smartskills@gmail.com|smart123|
|cap@gmail.com|cap1233|
|infosys@gmail.com|info1234|
And User have to click login button
Then User have to close the browser

Scenario: User have to validate the invalid username and valid password in login functionality 
When  User have to Pass the Valid username and invalid password
And User have to click login button
Then User have to close the browser
