package com.cucumber.runner;


import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.project.settings.Constants;
import com.project.settings.Functions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/features" },
	tags = {"@all"},
	glue = {"com.cucumber.stepdefinitions" }, 
	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" }
	)

public class Runner {
	private WebDriver driver = Constants.WebDriver;

	@Before
	public void setUp() throws Exception {
		Functions.createFolder(Constants.data);
	}

	@After
	public void tearDown() throws Exception {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Team CI&T");
		Functions.copy(Constants.CaminhoOrigemReport, Constants.CaminhoDestinoReport, true);
		driver.quit();
	}
}
