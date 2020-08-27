#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login test for the AutomationPractice Application

  Scenario Outline: testing of Login for the AutomationPractice Application
    Given User pass the Application Url
    When Username as "<username>" and password as "<password>"
    Then User should be able to login to the Application and the "<name>" should appear in the username link

    Examples: 
      | username        | password   | name       |
      | abc@outlook.com | abhishek14 | Abhi Kumar |
