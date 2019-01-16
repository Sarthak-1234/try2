Feature: Check the Authenticity of the FADAVIS.COM website.

@Tablet
Scenario Outline: Check the authenticity using correct login credentials.
Given Launch URL for Login
When Click on Login/Join button
And Enter CorrectEmail "<email>"
And Enter CorrectPassword "<password>"
And Click on Login Button
Then Login is Successfull.
Examples:
|email|password|
|vandanasharma@qainfotech.com|password|

@Tablet
Scenario: Check the message displayed when incorrect email is used.
Given Launch URL for Login
When Click on Login/Join button
And Enter Incorrect Email ID
Then Application displays error message.

@Tablet
Scenario Outline: Confirm the presence of Alert, when incorrect password is used.
Given Launch URL for Login
When Click on Login/Join button
And Enter CorrectEmail "<email>"
And Enter Incorrect Password
And Click on Login Button
Then Alert message should be present about incorrect password
Examples:
|email|
|vandanasharma@qainfotech.com|

