@LoginFeature
Feature: Login Feature
  
  Description: This feature will be used to login to Simplilearn Application

  @PositiveLogin 
  Scenario Outline: Verify that when use enters correct username and password they should able to login successfully
    Given User has opened the Simpplilearn Application
    When Click on the login button link
    And User enter the correct username "<Username>"
    And User enter the correct password  "<Password>"
    And User click on login button
    Then User should be navigated to next page successfully

    Examples: 
      | Username     | Password |
      | abcd@xyz.com | abdc     |
      | xyzf@xyz.com | xyvc     |

  @NegativeLogin @Sanity
  Scenario Outline: Verify that when use enters correct username and password they should able to login successfully
    Given User has opened the Simpplilearn Application
    When Click on the login button link
    And User enter the correct username "<Username>"
    And User enter the correct password  "<Password>"
    And User click on login button
    Then User should be navigated to next page successfully

    Examples: 
      | Username     | Password |
      | rtyc@xyz.com | abdc     |
     
