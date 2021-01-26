
Feature: Title of your feature
  I want to use this template for my feature file
  @tag3
 
  Scenario: User selects an EMI tenure
    Given user have the url, mobile number and broswer name "chrome"
    And user landed to Screenone
    When user send mobile number as "9988998899"
    And user have to validate mobile number and reach to screenTitle 
    Then user select the EMI tenure
    And click on the confirm
   Then user will reach to Transaction confirmation window
   
   @tag4
   
 
Scenario: User selects an EMI tenure
    Given user have the url, mobile number and broswer name "chrome"
    And user landed to Screenone
    When user send mobile number as "9988998899"
    And user have to validate mobile number and reach to screenTitle 
    Then user select the EMI tenure
    And click on the confirm
   Then user will reach to Transaction confirmation window
   And User enters last Four digits of their Debit card as "1234" and click on VerifyDebitCard details
   Then Enter the OTP as "777777" and click on Term and conditions check box
   And click on Verify and confirm button
   Then user will landed to Transaction details screen
