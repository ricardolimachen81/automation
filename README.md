<h1><b><i>Documentação Projeto</b></i></h1>

<h2>Critério da utilização da linguagem:</h2>
	<ul>
		<li>A linguagem java foi utilizada, pois trata de uma das mais utilizadas no mercado, fácil acesso a estudo e a vários fóruns para pesquisas.</li>
	</ul>
 <h2>Framework utilizado:</h2>
 	<ul>
 		<li>Selenium (Para realizar interação com o browser e seus elementos)</li>
 	</ul>
 <h2>Tecnologias de Teste</h2>
 	<ul>
 		<li>HTLMReport (Para montagem de report em tempo de execução)</li>
 		<li>BDD/Cucumber (Para orientar nossos testes a comportamento)</li>
 	</ul>
 <h2>Forma de execução</h2>
 	<ul>
 		<li>1 - Procurar a feature necessária para teste: workspace/automacao/src/test/resources/features/</li>
 		<li>2 - Buscar a TAG que mais se adequa com a sua execução, Ex: @RealizarBusca</li>
 		<li>3 - Procurar a classe de execução chamada "Runner": workspace/automacao/src/test/java/com/cucumber/runner/Runner.java</li>
 		<li>4 - No "Cucumber Options" alterar para a TAG de sua ecolha</li>
 		<li>5 - Executar a Classe "Runner"</li>
 		<li>6 - Será criada uma pasta no formato "Ev_DDMMAAHHMMSS" contendo o resultado da execução: workspace/automacao/Evidencias</li>
 	</ul>
