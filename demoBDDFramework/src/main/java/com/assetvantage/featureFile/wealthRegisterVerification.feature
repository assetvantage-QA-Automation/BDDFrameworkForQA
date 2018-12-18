Feature: Verify the details with JSON which are displayed on wealth register page.


@SmokeTest
Scenario: Verify that user successfully verify the wealth register report with given JSON data


Given user clicks on menu - analytics and clicks on wealth register
Then wealth register page is displayed
Then user search the details by entering correct entity and date and clicked on process
Then All Denominated Assets are displayed on page 
Then user verify the details with given JSON

