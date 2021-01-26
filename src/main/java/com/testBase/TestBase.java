package com.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	WebDriver driver ;
	
	public WebDriver setupBrowser(String brname) {
	
	
	switch (brname) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver();
		driver = new FirefoxDriver();
		break;
	case "IE":
		WebDriverManager.iedriver();
		driver = new InternetExplorerDriver();
		break;
	default:
		break;
	}
	

	driver.get("https://staging.instacred.me/simulation/tpsl/e2e-transaction.jsp");
	driver.manage().window().maximize();
	
	return driver;
	}
	
	
	
	public void tearDown(WebDriver driver) {
		driver.quit();
		
	}
	}


