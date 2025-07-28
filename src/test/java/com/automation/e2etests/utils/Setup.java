package com.automation.e2etests.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Setup {

	private static WebDriver driver;
	private static final Logger LOGGER = (Logger) LogManager.getLogger(Setup.class.getName());

	/**
	 * Static method to initialize WebDriver based on the browser
	 */
	@Before
	public void setWebDriver(Scenario scenario) {
		
LOGGER.info
("Scenario : " + scenario.getName() + " - started");
		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";
		}

		switch (browser) {
		case "chrome":
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("--start-maximized");
			chromeoptions.addArguments("--disable-search-engine-choice-screen");
			setDriver(new ChromeDriver(chromeoptions));
			break;

		case "firefox":
			FirefoxOptions firefoxoptions = new FirefoxOptions();
			firefoxoptions.setCapability("platform", Platform.WIN11);
			setDriver(new FirefoxDriver(firefoxoptions));
			break;

		case "edge":
			setDriver(new EdgeDriver());
			break;

		default:
			throw new IllegalArgumentException("Unsupported browser : " + browser);
		}
	}

	/* GETTER */
	public static WebDriver getDriver() {
		return driver;
	}

	/* SETTER */
	public static void setDriver(WebDriver driver) {
		Setup.driver = driver;
	}
	
	public static Logger getLogger() {
		return LOGGER ;
	}

} 