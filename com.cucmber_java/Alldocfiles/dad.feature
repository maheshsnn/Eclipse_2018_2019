
@smoketests
Feature: Login to gmail
Scenario: login with valid credentials into gmail
 Given Open gmail and start application
  When  Entered username and password
  |mahesh|
 Then  usershould be able to login into gmail


  