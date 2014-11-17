package levaetrazproject

class CalculadoraDeCusto {
	
	BigDecimal calcular(Autonomia autonomia, Caminho caminho, Combustivel combustivel){
		Integer xQuilometros = caminho.lerExtensao()
		BigDecimal xLitros = autonomia.calcularQuantidadeDeLitrosParaViagemDe(xQuilometros)
		combustivel.calcularValorDaCompraDe(xLitros)
	}
}
