package com.project.objects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.project.settings.BrowserFactory;
import com.project.settings.Constants;
import com.project.settings.Functions;

public class ObjectMaps{
	
	private WebDriver driver;
		
	public void logar(String url) throws IOException {
		BrowserFactory.instanciaBrowser("CHROME");
		driver = Constants.WebDriver;
		driver.get(url);
		Reporter.addStepLog("Abrir Url");
		Functions.printScreen();
		if(System.getProperty("os.name").equals("Mac OS X")){
			driver.manage().window().fullscreen();
		}else{
			driver.manage().window().maximize();
		}
	}
	
	public void fecharBrowser() throws IOException {
		driver = Constants.WebDriver;
		Functions.printScreen();
		driver.quit();
		Reporter.addStepLog("Browser Fechou com sucesso");
	}
}
