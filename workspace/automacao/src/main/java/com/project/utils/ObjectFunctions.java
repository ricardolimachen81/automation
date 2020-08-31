package com.project.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectFunctions {

	public WebElement getElement(WebDriver driver, String tagName, String validacao) {
		WebElement element = null;
		for (WebElement elements : driver.findElements(By.tagName(tagName))) {
			if (elements.getText().equals(validacao)) {
				element = elements;
			}
		}
		return element;
	}

	public WebElement getArrayElement(WebDriver driver, String tagName) {
		List <WebElement> teste = driver.findElements(By.tagName(tagName));
		return teste.get(0);
	}

	public void clicElementJavaScriptArrayElement(WebDriver driver, String tag){
		WebElement element = getArrayElement(driver, tag);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void clickElementJavaScriptByXpath(WebDriver driver, String tag, String text){
		WebElement element = returnXpathText(driver, tag, text);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public WebElement returnId(WebDriver driver, String id){
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public WebElement returnXpath(WebDriver driver, String tagName, String classType, String className){
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement xpath = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//"+tagName+"[@"+classType+"='"+className+"']")));
		return xpath;
	}

	public WebElement returnXpathText(WebDriver driver, String tagName, String text){
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement xpath = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//"+tagName+"[contains(text(),'"+text+"')]")));
		return xpath;
	}

	public boolean compareElementText(WebDriver driver, String tagName, String txtValid) {
		boolean retorno = false;
		for (WebElement elements : driver.findElements(By.tagName(tagName))) {
			if (elements.getText().contains(txtValid)) {
				retorno = true;
			}
		}
		return retorno;
	}

	public void WaitElementExistByXpath(WebDriver driver, String tagName, String classType, String className){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//"+tagName+"[@"+classType+"='"+className+"']")));
	}

}
