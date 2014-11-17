
package levaetrazproject;

import grails.test.GrailsUnitTestCase
import grails.test.mixin.*

class CalculadoraDeCustoTests extends GrailsUnitTestCase{

	CalculadoraDeCusto calculadora = new CalculadoraDeCusto()
	
	//TODO: poderia-se mockar as rotas, facilitando a construção do teste
	void "test calcular custo"(){
		Local primeiroLocal = new Local(nome: new Nome(nome: "Araraquara"))
		Local segundoLocal = new Local(nome: new Nome(nome: "São Carlos"))
		Local terceiroLocal = new Local(nome: new Nome(nome: "São Paulo"))
		Rota umaRota = new Rota(origem: primeiroLocal, destino: segundoLocal, extensao: 10)
		Rota outraRota = new Rota(origem: segundoLocal, destino: terceiroLocal, extensao: 10)
		
		BigDecimal valorEsperado = new BigDecimal("20")
		Autonomia autonomia = new Autonomia(10)
		Caminho caminho = new Caminho(new HashSet<>(Arrays.asList(umaRota, outraRota)))
		Combustivel combustivel = new Combustivel(BigDecimal.TEN)
		
		BigDecimal valorObtido = calculadora.calcular(autonomia, caminho, combustivel)
		assertEquals valorEsperado, valorObtido
	}
}
