#Factory Pattern
Fiquei um pouco confuso Quando comecei as minhas pesquisas sobre este pattern, percebi que ele possui variações que não estavam tão claras a primeira vista. Alguns autores tratam o Factory Pattern como um único padrão e suas variações, outros tratam como padrões distintos.
<br/><br/>
Aqui estou tratando cada Factory separadamente, porém todos estão no mesmo projeto organizados em packages.
<br/>
<b> - O Factory</b>
<br/>
Esse padrão é responsável por cuidar dos detalhes de criação dos objetos. Quando temos uma factory, a classe cliente não vai mais precisar saber sobre os detalhes de criação dos objetos.
<br/>
De forma geral todos os padrões factory encapsulam a criação de objetos, porém o factory method e o abstract factory, apresentam um refinamento desse pattern.
<br/><br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/factory.png)
<br/>
<br/>
A imagem abaixo, mostra uma déia geral da aplicação do em factory.
<br/><br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/factory00.png)
<br/><br/>
<b> - O Factory Method</b>
<br/><hr/><br/>
Basicamente o padrão factory Method é aplicado para resolver problemas de acoplamento como o código abaixo.
<br/><br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/factory01.png)
<br/>
Perceba que no exemplo acima, sempre que mais tipos de animais forem surgindos, a classe sempre passará por modificações pois teremos que adicionar mais uma condicional. A implementação acima, fere um dos princípios de SOLD que é fechado para modificações e aberto para extensões.
<br/>
O padrão Factory Method, além de encapsular a lógica de criação dos objetos por meio da definição de uma interface, ele deixa que as subclasses decidam quais objetos criar. Este pattern permite a uma classe deferir a instanciação para subclasses.
<br/><br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/factory02.png)
<br/>
<br/>
<b> - O Abstract Factory</b>
<br/><hr/><br/>
