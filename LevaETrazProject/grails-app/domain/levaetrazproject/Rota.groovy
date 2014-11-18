package levaetrazproject


class Rota {

	Local origem
	Local destino
	Integer extensao
	
    static constraints = {
		origem(nullable:false, unique:true, validator: {val, obj -> !val.equals(obj.destino)})
		destino(nullable:false, unique:true, validator: {val, obj -> !val.equals(obj.origem)})
		extensao(nullable:false, min:1)
    }
	
	Integer lerExtensao(){
		extensao
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
	
	Local lerVizinhoDo(Local local){
		Local ret = null
		if(origem.equals(local)){
			ret = destino
		}
		else if (destino.equals(local)){
			ret = origem
		}
		ret
	}
}
