Feature: Creation of CLASS through Teacher

@Run
Scenario Outline: Verification of Deletion of Class

Given Launch URL for Login
When Login in the application with "<emailid>" and "<password>"
When click on BrowserSite dropdown
And click on Davis Edge
And It should open Davis Edge in new window
And Click on Rudd Title
And click on settings icon
And click on Delete button 
Then confirm deletion pop-up opens up
And click on ok button
Then a confirmation pop-up appears

Examples:
|emailid|password|
|vandanasharma@qainfotech.com|password|