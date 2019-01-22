#Each feature contains one feature
#Feature file uses Gherkin language- Business language
Feature: Test the login fucntionality on sdet university

#A feature may have given different specific scenarios
#Scenarios use Given-When-Then structure
Scenario: the user should be able to login with correct username and correct password


Given user is on the login page
When user enters correct username and correct password
Then user gets confirmation