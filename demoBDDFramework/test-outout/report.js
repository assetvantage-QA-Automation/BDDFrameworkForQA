$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/partha.das/git/BDDFrameworkForQA/demoBDDFramework/src/main/java/com/assetvantage/featureFile/wealthRegisterVerification.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the details with JSON which are displayed on wealth register page.",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify that user successfully verify the wealth register report with given JSON data",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-wealth-register-report-with-given-json-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user logs into portal with \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on menu - analytics and clicks on wealth register",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "wealth register page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user search the details by entering correct entity and date and clicked on process",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "All Denominated Assets are displayed on page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user verify the details with given JSON",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-wealth-register-report-with-given-json-data;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 13,
      "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-wealth-register-report-with-given-json-data;;1"
    },
    {
      "cells": [
        "ravi.prakash",
        "user@123"
      ],
      "line": 14,
      "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-wealth-register-report-with-given-json-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Verify that user successfully verify the wealth register report with given JSON data",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-wealth-register-report-with-given-json-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user logs into portal with \"ravi.prakash\" and \"user@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on menu - analytics and clicks on wealth register",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "wealth register page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user search the details by entering correct entity and date and clicked on process",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "All Denominated Assets are displayed on page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user verify the details with given JSON",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ravi.prakash",
      "offset": 28
    },
    {
      "val": "user@123",
      "offset": 47
    }
  ],
  "location": "wealthRegisterVerification_Assetvantage.loginToPortal(String,String)"
});
formatter.result({
  "duration": 14780106319,
  "status": "passed"
});
formatter.match({
  "location": "wealthRegisterVerification_Assetvantage.navigateToWealthRegister()"
});
formatter.result({
  "duration": 269305429,
  "status": "passed"
});
formatter.match({
  "location": "wealthRegisterVerification_Assetvantage.verifyWealthRegisterPage()"
});
formatter.result({
  "duration": 7470060,
  "status": "passed"
});
formatter.match({
  "location": "wealthRegisterVerification_Assetvantage.searchForReport()"
});
formatter.result({
  "duration": 1358951443,
  "status": "passed"
});
formatter.match({
  "location": "wealthRegisterVerification_Assetvantage.detailedReportIsDisplayed()"
});
formatter.result({
  "duration": 9091907724,
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 0, Size: 0\r\n\tat java.util.ArrayList.rangeCheck(Unknown Source)\r\n\tat java.util.ArrayList.get(Unknown Source)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler.invoke(LocatingElementListHandler.java:39)\r\n\tat com.sun.proxy.$Proxy21.get(Unknown Source)\r\n\tat com.assetvantage.pageObjectClass.wealthRegisterPage.expandTheReport(wealthRegisterPage.java:178)\r\n\tat com.assetvantage.StepDefination.wealthRegisterVerification_Assetvantage.detailedReportIsDisplayed(wealthRegisterVerification_Assetvantage.java:68)\r\n\tat ✽.Then All Denominated Assets are displayed on page(C:/Users/partha.das/git/BDDFrameworkForQA/demoBDDFramework/src/main/java/com/assetvantage/featureFile/wealthRegisterVerification.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "wealthRegisterVerification_Assetvantage.verifyReportWithJSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 346186565,
  "status": "passed"
});
});