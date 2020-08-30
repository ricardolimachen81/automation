package com.project.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

	public WebElement returnId(WebDriver driver, String id){
		WebElement element = driver.findElement(By.id(id));
		return element;
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

}
