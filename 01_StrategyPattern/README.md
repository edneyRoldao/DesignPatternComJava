#Strategy Pattern
	
Para explicar o Strategy Pattern, vamos seguir o caso de uso do exemplo03:
<br/>
Sua aplicação possuí um formatador de textos com diversos formatos onde, cada formato deve ser aplicado em uma determinada situação. Sem o conhecimento do Strategy, teríamos duas opções óbvias para implementar
esses formatadores:
<br/>
01: Criar um super método com diversos if ou algo do tipo que formata o texto de acordo com a situação. Este é para desenvolvedores iniciantes que não conhecem orientação a objetos.
<br/>
02: Podemos utilizar Herança, nesse caso, teríamos uma classe Pai Formatador e as classes filhas onde cada uma teria seu formatador específico. Desse forma não conseguimos intercambiabilidade entre essas implementações, ou seja, se o formatador A precisar saber formatar da mesma forma que o formatador B, teríamos que duplicar o códido que está no B para o A.
<br/>
O Strategy Pattern cria uma família de algoritmos que resolvem o mesmo problema de formas diferentes, nesse caso formatar textos, encapsula cada um deles separadamente, e finalmente,
torna cada um desses algoritmos intercambiáves. A premissão desse pattern é essa, o cliente pode trocar a implementação dinâmicamente de acordo com a sua necessidade.
<br/>

<b>O que realmente vamos fazer ?</b>
Vamos definir uma família de algoritmos que resolvem problemas similares,  encapsular cada um deles em diferentes classes e deixa-los intercambiáveis por meio do conceito de composição.
O padrão strategy deixa a variação dessa família de algoritmos independente dos clientes que a utilizam.

<b>Vantagens de usar esse padrão</b>

redução do número de condicionais
<br/>
evita código duplicado
<br/>
Abstrai códigos complexos dos clientes
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
<br/>
<b>Exemplo retirado de: Tutorial youtube - Derek Banas Design Patterns</b>
<hr/>
<br/><br/>
<b>Exemplo 02 - Caso de uso: Calculo da conta de Estacionamento de veiculos</b>
<br/>
Diferente do primeiro exemplo, este cenário com o strategy é uma ótima solução.
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/strategyExemplo02.png)
<b>Exemplo retirado de: Livro da casa do código - Design Pattern</b>
<hr/>
<br/><br/>
<b>Exemplo 03 - Caso de uso: Formatador de textos</b>
<br/>
Digamos que estamos desenvolvendo uma aplicação que ajuda estudantes de qualquer curso a formatar TCC.
<br/> 
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/strategyExemplo03.png)
<br/>
<b>Exemplo retirado de: Site javacodegeeks.com</b>
<br/>
link: https://www.javacodegeeks.com/2015/09/strategy-design-pattern.html








