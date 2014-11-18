package levaetrazproject

import br.org.rodnet.algoritmos.dijkstra.Grafo
import br.org.rodnet.algoritmos.dijkstra.Vertice

class Mapa {

	String nome
	Rota[] malhaLogistica
	
    static constraints = {
		nome(nullable:false, blank:false, maxSize:200, unique:true) 
		malhaLogistica(nullable:false, blank:false)
    }
	
	static hasMany = [malhaLogistica: Rota]
	
	Grafo converterParaGrafo(){
		Vertice[] vertices = []
		for(Rota rota in malhaLogistica){
			Local origem = rota.origem
			Local destino = rota.destino
			vertices << origem.converterParaVertice()
			vertices << destino.converterParaVertice()
		}
		Grafo ret = new Grafo()
		ret.vertices = vertices
		ret
	}
}
