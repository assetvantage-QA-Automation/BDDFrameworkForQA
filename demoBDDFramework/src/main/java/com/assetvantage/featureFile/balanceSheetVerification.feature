Feature: Verify the details with JSON which are displayed on wealth register page.

Scenario Outline: Verify that user successfully verify the balanceSheet report with given JSON data

Given user is logged into portal with "<userName>" and "<password>"
When user Clicks on menu - General Ledger and clicks on Balance Sheet
Then Balance Sheet page is displayed
Then user Search the details by entering correct entity and date and clicked on process
Then All  Equities and Liabilities are displayed on page 
Then User verify the details with given JSON "<filePath>"

Examples:
  |userName             | password|  filePath|
  |ravi.prakash         |user@123|  C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json|