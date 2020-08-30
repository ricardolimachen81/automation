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
@RealizarBusca
Feature: Realizar Busca

  @RealizarBuscaSucesso
  Scenario Outline: Realizar Busca de um produto no site da Magazine luiza
    Given abrir o browser na "<url>"
    And realizar pesquisa do "<produto>"
    Then valido que o "<produto>" retornou com sucesso
    And Browser Fechou com sucesso

   Examples:
      | url                                | produto                                    |
      | https://busca.magazineluiza.com.br | iPhone 11 Apple 64GB Preto 6,1” 12MP - iOS |

