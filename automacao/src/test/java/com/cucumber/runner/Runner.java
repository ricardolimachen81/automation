package com.cucumber.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.File;

import com.cucumber.listener.Reporter;
import com.project.settings.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = { "src/test/resources/features" }, 
	tags = { "@all" }, 
	glue = {"com.cucumber.stepdefinitions", "com.cucumber.runner" }, 
	plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:output/report.html",
	"json:output/Cucumber.json"}, monochrome = true)

public class Runner {
	//private WebDriver driver = Constants.WebDriver;

	@Before
	public void setUp() throws Exception {
		// Functions.createFolder(Constants.data);
		System.out.println("Before");

	}

	@After
	public void tearDown() throws Exception {
		// Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		// Reporter.setSystemInfo("user", System.getProperty("user.name"));
		// Reporter.setSystemInfo("os", "Mac OSX");
		// Reporter.setTestRunnerOutput("Team CI&T");
		// Functions.copy(Constants.CaminhoOrigemReport, Constants.CaminhoDestinoReport, true);
		// driver.quit();
		System.out.println("After");
	}
}
