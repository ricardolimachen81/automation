package com.cucumber.stepdefinitions;

import com.project.objects.CadastroObjectMaps;
import com.project.objects.ObjectMaps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SegundoSteps {
	
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

}
