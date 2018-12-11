$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/EclipseWorkspace/demoBDDFramework/src/main/java/com/assetvantage/featureFile/logIn.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Asset Vantage portal",
  "description": "",
  "id": "login-to-asset-vantage-portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify that user is able to login to portal",
  "description": "",
  "id": "login-to-asset-vantage-portal;verify-that-user-is-able-to-login-to-portal",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user throws \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\" and click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Asset Vantage home page is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-to-asset-vantage-portal;verify-that-user-is-able-to-login-to-portal;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 10,
      "id": "login-to-asset-vantage-portal;verify-that-user-is-able-to-login-to-portal;;1"
    },
    {
      "cells": [
        "ravi.prakash",
        "user@123"
      ],
      "line": 11,
      "id": "login-to-asset-vantage-portal;verify-that-user-is-able-to-login-to-portal;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Verify that user is able to login to portal",
  "description": "",
  "id": "login-to-asset-vantage-portal;verify-that-user-is-able-to-login-to-portal;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user throws \"ravi.prakash\" and \"user@123\" and click on Login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Asset Vantage home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "loginTo_AssetVantage.gotoLoginPage()"
});
formatter.result({
  "duration": 12497050144,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravi.prakash",
      "offset": 13
    },
    {
      "val": "user@123",
      "offset": 32
    }
  ],
  "location": "loginTo_AssetVantage.loginWithCredentials(String,String)"
});
formatter.result({
  "duration": 97845332,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"username\"}\n  (Session info: chrome\u003d71.0.3578.80)\n  (Driver info: chromedriver\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90),platform\u003dWindows NT 10.0.17133 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-CIM2M57\u0027, ip: \u0027192.168.60.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.44.609538 (b655c5a60b0b54..., userDataDir: C:\\Users\\partha.das\\AppData...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:65280}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.80, webStorageEnabled: true}\nSession ID: 25e437191c3e8db44b458cd92fd66462\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat com.assetvantage.pageObjectClass.logInPage.loginToApp(logInPage.java:65)\r\n\tat com.assetvantage.StepDefination.loginTo_AssetVantage.loginWithCredentials(loginTo_AssetVantage.java:36)\r\n\tat ✽.When user throws \"ravi.prakash\" and \"user@123\" and click on Login button(D:/EclipseWorkspace/demoBDDFramework/src/main/java/com/assetvantage/featureFile/logIn.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "loginTo_AssetVantage.verifyPageName()"
});
formatter.result({
  "status": "skipped"
});
});