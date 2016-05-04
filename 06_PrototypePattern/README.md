#Prototype Pattern

Este pattern provê a criação de objetos a partir de outro objeto já criado anteriormente por meio de um processo de clonagem diminuindo o custo de criação desses objetos.
<br/>
Na programação OO, muitos vezes a crição de objetos pesados acaba custando muito para uma aplicação em termos de performance. Problemas de performance podem diminir a escalabilidade de um sistema.
<br/>
Vamos considerar uma aplcação onde temos um controle de autenticação e autorização bastante rigoroso e com diversos regras de negócio envolvidas, é bem provável que tenhamos um objeto bem volumoso para tratar essas regras. Cada objeto de usuário tem um objeto de controle de acesso da aplicação.
<br/>
Nós podemos usar o prototype pattern para resolver a criação desses objetos pesados para a aplicação o toda hora, criando todos os objetos de controle de acesso ao mesmo tempo, reduzindo o custo na criação deles, então, podemos obter uma cópia desses objetos sempre que for requerido pelo processo de clonagem.
<br/>
Em java existem formas nativas para se copiar um objeto na qual se deseja clonar outros objetos a partir dele. Uma desses formas é a interface Cloneable que provê um método clone. Nós precisamos implementar essa interface e o método clone de acordo com as necessidades de cada aplicação.
<br/><br/>
<b>Diagrama do Prototype design pattern - exemplo de site javacodegeeks.com</b>
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/prototype01.png)


