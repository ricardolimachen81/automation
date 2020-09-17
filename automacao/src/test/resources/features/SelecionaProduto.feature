#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@SelecionaProduto
Feature: Selecionar Produto

  @SelecionarProdutoCategoria @all
  Scenario Outline: Realizar Seleção de um produto no site do magazine luiza
    Given abrir o browser na "<url>"
    And realizar pesquisa da categoria "<categoria>"
    And seleciono o primeiro produto listado
    Then valido a tela apos selecao do produto 
    And Browser Fechou com sucesso

   Examples:
      | url                          | categoria  |
      | https://magazineluiza.com.br | Ferramentas|

  @SelecionarProdutoBusca @all
  Scenario Outline: Realizar Seleção de um produto no site do magazine luiza
    Given abrir o browser na "<url>"
    And realizar pesquisa do "<produto>"
    Then valido que o "<produto>" retornou com sucesso
    And seleciono o produto listado "<produto>"
    Then valido a tela apos selecao do produto
    And Browser Fechou com sucesso

   Examples:
      | url                          | produto                                      |
      | https://magazineluiza.com.br | Grampeador Pneumático MTX - 10 a 22mm 574209 |

