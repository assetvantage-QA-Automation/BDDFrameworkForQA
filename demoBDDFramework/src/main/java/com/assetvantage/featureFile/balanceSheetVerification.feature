Feature: Verify the details with JSON which are displayed on wealth register page.

@SmokeTest
Scenario Outline: Verify that user successfully verify the balanceSheet report with given JSON data


Given user Clicks on menu - General Ledger and clicks on Balance Sheet
Then Balance Sheet page is displayed
Then user Search the details by entering correct entity and date and clicked on process
Then All Equities and Liabilities are displayed on page 
Then User verify the details with given JSON "<filePath>"

Examples:
  |  filePath|
  |  C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json|