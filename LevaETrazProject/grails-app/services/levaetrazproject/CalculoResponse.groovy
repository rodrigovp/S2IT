package levaetrazproject

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType

import br.org.rodnet.algoritmos.dijkstra.Vertice

@XmlAccessorType(XmlAccessType.FIELD)
class CalculoResponse {
	String resposta = "resposta"
	Vertice[] vertices
}
