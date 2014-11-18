package levaetrazproject

import grails.test.GrailsUnitTestCase
import grails.test.mixin.*

class MapaTests extends GrailsUnitTestCase {

	void "test constraints"(){
		mockDomain Mapa
		Mapa mapaSemParametros = new Mapa()
		assertFalse mapaSemParametros.validate()
		
		Rota umaRota = new Rota(origem: new Local(nome: "Araraquara"), destino: new Local(nome: "São Carlos"), extensao: 2)
		Mapa mapaSemNome = new Mapa(malhaLogistica: Collections.singleton(umaRota))
		assertFalse mapaSemNome.validate()
		
		Mapa mapaSemMalha = new Mapa(nome: "São Paulo")
		assertFalse mapaSemNome.validate()
		
		Mapa mapaCorretamenteInstanciado = new Mapa(nome:"São Paulo", malhaLogistica:Collections.singleton(umaRota))
		assertTrue mapaCorretamenteInstanciado.validate()
	}
	
	
}
