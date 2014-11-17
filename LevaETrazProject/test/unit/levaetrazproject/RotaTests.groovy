package levaetrazproject

import grails.test.GrailsUnitTestCase


class RotaTests extends GrailsUnitTestCase {

	Local origem = new Local(nome:new Nome(nome:"Araraquara"))
	Local destino = new Local(nome:new Nome(nome:"São Carlos"))
	
    void "test igualdade de rotas"() {
		Integer distancia = 10
		Rota umaRota = new Rota(origem:origem, destino:destino, distancia:distancia)
		Rota outraRota = new Rota(origem:origem, destino:destino, distancia:distancia)
		
		assertEquals umaRota, outraRota
    }
	
	void "test constraints"(){
		mockDomain Rota
		Rota rotaComOrigemEDestinoIguais = new Rota(origem:origem, destino:origem, distancia:2)
		assertFalse rotaComOrigemEDestinoIguais.validate()	
		
		Rota rotaComDistanciaMenorQue1 = new Rota(origem:origem, destino:destino, distancia:0)
		assertFalse rotaComDistanciaMenorQue1.validate()
		
		Rota rotaSemVariaveis = new Rota()
		assertFalse rotaSemVariaveis.validate()
		
		Rota rotaParaSalvar = new Rota(origem:origem, destino:destino, distancia:2)
		rotaParaSalvar.save()
		
		Rota rotaIgualARotaSalva = new Rota(origem:origem, destino:destino, distancia:2)
		assertFalse rotaIgualARotaSalva.validate()
	}
	
	void "test uma rota criada corretamente"(){
		mockDomain Rota
		Rota rota = new Rota(origem:origem, destino:destino, distancia:2)
		
		assertTrue rota.validate()
	}
}
