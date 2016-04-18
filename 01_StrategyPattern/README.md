#Strategy Pattern

<b>Conceitos básicos desse Padrão</b>

É segunda-feira, você acabou de chegar no trabalho e se lembra que ainda não conseguiu terminar de implementar a nova funcionalidade do sistema. Você não está nada animado pois terá que abrir aquela famosa classe que da dor de cabeça só de pensar, é aquela com mais de 3000 linhas de código, milhares de if, else, for, while, etc... .
Um dos principais benefícios da utilização desse pattern é a diminuição de condicionais dentro da uma classe, ou seja quando você precisa usar somente um comportamento dentre diversos dinâmicamente.
Não vou me alongar aqui, porém, uma classe como a descrita acima quebra diversas premissas da OO, exemplo: falta de coesão e estar aberta a modificações.
<br/>

<b>O que realmente vamos fazer ?</b>
Vamos definir uma família de algoritmos que resolvem problemas similares,  encapsular cada um deles em diferentes classes e deixa-los intercambiáveis por meio do conceito de composição.
O padrão strategy deixa a variação dessa família de algoritmos independente dos clientes que a utilizam.

<b>Vantagens de usar esse padrão</b>

redução do número de condicionais
<br/>
avita código duplicado
<br/>
Abstrai código complexo dos clientes
<br/>


<b>Desvantagens de usar esse padrão</b>
Aumento do número de classes pois usamos uma para cada algoritmo.
<br/>
Aumento da complexidade na criação do objeto que tem as classes acima como dependência.

<br/><br/>
<b>Exemplo 01 - Caso de uso: A famosa superClasse Aminal</b>
Esse é um exemplo mais simples para iniciar o entendimento.
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/strategyExemplo01.png)

<br/><br/>
<b>Exemplo 02 - Caso de uso: Calculo da conta de Estacionamento de veiculos</b>
Diferente do primeiro exemplo, está cenário com o strategy é uma ótima solução.
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/strategyExemplo02.png)

<br/><br/>
<b>Exemplo 03 - Caso de uso: Formatador de textos</b>
Este exemplo é o mais rápido de se implementar.
<br/>
<b>Foi retirado do site javacodegeeks.com</b>
<br/>
link: https://www.javacodegeeks.com/2015/09/strategy-design-pattern.html
