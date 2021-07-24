Feature: Fb SignUp Feature to validate the add new user functionality

  @DataTable
  Scenario: Verify that user is able to create the new account using cucumber datatable
    Given User should launch the FB application
    When User clicks on the Create New Account Link
    And User creates the new account in FB
      | Field      | Value      |
      | FirstNaame | Raj        |
      | LastName   | Sharma     |
      | MobileNum  | 9999999999 |
      | Password   | abc@abc123 |
    And User click on the SignUp button
    Then user should be able to see the success message
