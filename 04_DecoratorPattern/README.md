#Decorator Pattern

A idéia geral desse pattern é acrescentar novas funcionalidades ou responsabilidades à um objeto dinamicamente, sem alterar o código fonte do mesmo. Isso é feito através da criação de um segundo objeto (Decorator) que envolve (encapsula) o objeto original.
<br/>
O objeto Decorator contém uma referência do objeto alvo (atual) e atende todas as chamadas do objeto alvo que está encapsulado nele. O objeto decorator pode acrescentar funcionalidades adicionais ao objeto original antes e/ou depois de passar as chamadas para o objeto que está encapsulando nele.  	
<br/>
Com esse comportamento, esse pattern garante que uma funcionalidade adicional possa ser adicionada a um determinado objeto externamente em tempo de execução sem modificações em sua abstração.
<br/>
De forma contextual, imagine que um o objeto carro sofre alterações em seu preço final de acordo com os opcionais que o cliente deseja escolher, esse lista de opcionais é gigante.
exemplo: vidro elétrico, roda de liga leve, kit multimidia, trava elétrica, direção elétrica, controle de estabilidade, air bag, etc... Não faz sentido adicionar todos esses elementos na classe Carro pois esta pode sofrer alterações constantes. O Decorator Pattern veio para resolver esse tipo de problema.
<br/>
<br/>
O biblioteca java.io utiliza largamente este pattern.
<hr/>
<b>Diagrama do Decorator Pattern</b>
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/decorator.png)
<br/>
<hr/>
<b>Exemplo 01 - Caso de uso: Pizzaria</b>
<br/>
Esse exemplo é bem simples, temos um sistema de venda de pizzas. Cada tipo de pizza possui um valor principal, e este valor vai aumentando conforma novos
ingredientes extras são adicionados na pizza. Veja como ocorre a soma dos valores com o Decorator Pattern com esse exemplo.
<br/><br/>
Diagrama de classes
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/decoratorExemplo01.png)
<br/>
<b>Exemplo retirado de: Site javacodegeeks.com</b>
<br/>
link: https://www.javacodegeeks.com/2015/09/decorator-design-pattern.html
<br/>
<br/>
<hr/>
<b>Exemplo 02 - Caso de uso: Também Pizzaria</b>
<br/>
Existem pequenas diferenças em relação ao exemplo01, porém é de total importancia para entender o Pattern
<br/><br/>
Compare o desenho com o print da classe de teste e seu resultado.
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/decoratorExemplo02.png)
<br/>
<b>Exemplo retirado de: Tutorial Derek Banas</b>
<br/>
link: https://www.youtube.com/watch?v=j40kRwSm4VE&index=11&list=PLF206E906175C7E07
<br/>
<br/>
<hr/>
<b>Exemplo 03 - Uso da biblioteca java.io</b>
<br/>
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/decoratorExemplo03.png)
<br/>
<b>Exemplo retirado de: Use a cabeça ! - Padrões de Projetos</b>
<br/>
