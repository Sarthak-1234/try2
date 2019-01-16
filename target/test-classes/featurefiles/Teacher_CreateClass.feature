Feature: Creation of CLASS through Teacher
Scenario Outline: Verification of class creation

Given Launch URL for Login
When Login in the application with "<emailid>" and "<password>"
When click on BrowserSite dropdown
And click on Davis Edge
And It should open Davis Edge in new window
And Click on Rudd Title
And Click on Add Button
And Enter Class Title
And Enter Class Description
And Click for Auto Enroll checkbox
And Click on Create Class button
Then It should display Class Created Alert



Examples:
|emailid|password|
|vandanasharma@qainfotech.com|password|