package com.project.settings;

import java.io.File;

import org.openqa.selenium.WebDriver;

public class Constants {

	public static WebDriver WebDriver;
	public static String ChromeDriver = System.getProperty("user.dir") + "//driver//chromedriver";
	public static String FirefoxDriver = System.getProperty("user.dir") + "//driver//geckodriver";

	// Variáveis Browser
	public static String Name_Chrome = "CHROME";
	public static String Name_Firefox = "FIREFOX";
	public static String Name_IE = "IE";

	// Data Autal
	public static String data = Functions.returnActualDate();
	public static String folder = System.getProperty("user.dir") + "//Evidencias//Ev_" + data + "//";

	// Caminhos HTML Evidencias
	public static File CaminhoOrigemReport = new File(System.getProperty("user.dir") + "//output//report.html");
	public static File CaminhoDestinoReport = new File(folder+"report_" + data + ".html");
	
	//Constantes Tags
	public static String Tag_A = "a";
	public static String Tag_Div = "Div";
	public static String Tag_Input = "Input";
	public static String Tag_H2 = "h2";
	public static String Tag_P = "p";
	public static String Tag_H1 = "h1";
	public static String Tag_SPAN = "span";
	public static String Tag_H3 = "h3";
	public static String Tag_IMG = "img";
	
	
	
	
	
	//Delays
	public static int Delay_Low = 5000;
	public static int Delay_Medium = 10000;
	public static int Delay_High = 15000;
	
	//Constants WebDriver
	//IE
	public static final String CONST_IEDRIVER_PROPERTY = "webdriver.ie.driver";
	public static final String CONST_IEDRIVER_PATH =  System.getProperty("user.dir") +"/driver/IEDriverServer.exe";
	//Mozila
	public static final String CONST_MOZILLADRIVER_PROPERTY = "webdriver.gecko.driver";
	public static final String CONST_MOZILLADRIVER_PATH =   System.getProperty("user.dir") +"/driver/geckodriver.exe";
	//Chrome
	public static final String CONST_CHROMEDRIVER_PROPERTY = "webdriver.chrome.driver";
	public static final String CONST_CHROMEDRIVER_PATH = System.getProperty("user.dir") +"/driver/chromedriver.exe";
	public static String ScenarioName;
	
	

}
