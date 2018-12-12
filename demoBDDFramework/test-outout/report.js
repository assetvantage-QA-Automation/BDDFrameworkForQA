$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/partha.das/git/BDDFrameworkForQA/demoBDDFramework/src/main/java/com/assetvantage/featureFile/balanceSheetVerification.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the details with JSON which are displayed on wealth register page.",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify that user successfully verify the balanceSheet report with given JSON data",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is logged into portal with \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Clicks on menu - General Ledger and clicks on Balance Sheet",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Balance Sheet page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user Search the details by entering correct entity and date and clicked on process",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "All  Equities and Liabilities are displayed on page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User verify the details with given JSON",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 13,
      "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data;;1"
    },
    {
      "cells": [
        "ravi.prakash",
        "user@123"
      ],
      "line": 14,
      "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Verify that user successfully verify the balanceSheet report with given JSON data",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is logged into portal with \"ravi.prakash\" and \"user@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Clicks on menu - General Ledger and clicks on Balance Sheet",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Balance Sheet page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user Search the details by entering correct entity and date and clicked on process",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "All  Equities and Liabilities are displayed on page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User verify the details with given JSON",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ravi.prakash",
      "offset": 33
    },
    {
      "val": "user@123",
      "offset": 52
    }
  ],
  "location": "balanceSheetVerification_Assetvantage.loginToPortal(String,String)"
});
formatter.result({
  "duration": 19796215809,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.navigateToWealthRegister()"
});
formatter.result({
  "duration": 205288474,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.verifyWealthRegisterPage()"
});
formatter.result({
  "duration": 9435369,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.searchForReport()"
});
formatter.result({
  "duration": 11095261774,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.detailedReportIsDisplayed()"
});
formatter.result({
  "duration": 3672493873,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.verifyReportWithJSON()"
});
formatter.result({
  "duration": 20767,
  "status": "passed"
});
});