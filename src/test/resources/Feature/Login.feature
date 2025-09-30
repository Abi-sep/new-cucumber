@login
Feature: User have to validate the login functionality with facebook application

Scenario: User have to validate the valid username and invalid password in login functionality 
When  User have to Pass the Valid username and invalid password
And user have to get the page title
And User have to click login button


Scenario: User have to validate the invalid username and invalid password in login functionality 
When  User have to Pass the inValid username and invalid password
And user have to get the page title
And User have to click login button

Scenario: User have to validate the invalid username and valid password in login functionality 
When  User have to Pass the inValid username and valid password
And user have to get the page title
And User have to click login button

