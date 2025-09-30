Feature: User have to verify signup functionality in facebook application
Scenario Outline: To validate the signup by using different credentials
#Given user have to open the facebook signup page in chrome browser
When user have to pass the "<firstname>" "<lastname>" "<date>" "<month>" "<year>" "<email>" and "<password>"
And user have to get the page title
#Then user have to close the browser

Examples:
|firstname|lastname|date|month|year|email|password|
|abi|rk|29|Jul|1994|abinayark@gmail.com|rk1234|