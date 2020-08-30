# automation
<h1><b><i>Documentação Projeto Seleção CI&T</b></i></h1>
Critério da utilização da linguagem:
	- Pois trata - se de uma das linguagens mais utilizadas, falando de codificação, fácil acesso de estudo e de vários fóruns existentes para pesquisas.
 Framework utilizado:
 	- Selenium (Para realizar interação com o browser e seus elementos)
 Tecnologias de Teste
 	-  HTLMReport (Para montagem de report em tempo de execução)
 	- BDD/Cucumber (Para orientar nossos testes a comportamento)

 Forma de execução
 	1 - Procurar a feature necessária para teste: workspace/automacao/src/test/resources/features/
 	2 - Buscar a TAG que mais se adequa com a sua execução, Ex: @RealizarBusca
 	3 - Procurar a classe de execução chamada "Runner": workspace/automacao/src/test/java/com/cucumber/runner/Runner.java
 	4 - No "Cucumber Options" alterar para a TAG de sua ecolha
 	5 - Executar a Classe "Runner"
 	6 - Será criada uma pasta no formato Ev_DDMMAAHHMMSS contendo o resultado da execução: workspace/automacao/Evidencias