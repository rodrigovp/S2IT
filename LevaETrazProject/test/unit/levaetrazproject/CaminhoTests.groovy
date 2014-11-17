package levaetrazproject;

import grails.test.GrailsUnitTestCase

class CaminhoTests extends GrailsUnitTestCase{

	Local origem = new Local(nome:new Nome(nome:"Araraquara"))
	Local destino = new Local(nome:new Nome(nome:"São Carlos"))
	Rota umaRota = new Rota(origem:origem, destino:destino, extensao:10)
	
	def caminho
	
	void "test calcular extensao de caminho sem rotas"(){
		caminho = new Caminho(Collections.emptySet())
		assertEquals 0, caminho.lerExtensao()
	}
	
	void "test calcular extensao de caminho com uma rota"(){
		caminho = new Caminho(Collections.singleton(umaRota))
		assertEquals umaRota.lerExtensao(), caminho.lerExtensao()
	}
	
	void "test calcular extensao de caminho com duas rotas"(){
		Rota outraRota = new Rota(origem:origem, destino:destino, extensao:20)
		caminho = new Caminho(new HashSet<>(Arrays.asList(umaRota, outraRota)))
		
		assertEquals 30, caminho.lerExtensao()
	}
}
