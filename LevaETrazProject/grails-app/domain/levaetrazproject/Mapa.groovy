package levaetrazproject

class Mapa {

	Nome nome
	
    static constraints = {
		nome(nullable:false, unique:true) 
    }
	
	static hasMany = [malhaLogistica: Rota]
}
