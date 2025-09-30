Feature: User have to verify signup functionality in facebook application

Scenario Outline: To validate the login by using different credentials

Given user have to open the facebook signup page in chrome browser
When user have to pass the "<username>" and "<password>"
And user have to get the page title
And user have to click login button
Then user have to close the browser

Examples:
|username|password|
|abiabinaya@gmail.com|abi@123|
|infosys@gmail.com|info@123|
|tcs1234@gmail.com|tcs345|