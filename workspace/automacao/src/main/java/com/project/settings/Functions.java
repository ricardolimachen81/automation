package com.project.settings;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import com.cucumber.listener.Reporter;


public class Functions {
	
	 /** 
     * Copia arquivos de um local para o outro 
     * @param origem - Arquivo de origem 
     * @param destino - Arquivo de destino 
     * @param overwrite - Confirmação para sobrescrever os arquivos 
     * @throws IOException 
     */  
    public static void copy(File origem,File destino,boolean overwrite) throws IOException{  
        if (destino.exists() && !overwrite){  
            System.err.println(destino.getName()+" já existe, ignorando...");  
            return;  
        }  
        FileInputStream fisOrigem = new FileInputStream(origem);  
        FileOutputStream fisDestino = new FileOutputStream(destino);  
        FileChannel fcOrigem = fisOrigem.getChannel();    
        FileChannel fcDestino = fisDestino.getChannel();    
        fcOrigem.transferTo(0, fcOrigem.size(), fcDestino);    
        fisOrigem.close();    
        fisDestino.close();  
    }
    
    public static String returnActualDate(){
    	GregorianCalendar calendar = new GregorianCalendar(); 
    	SimpleDateFormat formatador = new SimpleDateFormat("ddMMyyyyHHmmss");
    	String data = formatador.format(calendar.getTime());
    	return data;
    }
    
    public static void createFolder(String data){
    	File diretorio = new File(System.getProperty("user.dir")+"//Evidencias//Ev_"+data);
        diretorio.mkdir();
    }
    
    /**
     * Método para capturar screenshot
     * @param caminho - Pasta do Arquivo Atual
     * @param dataAtual - Método returnActualDate
     * @return 
     */
    public static String takeScreenshot(String caminho, String dataAtual){
    	
    	// Screenshot
    	File src= ((TakesScreenshot)Constants.WebDriver).getScreenshotAs(OutputType.FILE);
    	try {
    	 //copiando para arquivo
    		String arquivoFinal = caminho+"//Prints//"+dataAtual+".png";
    	FileUtils.copyFile(src, new File(arquivoFinal)); 
    	return arquivoFinal;
    	}
    	catch (IOException e)
    	 {
    	  System.out.println(e.getMessage());
    	 }
		return null;
    }
  
    
    public static void printScreen() throws IOException{
    	String caminhoPrint = takeScreenshot(Constants.folder, returnActualDate());
    	Reporter.addScreenCaptureFromPath(caminhoPrint);
    }
    
    public static WebDriver getWebDriverChrome() {

		System.setProperty(Constants.CONST_CHROMEDRIVER_PROPERTY, Constants.CONST_CHROMEDRIVER_PATH);
		return new ChromeDriver();
	}

	public static WebDriver getWebDriverFirefox() {
		System.setProperty(Constants.CONST_MOZILLADRIVER_PROPERTY, Constants.CONST_MOZILLADRIVER_PATH);

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);

		File pathToFirefoxBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxbin = new FirefoxBinary(pathToFirefoxBinary);
		return new FirefoxDriver();

	}
	
	public static WebDriver ConfigureIEWebDriver() throws Exception {

		WebDriver webDriver = null;

		// kill the IE WebDriver
		final String KILL = "taskkill /IM ";
		String processName = "IEDriverServer.exe"; // IE process
		Runtime.getRuntime().exec(KILL + processName);
		Thread.sleep(30);

		try {
			// configuration Capabilities of IE//
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			ieCapabilities.setPlatform(Platform.ANY);
			ieCapabilities.setJavascriptEnabled(true);

			// instance IE webDriver
			File file = new File(Constants.CONST_IEDRIVER_PATH);
			System.setProperty(Constants.CONST_IEDRIVER_PROPERTY, file.getAbsolutePath());

			webDriver = new InternetExplorerDriver(ieCapabilities);

			return webDriver;

		} catch (Exception e) {

			throw new RuntimeException(e);

		}
	}

	public static WebDriver getWebDriverIE() {

		System.setProperty(Constants.CONST_IEDRIVER_PROPERTY, Constants.CONST_IEDRIVER_PATH);

		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();

		// ieCapabilities.setCapability("nativeEvents", false);
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		ieCapabilities.setCapability("requireWindowFocus", true);
		ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
		ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
		ieCapabilities.setCapability("disable-popup-blocking", true);
		ieCapabilities.setCapability("enablePersistentHover", true);

		WebDriver webDriver = new InternetExplorerDriver(ieCapabilities);

		return webDriver;
	}



	
    
    



}
