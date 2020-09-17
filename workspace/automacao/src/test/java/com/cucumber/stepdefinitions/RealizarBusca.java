package com.cucumber.stepdefinitions;

import com.project.page.CadastroPage;
import com.project.page.PageMaps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealizarBusca {
	
	@Given("abrir o browser na \"([^\"]*)\"$")
	public void abrir_o_browser_na(String url) throws Throwable {
		PageMaps obj = new PageMaps();
		obj.logar(url);
	}

	@Given("realizar pesquisa do \"([^\"]*)\"$")
	public void realizarPesquisa(String produto) throws Throwable {
		CadastroPage objCadastro = new CadastroPage();
		objCadastro.inserirProduto(produto);
	}

	@Then("^valido que o \"([^\"]*)\" retornou com sucesso$")
	public void validarBuscaProduto(String produto) throws Throwable {
		CadastroPage objCadastro = new CadastroPage();
		objCadastro.validaRetornoBusca(produto);
	}
	@Then("^Browser Fechou com sucesso$")
	public void fecharBrowser()throws Throwable {
		CadastroPage objCadastro = new CadastroPage();
		objCadastro.fecharBrowser();
	}

	@Then("^valido mensagem de produto inexistente$")
	public void valido_mensagem_de_produto_inexistente() throws Throwable {
		CadastroPage objCadastro = new CadastroPage();
		objCadastro.validaMensagemProdutoInexistente();
	}
}
