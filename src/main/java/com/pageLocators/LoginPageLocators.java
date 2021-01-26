package com.pageLocators;

public interface LoginPageLocators{
	
 public final String mobilenumber = "//input[@id='CI']";
 public final String continuebutton = "//button[@id='continueBtn']";
 public final String selectEmi="//input[@id='1001010'and @type='radio']";
 public final String confirmbutton = "//button[@id='submitButton']";
 public final String Enterlastdigit="//input[@id='accountNo' and @placeholder = 'Enter Last 4 digits']";
 public final String verifydebitcrd="//button[@id='submitButton' and contains(text(),'Verify Debit Card')]";
 public final String enterOtp="//input[@placeholder='Enter OTP']";
 public final String termsChkBox ="//input[@id='instacredTncCheckbox']";
 public final String verifysubmit="//div[@class='genericButtonContainer']";
 public final String gettext= "//h1";
}
