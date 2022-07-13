Feature:  Test case User login

  Scenario: User is able to login with valid credentials

    Given User enters valid username into the username field
    And User enters valid password into the password field
    When User clicks on the login button
    Then User is logged in successfully

  Scenario: User is not able to login with invalid credentials

    Given User enters invalid username into the username field
    And User enters invalid password into the password field
    When User clicks on the login button
    Then User is not logged in successfully