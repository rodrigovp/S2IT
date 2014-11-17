package levaetrazproject

class Rota {

	Local origem
	Local destino
	Integer distancia
	
    static constraints = {
		origem(nullable:false, unique:true, validator: {val, obj -> !val.equals(obj.destino)})
		destino(nullable:false, unique:true, validator: {val, obj -> !val.equals(obj.origem)})
		distancia(nullable:false, min:1)
    }
	
	@Override
	def boolean equals(obj){
		def ret = false
		if(obj instanceof Rota){
			def outra = (Rota)obj
			ret = origem.equals(outra.origem) && destino.equals(outra.destino)
		}
		ret
	}
}
