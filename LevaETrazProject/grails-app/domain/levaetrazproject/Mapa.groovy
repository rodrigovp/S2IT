package levaetrazproject

class Mapa {

	Nome nome
	Set<Rota> malhaLogistica
	
    static constraints = {
		nome(nullable:false, unique:true)
		malhaLogistica(nullable:false, minSize:1) 
    }
}
