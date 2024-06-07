Feature: LoginTest2

  Scenario: Login Sucesfully
    Given the user in on the login page
    When the user enter valid username and valid password
    And click the login button
    Then the user should be logged in successfully with title 
    And should be redirectly to the dashboard

 Scenario: Login unSucesfully
    Given the user in on the login page
    When the user enter invalid username and invalid password
    And click the login button
    Then the user should see the error msg
    And should not be logged in

