package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageLocators.LoginPageLocators;
import com.utility.Waitlib;

public class LoginPage implements LoginPageLocators{
	
	public WebDriver driver;
	@FindBy(xpath = mobilenumber)
	WebElement mobilenumberele;
	@FindBy(xpath=continuebutton)
	WebElement continuebuttonele;
	@FindBy(xpath=selectEmi)
	WebElement selectEmiele;
	@FindBy(xpath=confirmbutton)
	WebElement confirmbuttonele;
	@FindBy(xpath = Enterlastdigit)
	WebElement Enterlastdigitele;
	@FindBy(xpath=verifydebitcrd)
	WebElement verifydebitcrdele;
	@FindBy(xpath=enterOtp)
	WebElement enterOtpele;
	@FindBy(xpath=termsChkBox)
	WebElement termsChkBoxele;
	@FindBy(xpath=verifysubmit)
	WebElement verifysubmitele;
	@FindBy(xpath=gettext)
	WebElement gettextele;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	
	public void sendmobilenumber(String number) {
		mobilenumberele.sendKeys(number);
		
		
	}
	public String getUrl() {
		String url=driver.getCurrentUrl();
		return  url;
	}
public void clickContinue() {
	continuebuttonele.click();
	
}

public String getscreentitle() {
	String title = driver.getTitle();
	return title;
	
}
 public void selectEmiOpt() {
	 selectEmiele.click();
 }
 public void clickconfirmbutton() {
	 confirmbuttonele.click();
	 Waitlib wait = new Waitlib(driver);
	 wait.iwait();
 }
 
 public void Transactionconfi(String lastdigit) {
	 Enterlastdigitele.sendKeys(lastdigit);
 }
 
 public void clickverifydebitcrd() {
	 verifydebitcrdele.click();
 }
 
 public void EnterOtpopt(String otp) {
	 enterOtpele.sendKeys(otp);
	 termsChkBoxele.click();
 }
 public void validAndSubmit() {
	 verifysubmitele.click();
 }
 
 public String gettext() {
	String textvalue= gettextele.getText();
	return textvalue;
 }
 


}

