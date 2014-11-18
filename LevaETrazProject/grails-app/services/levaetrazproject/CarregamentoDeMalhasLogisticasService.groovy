package levaetrazproject

class CarregamentoDeMalhasLogisticasService {
 
	static expose = ['cxf']
	
    CarregamentoResponse carregar(CarregamentoRequest request) {
		def rotas = [] as Set
		for(RotaRequest rs in request.rotas){
			Local origem = new Local(nome: rs.pontoDeOrigem)
			origem.save()
			Local destino = new Local(nome: rs.pontoDeDestino)
			destino.save()
			Rota novaRota = new Rota(origem: origem, destino: destino, distancia: rs.distancia);
			novaRota.save()
			rotas << novaRota
		}

		Mapa novoMapa = new Mapa(nome: request.nomeDoMapa, malhaLogistica: rotas)
		novoMapa.save()
		
		CarregamentoResponse ret = new CarregamentoResponse()
		ret
    }
}
