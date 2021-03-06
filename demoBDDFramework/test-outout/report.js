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
  "line": 7,
  "name": "user Clicks on menu - General Ledger and clicks on Balance Sheet",
  "keyword": "Given "
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
  "name": "All Equities and Liabilities are displayed on page",
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
        "filePath"
      ],
      "line": 14,
      "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-balancesheet-report-with-given-json-data;;1"
    },
    {
      "cells": [
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
  "line": 7,
  "name": "user Clicks on menu - General Ledger and clicks on Balance Sheet",
  "keyword": "Given "
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
  "name": "All Equities and Liabilities are displayed on page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User verify the details with given JSON \"C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.navigateToWealthRegister()"
});
formatter.result({
  "duration": 304038686,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.verifyWealthRegisterPage()"
});
formatter.result({
  "duration": 14085671,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.searchForReport()"
});
formatter.result({
  "duration": 10955480895,
  "status": "passed"
});
formatter.match({
  "location": "balanceSheetVerification_Assetvantage.detailedReportIsDisplayed()"
});
formatter.result({
  "duration": 93216525,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cbutton class\u003d\"tbl-expand pull-left\" title\u003d\"Expand All\" id\u003d\"btnExpandAll\"\u003e...\u003c/button\u003e is not clickable at point (42, 107). Other element would receive the click: \u003cdiv class\u003d\"modalloader\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-CIM2M57\u0027, ip: \u0027172.18.4.49\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.44.609538 (b655c5a60b0b54..., userDataDir: C:\\Users\\partha.das\\AppData...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:58151}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 0b5bbb6fcd5fb90feb33034acc600792\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy12.click(Unknown Source)\r\n\tat com.assetvantage.pageObjectClass.balanceSheetPage.expandTheReport(balanceSheetPage.java:146)\r\n\tat com.assetvantage.StepDefination.balanceSheetVerification_Assetvantage.detailedReportIsDisplayed(balanceSheetVerification_Assetvantage.java:60)\r\n\tat ✽.Then All Equities and Liabilities are displayed on page(balanceSheetVerification.feature:10)\r\n",
  "status": "failed"
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
  "duration": 342951085,
  "status": "passed"
});
formatter.after({
  "duration": 332584589,
  "status": "passed"
});
formatter.after({
  "duration": 385988939,
  "status": "passed"
});
formatter.after({
  "duration": 319806482,
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
  "description": "",
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
  "line": 7,
  "name": "user navigates to menu- master - accounts",
  "keyword": "Given "
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
  "description": "",
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
  "line": 7,
  "name": "user navigates to menu- master - accounts",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "verify that user is able to create account",
  "keyword": "Then "
});
formatter.match({
  "location": "createAnAccount_Assetvantage.user_navigates_to_menu_master_accounts()"
});
formatter.result({
  "duration": 78186144,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca id\u003d\"hamburgerslidingmenu\" href\u003d\"\" data-toggle\u003d\"hamburger\" data-target\u003d\"#sliding-menu\"\u003e...\u003c/a\u003e is not clickable at point (1304, 21). Other element would receive the click: \u003cdiv class\u003d\"modalloader\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-CIM2M57\u0027, ip: \u0027172.18.4.49\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.44.609538 (b655c5a60b0b54..., userDataDir: C:\\Users\\partha.das\\AppData...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:58151}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 0b5bbb6fcd5fb90feb33034acc600792\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy12.click(Unknown Source)\r\n\tat com.assetvantage.pageObjectClass.homePageCommon.clickonMenubutton(homePageCommon.java:181)\r\n\tat com.assetvantage.pageObjectClass.homePageCommon.clickOnMenuThenClickOnMaster(homePageCommon.java:190)\r\n\tat com.assetvantage.StepDefination.createAnAccount_Assetvantage.user_navigates_to_menu_master_accounts(createAnAccount_Assetvantage.java:33)\r\n\tat ✽.Given user navigates to menu- master - accounts(createAccount.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "createAnAccount_Assetvantage.verify_that_user_is_able_to_create_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 313500496,
  "status": "passed"
});
formatter.after({
  "duration": 309188140,
  "status": "passed"
});
formatter.after({
  "duration": 288862559,
  "status": "passed"
});
formatter.after({
  "duration": 275168439,
  "status": "passed"
});
formatter.uri("wealthRegisterVerification.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the details with JSON which are displayed on wealth register page.",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify that user successfully verify the wealth register report with given JSON data",
  "description": "",
  "id": "verify-the-details-with-json-which-are-displayed-on-wealth-register-page.;verify-that-user-successfully-verify-the-wealth-register-report-with-given-json-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user clicks on menu - analytics and clicks on wealth register",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "wealth register page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user search the details by entering correct entity and date and clicked on process",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "All Denominated Assets are displayed on page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user verify the details with given JSON",
  "keyword": "Then "
});
formatter.match({
  "location": "wealthRegisterVerification_Assetvantage.navigateToWealthRegister()"
});
formatter.result({
  "duration": 47695696,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca id\u003d\"hamburgerslidingmenu\" href\u003d\"\" data-toggle\u003d\"hamburger\" data-target\u003d\"#sliding-menu\"\u003e...\u003c/a\u003e is not clickable at point (1304, 21). Other element would receive the click: \u003cdiv class\u003d\"modalloader\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-CIM2M57\u0027, ip: \u0027172.18.4.49\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.44.609538 (b655c5a60b0b54..., userDataDir: C:\\Users\\partha.das\\AppData...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:58151}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 0b5bbb6fcd5fb90feb33034acc600792\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy12.click(Unknown Source)\r\n\tat com.assetvantage.pageObjectClass.homePageCommon.clickonMenubutton(homePageCommon.java:181)\r\n\tat com.assetvantage.pageObjectClass.homePageCommon.clickOnMenuThenClickOnAnalytics(homePageCommon.java:185)\r\n\tat com.assetvantage.StepDefination.wealthRegisterVerification_Assetvantage.navigateToWealthRegister(wealthRegisterVerification_Assetvantage.java:34)\r\n\tat ✽.Given user clicks on menu - analytics and clicks on wealth register(wealthRegisterVerification.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "wealthRegisterVerification_Assetvantage.verifyWealthRegisterPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "wealthRegisterVerification_Assetvantage.searchForReport()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "wealthRegisterVerification_Assetvantage.detailedReportIsDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "wealthRegisterVerification_Assetvantage.verifyReportWithJSON()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 300459592,
  "status": "passed"
});
formatter.after({
  "duration": 281931676,
  "status": "passed"
});
formatter.after({
  "duration": 281810094,
  "status": "passed"
});
formatter.after({
  "duration": 271612378,
  "status": "passed"
});
});