@RealizarBusca
Feature: Realizar Busca

  @RealizarBuscaSucesso @all
  Scenario Outline: Realizar Busca de um produto no site da Magazine luiza
    Given abrir o browser na "<url>"
    And realizar pesquisa do "<produto>"
    Then valido que o "<produto>" retornou com sucesso
    And Browser Fechou com sucesso

   Examples:
      | url                          | produto                                      |
      | https://magazineluiza.com.br | Grampeador Pneumático MTX - 10 a 22mm 574209 |

  @RealizarBuscaInexistente @all
  Scenario Outline: Realizar Busca de um produto inexistente no site da Magazine luiza
    Given abrir o browser na "<url>"
    And realizar pesquisa do "<produto>"
    Then valido mensagem de produto inexistente
    And Browser Fechou com sucesso

   Examples:
      | url                          | produto                                      |
      | https://magazineluiza.com.br | controle remoto do  papai noel               |