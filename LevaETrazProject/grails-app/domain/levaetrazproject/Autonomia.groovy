package levaetrazproject

class Autonomia {

	private Integer quilometrosPorLitro
	
	Autonomia(Integer quilometrosPorLitro){
		this.quilometrosPorLitro = quilometrosPorLitro
	}
	
	BigDecimal calcularQuantidadeDeLitrosParaViagemDe(Integer quilometros){
		BigDecimal.valueOf(quilometros).divide(quilometrosPorLitro)
	}
}
