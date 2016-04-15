# Bem vindo ao Strategy Pattern

<b>Conceitos básicos desse Padrão</b>

É segunda-feira, você acabou de chegar no trabalho e se lembra que ainda não conseguiu terminar de resolver uma pequena inconsistêcia na aplicação que você já está acostumado a dar manutenção, só que você não está nada animado pois será nescessário dar uma 'ajustadinha' em uma classe meio encardida de se mexer, sabe... aquela com mais de 600 linhas de código em um único método, milhares de if, else, for, while que só de pensar dá arrepios.
Um dos principais benefícios da utilização desse pattern é a diminuição de condicionais dentro da uma classe, ou seja quando você precisa usar somente um comportamento entre diversos outros dinâmicamente.
Não vou me alongar aqui, porém, uma classe como a descrita acima quebra diversas premissas da OO, exemplo: falta de coesão e estar aberta a modificações.
Procure saber mais por meia de livros como os da casa do código dentre outros. 
<br/>

<b>O que realmente vamos fazer ?</b>
Vamos definir uma família de algoritmos que resolvem problemas similares,  encapsular cada um deles e deixa-los intercambiáveis.
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