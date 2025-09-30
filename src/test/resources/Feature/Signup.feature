@Signup
Feature: User have to verify signup functionality in facebook application.
Scenario: user have to enter validate valid details in signup fuctionality
Given user have to open the facebook signup page in chrome browser
When user have to enter firstname,lastname,email,password
|firstname|lastname|email|password|
|abi|rk|abirk@gmail.com|abi1234|
And user have to select gender
|female| 
And user have to select date of birth
|29|Jul|1994|
Then Take screenshot
Then user have to close the browser