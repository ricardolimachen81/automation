package com.cucumber.stepdefinitions;

import com.project.objects.CadastroObjectMaps;
import com.project.objects.ObjectMaps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class SelecionaProduto {

    @Given("^realizar pesquisa da categoria \"([^\"]*)\"$")
    public void realizar_pesquisa_da_categoria(String categoria) throws Throwable {
        CadastroObjectMaps cadastro = new CadastroObjectMaps();
        cadastro.realizarPesquisaCategoria(categoria);
    }

    @Given("^seleciono o primeiro produto listado")
    public void seleciono_o_primeiro_produto_listado() throws Throwable {
        CadastroObjectMaps cadastro = new CadastroObjectMaps();
        cadastro.selecionaPrimeiroProdutoLista();
    }

    @Then("^valido a tela apos selecao do produto$")
    public void valido_a_tela_apos_selecao_do_produto() throws Throwable {
        CadastroObjectMaps cadastro = new CadastroObjectMaps();
        cadastro.validaTelaSelecaoProduto();
    }

    @Then("^seleciono o produto listado \"([^\"]*)\"$")
    public void seleciono_o_produto_listado(String produto) throws Throwable {
        CadastroObjectMaps cadastro = new CadastroObjectMaps();
        cadastro.selecionoProdutoListado(produto);
        
}
    
}