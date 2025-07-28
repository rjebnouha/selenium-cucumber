package com.automation.e2etests.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasePage {
	
	protected WebDriver driver ;
	protected static Logger log = LogManager.getLogger();
	
	public BasePage (WebDriver driver) {
		this.driver = driver ;
		PageFactory.initElements(driver,this);
	}

}
