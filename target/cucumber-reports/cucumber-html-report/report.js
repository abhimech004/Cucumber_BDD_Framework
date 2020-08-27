$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "Login test for the AutomationPractice Application",
  "description": "",
  "id": "login-test-for-the-automationpractice-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "testing of Login for the AutomationPractice Application",
  "description": "",
  "id": "login-test-for-the-automationpractice-application;testing-of-login-for-the-automationpractice-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "User pass the Application Url",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User should be able to login to the Application and the \"\u003cname\u003e\" should appear in the username link",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "login-test-for-the-automationpractice-application;testing-of-login-for-the-automationpractice-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "name"
      ],
      "line": 27,
      "id": "login-test-for-the-automationpractice-application;testing-of-login-for-the-automationpractice-application;;1"
    },
    {
      "cells": [
        "abc@outlook.com",
        "abhishek14",
        "Abhi Kumar"
      ],
      "line": 28,
      "id": "login-test-for-the-automationpractice-application;testing-of-login-for-the-automationpractice-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9116838600,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "testing of Login for the AutomationPractice Application",
  "description": "",
  "id": "login-test-for-the-automationpractice-application;testing-of-login-for-the-automationpractice-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "User pass the Application Url",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Username as \"abc@outlook.com\" and password as \"abhishek14\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User should be able to login to the Application and the \"Abhi Kumar\" should appear in the username link",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "login_Step_Definition.user_pass_the_Application_Url()"
});
formatter.result({
  "duration": 705075600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@outlook.com",
      "offset": 13
    },
    {
      "val": "abhishek14",
      "offset": 47
    }
  ],
  "location": "login_Step_Definition.username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 86981968900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abhi Kumar",
      "offset": 57
    }
  ],
  "location": "login_Step_Definition.user_should_be_able_to_login_to_the_AutomationPractice_Application_and_the_should_appear_in_the_username_link(String)"
});
formatter.result({
  "duration": 1787164200,
  "status": "passed"
});
formatter.after({
  "duration": 780885000,
  "status": "passed"
});
});