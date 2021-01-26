package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitlib {
	 final static long sec = 60;
	public static WebDriver driver;
	public Waitlib(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public static void iwait() {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		
	}
	
	public static void ewait(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void elementclickwait(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	
	public static void framevisibility(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(null, sec);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
	}

}
