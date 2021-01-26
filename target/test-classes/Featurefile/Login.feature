

Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Validate the mobile number(postive)
    Given user have the url, mobile number and broswer name "chrome"
    When user landed to Screenone
    And user send mobile number as "9988998899"
    Then user have to validate mobile number and reach to screenTitle
    


@tag2
 Scenario: Validate the mobile number(nagative)
    Given user have the url, mobile number and broswer name "chrome"
    When user landed to Screenone
    And user send mobile number as "99889988"
    Then user have to invalidate mobile number by checking invalidscreen
    
  
