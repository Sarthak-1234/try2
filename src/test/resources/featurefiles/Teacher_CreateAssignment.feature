Feature: Creation of CLASS through Teacher

@Run
Scenario Outline: Verification of assignment creation

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
And Click on Continue To Success Center
And Click on Manage Classes
And Click on Create Assignment
And Enter Assignment Name
And Click on Create Quick Assignment button
And Select Course Topic
And Click on Continue button
And Click on Save & Exit button
Then Verify it should display Assignment under Assignment Grades

Examples:
|emailid|password|
|vandanasharma@qainfotech.com|password|