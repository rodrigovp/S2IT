package levaetrazproject

class Combustivel {
	
	private BigDecimal preco
	
	Combustivel(BigDecimal preco){
		this.preco = preco
	}
	
	BigDecimal calcularValorDaCompraDe(BigDecimal quantidadeDeLitros){
		preco.multiply(quantidadeDeLitros)
	}
}
