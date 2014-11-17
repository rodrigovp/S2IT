package levaetrazproject

class Caminho {

	private Set<Rota> rotas
	
	Caminho(Set<Rota> rotas){
		this.rotas = rotas
	}
	
	public Integer lerExtensao(){
		def ret = 0
		for (rota in rotas){
			ret += rota.lerExtensao()
		}
		ret
	}
}
