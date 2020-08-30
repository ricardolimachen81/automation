<h1><b><i>Documentação Projeto</b></i></h1>

<h2>Critério da utilização da linguagem:</h2>
	<h3>- A linguagem java foi utilizada, pois trata de uma das mais utilizadas no mercado, fácil acesso de estudo e de vários fóruns existentes para pesquisas.</h3>
 <h2>Framework utilizado:</h2>
 	<h3>- Selenium (Para realizar interação com o browser e seus elementos)</h3>
 <h2>Tecnologias de Teste</h2>
 	<h3>-  HTLMReport (Para montagem de report em tempo de execução)</h3>
 	<h3>- BDD/Cucumber (Para orientar nossos testes a comportamento)</h3>

 <h2>Forma de execução</h2>
 	<h3>1 - Procurar a feature necessária para teste: workspace/automacao/src/test/resources/features/</h3>
 	<h3>2 - Buscar a TAG que mais se adequa com a sua execução, Ex: @RealizarBusca</h3>
 	<h3>3 - Procurar a classe de execução chamada "Runner": workspace/automacao/src/test/java/com/cucumber/runner/Runner.java</h3>
 	<h3>4 - No "Cucumber Options" alterar para a TAG de sua ecolha</h3>
 	<h3>5 - Executar a Classe "Runner"</h3>
 	<h3>6 - Será criada uma pasta no formato Ev_DDMMAAHHMMSS contendo o resultado da execução: workspace/automacao/Evidencias</h3>