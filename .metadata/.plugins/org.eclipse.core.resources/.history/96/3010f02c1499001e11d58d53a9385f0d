Feature: Application Login

// background is executed for every scenario to take out repetition 
Background: 
  	Given setup the entries in the database 
  	When launch the browser from config variables 
  	And hit the home page url of banking site 

@RegressionTest
  Scenario: Admin Page default login
    Given User is on NetBanking landing page
    When User logins into application with "admin" and password "1234"
    Then Homepage is displayed
    And Cards are displayed

@MobileTest
  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User logins into application with "user" and password "0953"
    Then Homepage is displayed
    And Cards are displayed

@SmokeTest @RegressionTest
  Scenario Outline: Mortgage Page default login 
    Given User is on NetBanking landing page
    When User logins into application with "<Username>" and password "<Password>"
    Then Homepage is displayed
    And Cards are displayed

    Examples: 
      | Username   | Password |
      | debituser  | hello12  |
      | credituser | lpo213   |

@SmokeTest
  Scenario: Practice page signup
    Given User is on Practice landing page
    When User signup into application
      | jacob                        |
      | bratcher                     |
      | jacobwbratcherjunk@gmail.com |
      |                   5021231234 |
    Then Homepage is displayed
    And Cards are displayed
