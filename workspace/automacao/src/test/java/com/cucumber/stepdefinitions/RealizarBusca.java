package com.cucumber.stepdefinitions;

import com.project.objects.CadastroObjectMaps;
import com.project.objects.ObjectMaps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealizarBusca {
	
	@Given("abrir o browser na \"([^\"]*)\"$")
	public void abrir_o_browser_na(String url) throws Throwable {
		ObjectMaps obj = new ObjectMaps();
		obj.logar(url);
	}

	@Given("realizar pesquisa do \"([^\"]*)\"$")
	public void realizarPesquisa(String produto) throws Throwable {
		CadastroObjectMaps objCadastro = new CadastroObjectMaps();
		objCadastro.inserirProduto(produto);
	}

	@Then("^valido que o \"([^\"]*)\" retornou com sucesso$")
	public void validarBuscaProduto(String produto) throws Throwable {
		CadastroObjectMaps objCadastro = new CadastroObjectMaps();
		objCadastro.validaRetornoBusca(produto);
	}
	@Then("^Browser Fechou com sucesso$")
	public void fecharBrowser()throws Throwable {
		CadastroObjectMaps objCadastro = new CadastroObjectMaps();
		objCadastro.fecharBrowser();
	}

	@Then("^valido mensagem de produto inexistente$")
	public void valido_mensagem_de_produto_inexistente() throws Throwable {
		CadastroObjectMaps objCadastro = new CadastroObjectMaps();
		objCadastro.validaMensagemProdutoInexistente();
	}
}
