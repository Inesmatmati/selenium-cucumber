package com.e2eTest.automation.utils;



import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	protected WebDriver driver;
	protected static Logger Log = LogManager.getLogger();
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(Setup.getDriver(), this);
		
		
		
		
		
		
	}
	
	
}
