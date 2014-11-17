package levaetrazproject

class Local {

	Nome nome
	
    static constraints = {
		nome(nullable:false, unique:true)
    }
	
	def boolean equals(obj){
		def ret = false
		if(obj instanceof Local){
			def outro = (Local) obj
			ret = nome.equals(outro.nome)
		}
		ret
	}
}
