package levaetrazproject

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType

@XmlAccessorType(XmlAccessType.FIELD)
class CalculoRequest {
	
	String nomeDoMapa
	String nomeDaOrigem
	String nomeDoDestino
	Integer autonomiaDoCaminhao
	BigDecimal valorDoLitroDeCombustivel
}
