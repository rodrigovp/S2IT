package levaetrazproject

import grails.test.GrailsUnitTestCase
import grails.test.mixin.*

class AutonomiaTests extends GrailsUnitTestCase {
	
	Autonomia autonomia = new Autonomia(10)
	
	void "test calcular quantidade de litros para viagem de 0 quiiometro"(){
		assertEquals BigDecimal.ZERO, autonomia.calcularQuantidadeDeLitrosParaViagemDe(0)
	}	
	
	void "test calcular quantidade de litros para viagem de 10 quilometros"(){
		assertEquals BigDecimal.ONE, autonomia.calcularQuantidadeDeLitrosParaViagemDe(10)
	}
	
	void "test calcular quantidade de litros para viagem de 20 quilometros"(){
		assertEquals new BigDecimal("2"), autonomia.calcularQuantidadeDeLitrosParaViagemDe(20)
	}
}
