package com.stepdef;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Pages.LoginPage;
import com.testBase.TestBase;
import com.utility.LoggerReports;
import com.utility.Waitlib;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	public static WebDriver driver;
	
	Logger log = LoggerReports.getLogger(LoginStepDef.class);
	
	LoginPage loginpage;
	Waitlib waitlib = new Waitlib(driver);
	TestBase tb = new TestBase();
	
	@After
	public void closedriver() {
		//tb.tearDown(driver);
	}
	
	@Given("user have the url, mobile number and broswer name {string}")
	public void user_have_the_url_and_mobile_number(String brname) {
		
		driver = tb.setupBrowser(brname);
		log.info("Browser Open");
	}

	@When("user landed to Screenone")
	public void user_landed_to_Screen() {
	    
		loginpage = new LoginPage(driver);
		
		 String url=loginpage.getUrl();
		Assert.assertEquals("https://staging.instacred.me/simulation/tpsl/e2e-transaction.jsp", url);
		
	}

	@When("user send mobile number as {string}")
	public void user_send_mobile_number_as(String string) {
	    loginpage = new LoginPage(driver);
	    loginpage.sendmobilenumber(string);
	}

	@Then("user have to validate mobile number and reach to screenTitle")
	public void user_have_to_validate_mobile_number_and_reach_to_screen() {
		loginpage = new LoginPage(driver);
		loginpage.clickContinue();
		String title = loginpage.getscreentitle();
		Assert.assertEquals(title, "InstaCred Cardless EMI");
	   
	}
	@Then("user have to invalidate mobile number by checking invalidscreen")
	public void user_have_to_invalidate_mobile_number_by_checking_invalidscreen() {
	    
      loginpage=new LoginPage(driver);
      loginpage.clickContinue();
     String Url= loginpage.getUrl();
     if (Url.contains("enter-mobile")) {
    	 Assert.assertTrue(true);
		
	}
     else {
    	 Assert.fail();
    	 
     }
     }
	
	@Then("user select the EMI tenure")
	public void user_select_the_EMI_tenure() {
	    loginpage = new LoginPage(driver);
	    loginpage.selectEmiOpt();
	}

	@Then("click on the confirm")
	public void click_on_the_confirm() {
	    loginpage=new LoginPage(driver);
	    loginpage.clickconfirmbutton();
	}

	@Then("user will reach to Transaction confirmation window")
	public void user_will_reach_to_Transaction_confirmation_window() {
	    loginpage=new LoginPage(driver);
	    String Url=loginpage.getUrl();
	    if (Url.contains("payment")) {
	    	Assert.assertTrue(true);
			
		}
	    else {
	    	Assert.fail();
	    }
	}

	@Then("User enters last Four digits of their Debit card as {string} and click on VerifyDebitCard details")
	public void user_enters_last_digits_of_their_Debit_card_as(String lastdigit) {
	   loginpage=new LoginPage(driver);
	   loginpage.Transactionconfi(lastdigit);
	   loginpage.clickverifydebitcrd();
	}

	@Then("Enter the OTP as {string} and click on Term and conditions check box")
	public void enter_the_OTP_as_and_click_on_Term_and_conditions_check_box(String otp) {
		loginpage=new LoginPage(driver);
		loginpage.EnterOtpopt(otp);
		
	}

	@Then("click on Verify and confirm button")
	public void click_on_Verify_and_confirm_button() {
		loginpage = new LoginPage(driver);
		loginpage.validAndSubmit();
		waitlib.iwait();
		
	    
	}

	@Then("user will landed to Transaction details screen")
	public void user_will_landed_to_Transaction_details_screen() {
		loginpage=new LoginPage(driver);
		String textValue=loginpage.gettext();
      String expectedText="PG Payment Complete Page";
      
		
	Assert.assertEquals(textValue, expectedText);
		
		
      
	
}}
	


