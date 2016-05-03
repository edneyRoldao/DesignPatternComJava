#Factory Patterns
Fiquei um pouco confuso Quando comecei as minhas pesquisas sobre este pattern, percebi que ele possui variações que não estavam tão claras a primeira vista. Alguns autores tratam o Factory Pattern como um único padrão e suas variações, outros tratam como padrões distintos.
<br/>
Aqui estou tratando cada Factory separadamente, porém todos estão no mesmo projeto organizados em packages.
<br/>
<b>Idéia Geral</b>
<br/>
O Padrão de Projeto Factory, encapsula a criação de objetos e permite a desvinculação de seu código dos tipos concretos.
<br/>
<b> - Simple Factory (alguns altores não reconhecem esse como um Design Pattern) </b>
<br/><hr/><br/>
Apesar de não ser considerado um design pattern por alguns autores, ele é a base para o entendimento do funcionamento do Method e Abstract Factory descritos aqui.
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
<b> - Factory Method Pattern</b>
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
<br/><br/>
<b>Quando usar o Factory Method Pattern</b>
<br/>
Quando Uma classe não sabe antecipadamente qual classe de objetos ela deve criar.
<br/>
Uma classe que deseja que as suas subclasses especifiquem os objetos que serão criados
<br/><br/>
<b>Locais onde o Factory Method é utilizado pelo JDK</b>
<br/>
java.util.Calendar
<br/>
java.util.ResourceBundle
<br/>
java.text.NumberFormat
<br/>
java.nio.charset.Charset
<br/>
java.net.URLStreamHandlerFactory
<br/><br/>
<b> - Abstract Factory Pattern</b>
<br/><hr/><br/>
Este pattern fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. O Abstract Pattern leva os conceitos do Factory Method para o próximo nível. Em java ela pode ser implementada usando uma interface ou classe abstrata.
<br/>
Diferentes Factories que são classes concretas, implementam a interface da Abstract Factory. Os clientes fazem uso desses 'fábricas' concretas para criar objetos e, além disso, não precisam conhecer qual classe está atualmente instanciada.
<br/>
Este padrão é útil para conectar diferentes grupos de objetos para alterar o comportamento de um sistema como um todo. Para cada grupo de objetos, uma Factory concreta implementa a Abstract Factory Interface para gerenciar a criação desses grupos de objetos.
<br/><br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/factory03.png)
<hr/><br/>
<b>Quando usar o Abstract Factory Pattern</b>
<br/>
Sempre que você tiver famílias de produtos que precisa criar e quiser ter certeza de que os clientes criam produtos pertencentes um ou outro.
<br/><br/>
<b>Locais onde o Factory Method é utilizado pelo JDK</b>
<br/>
java.util.Calendar
<br/>
java.util.Arrays
<br/>
java.text.NumberFormat
<br/>
java.sql.DriverManager
<br/>
java.sql.Connection
<br/>
java.sql.Statement
<br/>
java.xml.transform.TransformerFactory


