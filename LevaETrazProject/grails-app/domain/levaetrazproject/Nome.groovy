package levaetrazproject

class Nome {
	
	String nome
	
	static constraints = {
		nome(nullable:false, blank:false, maxSize:200, unique:true)
	}
	
	@Override
	def boolean equals(obj){
		def ret = false
		if(obj instanceof Nome){
			def outro = (Nome)obj
			ret = nome.equals(outro.nome)
		}
		ret
	}
	
	@Override
	def String toString(){
		nome
	}
	
	@Override
	def int hashCode(){
		nome.hashCode()
	}
}
