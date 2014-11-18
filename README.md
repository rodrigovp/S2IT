S2IT
====

Repositório para armazenar o teste realizado para a S2 IT

Inicialmente, criou-se um modelo de domínio (com testes) contendo objetos modelados de acordo com o documento fornecido. Em seguida partiu-se para a busca de implementações do algoritmo de Dijkstra. Acabei por encontrar um feito em java, e que encontra-se em:

https://code.google.com/p/projeto-algoritmos-em-grafos-java/

O código foi obtido e, com o maven, foi gerado um jar com a biblioteca.

Em seguida, partiu-se para a criação dos serviços de:

 * carregamento de mapas;
 * geração do caminho mínimo;

Trabalhei com Grails há uns 4 anos atrás, e estou tendo as seguintes dificuldades:
 * com o mapeamento objeto-relacional;
 * com os testes de integração;

Acredito que, se eu conseguisse criar os testes de integração, seria bem mais fácil detectar os problemas de mapeamento, sem a necessidade de testes ad-hoc (subir o sistema e executá-lo).
