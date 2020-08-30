package com.project.objects;



import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.project.settings.Constants;
import com.project.settings.Functions;
import com.project.utils.ObjectFunctions;

public class CadastroObjectMaps {
	
	private WebDriver driver = Constants.WebDriver;

	public void fecharBrowser() throws IOException, InterruptedException {
		Thread.sleep(Constants.Delay_Low);
		Functions.printScreen();
		driver = Constants.WebDriver;
		driver.quit();
		Reporter.addStepLog("Fechar Browser");
	}
	
	public void inserirProduto (String produto){
		ObjectFunctions obj = new ObjectFunctions();
		try {
			driver = Constants.WebDriver;
			Functions.printScreen();
			obj.returnId(driver, "inpHeaderSearch").sendKeys(produto);
			Functions.printScreen();
			obj.returnId(driver, "btnHeaderSearch").click();
			Functions.printScreen();
			Reporter.addStepLog("Inserir Produto");
		} catch (Exception e) {
			Reporter.addStepLog("Erro ao Inserir Produto");
			e.printStackTrace();
		}
	}

	public void validaRetornoBusca(String produto){
		ObjectFunctions obj = new ObjectFunctions();
		try {
			driver = Constants.WebDriver;
			Functions.printScreen();
			obj.compareElementText(driver, Constants.Tag_H2, produto);
			Functions.printScreen();
			Reporter.addStepLog("Produto Validado com sucesso");

		} catch (Exception e) {
			Reporter.addStepLog("Erro ao Validar Produto");
			e.printStackTrace();
		}

	}

}
