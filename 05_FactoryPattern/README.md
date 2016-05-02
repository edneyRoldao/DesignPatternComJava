#Factory Pattern
Fiquei um pouco confuso Quando comecei as minhas pesquisas sobre este pattern, percebi que ele possui variações que não estavam tão claras a primeira vista. Alguns autores tratam o Factory Pattern como um único padrão e suas variações, outros tratam como padrões distintos.
<br/><br/>
Aqui estou tratando cada Factory separadamente, porém todos estão no mesmo projeto separados por packages diferentes.
<br/>
<b> - O Factory</b>
<br/>
Basicamente o padrão factory é aplicado para resolver problemas como o código abaixo.
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/factory01.png)
<br/>
Esse padrão é responsável por cuidar dos detalhes de criação dos objetos. Quando temos uma factory, a classe do exemplo acima chama um método factory e esse devolve o objeto correto, ou seja, ela não vai mais precisar saber sobre os detalhes de criação dos objetos.
<br/>
Perceba que no exemplo acima, sempre que mais tipos de animais forem surgindos, a classe sempre passará por modificações pois teremos que adicionar mais uma condicional. A implementação acima, fere um dos princípios de SOLD que é fechado para modificações e aberto para extensões.

<b> - O Factory Method</b>
<br/>

<br/>
<b> - O Abstract Factory</b>
<br/>
<br/>