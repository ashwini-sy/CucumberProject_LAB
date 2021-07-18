Feature: Home page  Featue

  Background: 
    Given User has opened the Simpplilearn Application
    When User enter the correct username "<Username>"
    And User enter the correct password  "<Password>"
    And User click on login button

  Scenario Outline: Verify the user able to Home Page successfully
    Given User open the simplilearn application
    When user able to see the login page
    Then User able to see the home page
