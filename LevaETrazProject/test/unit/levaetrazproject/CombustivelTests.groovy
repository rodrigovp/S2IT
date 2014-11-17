package levaetrazproject

import grails.test.GrailsUnitTestCase
import grails.test.mixin.*

class CombustivelTests extends GrailsUnitTestCase {
	
	Combustivel combustivel = new Combustivel(BigDecimal.ONE)
	
	void "test calcular valor da compra de zero litros"(){
		assertEquals BigDecimal.ZERO, combustivel.calcularValorDaCompraDe(BigDecimal.ZERO)
	}
	
	void "test calcular valor da compra de um litro"(){
		assertEquals BigDecimal.ONE, combustivel.calcularValorDaCompraDe(BigDecimal.ONE)
	}
	
	void "test calcular valor da compra de dois litros"(){
		assertEquals new BigDecimal("2"), combustivel.calcularValorDaCompraDe(new BigDecimal("2"))
	}
}
