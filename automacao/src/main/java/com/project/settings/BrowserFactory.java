package com.project.settings;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	protected static WebDriver webDriver = null;
	
	public static void instanciaBrowser(String Browser){
		
		switch (Browser.toUpperCase()) {
		case "FIREFOX":
			webDriver = Functions.getWebDriverFirefox();
			Constants.WebDriver = webDriver;
			break;

		case "CHROME":
			webDriver = Functions.getWebDriverChrome();
			Constants.WebDriver = webDriver;
			break;
			
		case "IE":
			webDriver = Functions.getWebDriverIE();
			Constants.WebDriver = webDriver;
			break;

		default:
			webDriver = Functions.getWebDriverChrome();
			Constants.WebDriver = webDriver;
			break;
		}	
	}
	public static WebDriver getBrowser(String browserType, WebDriver driver){
		if (driver == null) {
			if (browserType.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver", Constants.FirefoxDriver);
				driver = new FirefoxDriver();
			} else if (browserType.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", Constants.ChromeDriver);
				driver = new ChromeDriver();
			} else if (browserType.equals("IE")) {
				driver = new InternetExplorerDriver();
			}
		}
		return driver;
	}
}