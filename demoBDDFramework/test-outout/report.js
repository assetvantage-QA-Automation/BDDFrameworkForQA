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
  "name": "User verify the details with given JSON \"\u003cfilePath\u003e\"",
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
        "password",
        "filePath"
      ],
      "line": 13,
      "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data;;1"
    },
    {
      "cells": [
        "ravi.prakash",
        "user@123",
        "C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json"
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
  "name": "User verify the details with given JSON \"C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json\"",
  "matchedColumns": [
    2
  ],
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
  "duration": 133013220,
  "error_message": "org.openqa.selenium.NoSuchElementException: No such element (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-CIM2M57\u0027, ip: \u0027172.18.4.49\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.edge.EdgeDriver\nCapabilities {InPrivate: false, acceptSslCerts: true, applicationCacheEnabled: true, browserName: MicrosoftEdge, browserVersion: 42.17134.1.0, javascriptEnabled: true, locationContextEnabled: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10, takesElementScreenshot: true, takesScreenshot: true, webStorageEnabled: true}\nSession ID: 178545DF-6D8E-4A54-9711-78F0CC51F406\n*** Element info: {Using\u003dname, value\u003dpassword}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:400)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat com.assetvantage.pageObjectClass.logInPage.loginToApp(logInPage.java:67)\r\n\tat com.assetvantage.StepDefination.balanceSheetVerification_Assetvantage.loginToPortal(balanceSheetVerification_Assetvantage.java:34)\r\n\tat ✽.Given user is logged into portal with \"ravi.prakash\" and \"user@123\"(C:/Users/partha.das/git/BDDFrameworkForQA/demoBDDFramework/src/main/java/com/assetvantage/featureFile/balanceSheetVerification.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.navigateToWealthRegister()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.verifyWealthRegisterPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.searchForReport()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.detailedReportIsDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json",
      "offset": 41
    }
  ],
  "location": "balanceSheetVerification_Assetvantage.verifyReportWithJSON(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 168157736,
  "status": "passed"
});
formatter.after({
  "duration": 86576757,
  "status": "passed"
});
formatter.after({
  "duration": 85215576,
  "status": "passed"
});
formatter.after({
  "duration": 126690243,
  "status": "passed"
});
});