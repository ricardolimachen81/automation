package com.project.page;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import com.cucumber.listener.Reporter;
import com.project.settings.Constants;
import com.project.settings.Functions;
import com.project.utils.ObjectFunctions;

public class CadastroPage {

	//Elements
	String fieldSearch = "inpHeaderSearch";
	String btnSearch = "btnHeaderSearch";
	
	private WebDriver driver = Constants.WebDriver;
	
	public void fecharBrowser() throws IOException, InterruptedException {
		Thread.sleep(Constants.Delay_Low);
		Functions.printScreen();
		driver = Constants.WebDriver;
		driver.quit();
		Functions.copy(Constants.CaminhoOrigemReport, Constants.CaminhoDestinoReport, true);
		Reporter.addStepLog("Fechar Browser");
	}
	
	public void inserirProduto (final String produto){
		final ObjectFunctions obj = new ObjectFunctions();
		try {
			driver = Constants.WebDriver;
			Functions.printScreen();
			obj.returnId(driver, fieldSearch).sendKeys(produto);
			Functions.printScreen();
			obj.returnId(driver, btnSearch).click();
			Functions.printScreen();
			Reporter.addStepLog("Inserir Produto");
		} catch (final Exception e) {
			Reporter.addStepLog("Erro ao Inserir Produto");
			e.printStackTrace();
			driver.quit();
		}
	}

	public void validaRetornoBusca(final String produto){
		final ObjectFunctions obj = new ObjectFunctions();
		try {
			boolean result = false;
			driver = Constants.WebDriver;
			Functions.printScreen();
			result = obj.compareElementText(driver, Constants.Tag_H2, produto);
			Functions.printScreen();
			if(result==true){
				Reporter.addStepLog("Produto Validado com sucesso");
			}else{
				Reporter.addStepLog("Erro ao validar produto");
				driver.quit();
				throw new RuntimeException("Erro ao validar produto");
			}
		} catch (final Exception e) {
			Reporter.addStepLog("Erro ao Validar Produto");
			e.printStackTrace();
		}
	}

	public void validaMensagemProdutoInexistente() throws IOException {
		final ObjectFunctions obj = new ObjectFunctions();
		final String mensagemProdutoInexistente = "Nenhum resultado encontrado para a consulta ";
		try {
			final boolean result = false;
			driver = Constants.WebDriver;
			Functions.printScreen();
			// result = obj.compareElementText(driver, Constants.Tag_P, mensagemProdutoInexistente);
			// if(result==true){
			// 	Functions.printScreen();
			// 	Reporter.addStepLog("Mensagem de Produto inexistente validada com sucesso");
			// }else{
			// 	Functions.printScreen();
			// 	Reporter.addStepLog("Erro ao Validar Mensagem de Produto inexistente");
			// 	driver.quit();
			// 	throw new RuntimeException("Erro ao Validar Mensagem de Produto inexistente");
			// }
		} catch (final IOException e) {
			e.printStackTrace();
			Functions.printScreen();
			Reporter.addStepLog("Erro ao Validar Mensagem de Produto inexistente");
			driver.quit();
			throw new RuntimeException("Erro ao Validar Mensagem de Produto inexistente");
		}
	}

	public void realizarPesquisaCategoria(final String categoria) throws IOException {
		final ObjectFunctions obj = new ObjectFunctions();
		final String menu = "Todos os departamentos";
		try {
			Functions.printScreen();
			obj.returnXpathText(driver, Constants.Tag_SPAN, menu).click();
			Functions.printScreen();
			obj.returnXpathText(driver, Constants.Tag_A, categoria).click();
			Functions.printScreen();
			obj.returnXpathText(driver, Constants.Tag_H1, categoria);
			Functions.printScreen();
			Reporter.addStepLog("Pesquisa realizada com sucesso");
		} catch (final Exception e) {
			Reporter.addStepLog("Erro ao realizar Pesquisa por categoria");
			driver.quit();
			throw new RuntimeException("Erro ao realizar Pesquisa por categoria");
		}
	}

	public void selecionaPrimeiroProdutoLista(){
		final ObjectFunctions obj = new ObjectFunctions();
		try {
			Functions.printScreen();
			obj.clicElementJavaScriptArrayElement(driver, Constants.Tag_H3);
			Functions.printScreen();
			Reporter.addStepLog("Primeiro produto selecionado com sucesso");
		} catch (final Exception e) {
			Reporter.addStepLog("Erro ao selecionar primeiro produto");
			driver.quit();
			throw new RuntimeException("Erro ao selecionar primeiro produto");
		}
		
	}

	public void validaTelaSelecaoProduto(){
		final ObjectFunctions obj = new ObjectFunctions();
		final String mensagem1 = "Avaliar produto";
		final String mensagem2 = "Mais formas de pagamento";
		try {
			Functions.printScreen();
			obj.returnXpathText(driver, Constants.Tag_A, mensagem1);
			obj.returnXpathText(driver, Constants.Tag_A, mensagem2);
			Functions.printScreen();
			Reporter.addStepLog("Tela de produto validada com sucesso");
		} catch (final Exception e) {
			Reporter.addStepLog("Erro validar tela de produto");
			driver.quit();
			throw new RuntimeException("Erro validar tela de produto");
		}
	}

	public void selecionoProdutoListado(final String produto){
		final ObjectFunctions obj = new ObjectFunctions();
		try {
			obj.clickElementJavaScriptByXpath(driver, Constants.Tag_H2, produto);
			Functions.printScreen();
			Reporter.addStepLog("Produto listado selecionado com sucesso");
		} catch (final Exception e) {
			Reporter.addStepLog("Erro ao selecionar produto listado");
			driver.quit();
			throw new RuntimeException("Erro ao selecionar produto listado");
		}
	}
}
