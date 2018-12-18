Feature: Create an account in Assetvantage portal

@SmokeTest
Scenario Outline: Verify that user is able to create an account


Given user navigates to menu- master - accounts
Then verify that user is able to create account

Examples:
  |userName             | password|
  |ravi.prakash         |user@123|  