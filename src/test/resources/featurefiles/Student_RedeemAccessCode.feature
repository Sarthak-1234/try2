Feature: Check Access Codes

@Run
Scenario: Validation of Access Codes at Student end.

Given Launch URL for Login
When Click on Login/Join button
And Click on CREATE ACCOUNT button
And Enter Email Address
And Enter  Email Address To Confirm
And Enter Password
And Enter Confirmation Password To Confirm
And Enter First Name
And Enter Last Name
And Select Country
And Select Institute Name
And Select Your Program
And Select Your Graduation Year
And Click checkbox to deactivate the emails
And Click on Create Account
And Click Ok on Pop-Up
When click on BrowserSite dropdown
And click on Davis Edge
And It should open Davis Edge in new window
And Click on Purchase and Redeem Access Code link
And Enter Access Code
And Click on Reedeem Code button
Then It should display Success Pop-Up





