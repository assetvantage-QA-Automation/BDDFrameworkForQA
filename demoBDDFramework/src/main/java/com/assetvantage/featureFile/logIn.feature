Feature: Login to Asset Vantage portal


Scenario Outline: Verify that user is able to login to portal

Given user is on login page
When user throws "<userName>" and "<password>" and click on Login button
Then Asset Vantage home page is displayed

Examples:
  |userName           | password|
  |ravi.prakash         |user@123|  