$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("balanceSheetVerification.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the details with JSON which are displayed on wealth register page.",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify that user successfully verify the balanceSheet report with given JSON data",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is logged into portal with \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Clicks on menu - General Ledger and clicks on Balance Sheet",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Balance Sheet page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user Search the details by entering correct entity and date and clicked on process",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "All  Equities and Liabilities are displayed on page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User verify the details with given JSON \"\u003cfilePath\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
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
      "line": 14,
      "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data;;1"
    },
    {
      "cells": [
        "ravi.prakash",
        "user@123",
        "C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json"
      ],
      "line": 15,
      "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Verify that user successfully verify the balanceSheet report with given JSON data",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is logged into portal with \"ravi.prakash\" and \"user@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Clicks on menu - General Ledger and clicks on Balance Sheet",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Balance Sheet page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user Search the details by entering correct entity and date and clicked on process",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "All  Equities and Liabilities are displayed on page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
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
  "duration": 5134614542,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.navigateToWealthRegister()"
});
formatter.result({
  "duration": 216617279,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.verifyWealthRegisterPage()"
});
formatter.result({
  "duration": 8862211,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.searchForReport()"
});
formatter.result({
  "duration": 10988555509,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.detailedReportIsDisplayed()"
});
formatter.result({
  "duration": 239901209,
  "status": "passed"
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
  "duration": 3248397922,
  "status": "passed"
});
formatter.after({
  "duration": 166136,
  "status": "passed"
});
formatter.after({
  "duration": 51729,
  "status": "passed"
});
formatter.after({
  "duration": 66077,
  "status": "passed"
});
formatter.after({
  "duration": 16991,
  "status": "passed"
});
formatter.uri("createAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Create an account in Assetvantage portal",
  "description": "",
  "id": "create-an-account-in-assetvantage-portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify that user is able to create an account",
  "description": "Before",
  "id": "create-an-account-in-assetvantage-portal;verify-that-user-is-able-to-create-an-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is able to login with \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user navigates to menu- master - accounts",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify that user is able to create account",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "create-an-account-in-assetvantage-portal;verify-that-user-is-able-to-create-an-account;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 11,
      "id": "create-an-account-in-assetvantage-portal;verify-that-user-is-able-to-create-an-account;;1"
    },
    {
      "cells": [
        "ravi.prakash",
        "user@123"
      ],
      "line": 12,
      "id": "create-an-account-in-assetvantage-portal;verify-that-user-is-able-to-create-an-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Verify that user is able to create an account",
  "description": "Before",
  "id": "create-an-account-in-assetvantage-portal;verify-that-user-is-able-to-create-an-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is able to login with \"ravi.prakash\" and \"user@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user navigates to menu- master - accounts",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify that user is able to create account",
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
  "location": "createAnAccount_Assetvantage.user_is_able_to_login(String,String)"
});
formatter.result({
  "duration": 4060280105,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"username\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-CIM2M57\u0027, ip: \u0027172.18.4.49\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.44.609538 (b655c5a60b0b54..., userDataDir: C:\\Users\\partha.das\\AppData...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51960}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: fd611a4d0c21148c653d9e3c2ecfa9d9\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat com.assetvantage.pageObjectClass.logInPage.loginToApp(logInPage.java:65)\r\n\tat com.assetvantage.StepDefination.createAnAccount_Assetvantage.user_is_able_to_login(createAnAccount_Assetvantage.java:35)\r\n\tat ✽.Given user is able to login with \"ravi.prakash\" and \"user@123\"(createAccount.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "createAnAccount_Assetvantage.user_navigates_to_menu_master_accounts()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "createAnAccount_Assetvantage.verify_that_user_is_able_to_create_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 370312517,
  "status": "passed"
});
formatter.after({
  "duration": 357316167,
  "status": "passed"
});
formatter.after({
  "duration": 338160710,
  "status": "passed"
});
formatter.after({
  "duration": 379214374,
  "status": "passed"
});
});