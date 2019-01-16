Feature: Check BrowserSite and navigation to other products

@Tablet
Scenario Outline: Check the product navigation through FADAVIS.COM
Given Launch URL for Login
When Login in the application with "<emailid>" and "<password>"
When click on BrowserSite dropdown
And click on KIA
Then it should open the new tab with title KIA
Examples:
|emailid|password|
|vandanasharma@qainfotech.com|password|


