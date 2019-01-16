Feature: Creation of CLASS through Teacher

@Smoke
Scenario Outline: Verification of assignment creation

Given Launch URL for Login
When Login in the application with "<emailid>" and "<password>"
When click on BrowserSite dropdown
And click on Davis Edge
And It should open Davis Edge in new window
And Click on Rudd Title

Examples:
|email|password|
|vandanasharma@qainfotech.com|password|