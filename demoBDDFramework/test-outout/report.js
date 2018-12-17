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
  "duration": 6236186543,
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
  "duration": 4820407698,
  "status": "passed"
});
formatter.match({
  "location": "loginTo_AssetVantage.verifyPageName()"
});
formatter.result({
  "duration": 14221622,
  "status": "passed"
});
formatter.after({
  "duration": 81935,
  "status": "passed"
});
formatter.after({
  "duration": 53994,
  "status": "passed"
});
formatter.after({
  "duration": 42667,
  "status": "passed"
});
formatter.after({
  "duration": 60791,
  "status": "passed"
});
});