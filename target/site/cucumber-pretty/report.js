$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Featurefile/Transaction.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User selects an EMI tenure",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "name": "user have the url, mobile number and broswer name \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_have_the_url_and_mobile_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user landed to Screenone",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_landed_to_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send mobile number as \"9988998899\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_send_mobile_number_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to validate mobile number and reach to screenTitle",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_have_to_validate_mobile_number_and_reach_to_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the EMI tenure",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_select_the_EMI_tenure()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the confirm",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.click_on_the_confirm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will reach to Transaction confirmation window",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_will_reach_to_Transaction_confirmation_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters last Four digits of their Debit card as \"1234\" and click on VerifyDebitCard details",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_enters_last_digits_of_their_Debit_card_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the OTP as \"777777\" and click on Term and conditions check box",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.enter_the_OTP_as_and_click_on_Term_and_conditions_check_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Verify and confirm button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.click_on_Verify_and_confirm_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will landed to Transaction details screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_will_landed_to_Transaction_details_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});