package levaetrazproject

import grails.test.GrailsUnitTestCase

class LocalTests extends GrailsUnitTestCase {

    void "test igualdade de locais"() {
		String umNome = "Araraquara"
		Local local = new Local(nome: umNome)
		Local outroLocal = new Local(nome: umNome)
		
		assertEquals local,  outroLocal
    }
}
