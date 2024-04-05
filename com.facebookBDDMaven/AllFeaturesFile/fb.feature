Feature: Test Facebook Application

  @Register
  Scenario: Test Facebook Functionality
    Given user open a "chrome" browser
    And user will be on facebook register page
    When user enter valid "sandhya" , "biradar" , "sandhya@gmail.com" , "sandhya@123" ,
    And user select "19", "Feb" , "1996" and select "Female" gender
