package levaetrazproject

import br.org.rodnet.algoritmos.dijkstra.Dijkstra
import br.org.rodnet.algoritmos.dijkstra.Grafo
import br.org.rodnet.algoritmos.dijkstra.Vertice

class CalculoDeMelhorCaminhoService {

	static expose = ['cxf']
	
    CalculoResponse calcular(CalculoRequest request) {
		
		Dijkstra dijkstra = new Dijkstra()
		
		Mapa mapa = Mapa.findByNome(request.nomeDoMapa)
		Grafo grafo = mapa.converterParaGrafo()
		
		Local origem = Local.findByNome(request.nomeDaOrigem)
		Vertice vOrigem = origem.converterParaVertice()
		
		Local destino = Local.findByNome(request.nomeDoDestino)
		Vertice vDestino = destino.converterParaVertice()
		
		Vertice[] vertices = dijkstra.encontrarMenorCaminhoDijkstra(grafo, vOrigem, vDestino).toArray(new Vertice[0])
		
		CalculoResponse ret = new CalculoResponse()
		ret.vertices = vertices
		ret
    }
}
