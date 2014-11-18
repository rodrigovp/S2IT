package levaetrazproject

import br.org.rodnet.algoritmos.dijkstra.Aresta
import br.org.rodnet.algoritmos.dijkstra.Vertice

class Local {

	String nome
	Rota[] rotas
	
    static constraints = {
		nome(nullable:false, blank:false, maxSize:200, unique:true)
		rotas(nullable:false, minSize:1)
    }
	
	def boolean equals(obj){
		def ret = false
		if(obj instanceof Local){
			def outro = (Local) obj
			ret = nome.equals(outro.nome)
		}
		ret
	}
	
	Vertice converterParaVertice(){
		Vertice ret = new Vertice()
		ret.descricao = nome
		Vertice[] vizinhos = []
		Aresta[] arestas = []
		for(Rota r : rotas){
			Local localVizinho = r.lerVizinhoDo(this)
			Vertice vizinho = new Vertice()
			vizinho.descricao = localVizinho.nome
			vizinhos << vizinho
			Aresta aresta = new Aresta(ret, vizinho)
			aresta.peso = r.extensao
			arestas << aresta 
		}
		ret.arestas = arestas
		ret
	}
}
