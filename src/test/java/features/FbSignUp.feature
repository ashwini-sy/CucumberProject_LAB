@LoginFeature
Feature: FB -creating new Account
  
  Description: This feature will be used to create a new acccount in FB
Scenario Outline: Verify that user created a new acccount in FB successfully

  Given  User has opened the FB Application
    When Clcik onCreate new Acccount
   And User enter the correct firstname "<Firstname>"
    And User enter the correct lastname  "<Lastname>"
    And User enter the  Mobilenumber "<Mblnumber>"
    And User enter the  New Password "<Password>"
    And User select the date "<Date>"
    And User select the Month "<Month>"
    And User select the Year "<Year>"
    And User select the Gender "<Gender>"
    And User click on Signup button
      Then User should be Able to create new account  successfully

    Examples: 
      |Firstname|Lastname|Mblnumber|Password|Date|Month|Year|Gender|
      | Abcd    | xyz    |9999999999|axtghy|23|Jul|2000|Female|
      
      
   
 
     
