
package levaetrazproject;

import grails.test.GrailsUnitTestCase

class NomeTests extends GrailsUnitTestCase {

	void "test nome invalido"(){
		mockDomain Nome
		Nome nome = new Nome()
		assertFalse nome.validate()
	} 
	
	void "test igualdade de nomes"(){
		def robervaldo = "robervaldo"
		def umNome = new Nome(nome:robervaldo)
		def outroNome = new Nome(nome:robervaldo)
		
		assertEquals umNome, outroNome
	} 

}
