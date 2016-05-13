#Command Pattern

Este padrão encapsula uma requisição como um objeto, o que lhe permite parametrizar outros objetos com diferentes
requisições, enfileirar ou registrar requisições e implementar recursos de cancelamento de operações.
<br/>
Um objeto que representa um comando, encapsula uma solicitação vinculando um conjunto de ações em um receptor específico. Para fazer isso, ele empacota as ações e o receptor em um objeto que expõe um único método, geralmente chamado de execute(). Quando o método execute é invocado, as ações são chamadas no receptor. Externamente, nenhum outro objeto sabe realmente quais ações são executadas em qual receptor, eles apenas sabem que suas solicitações são atendidas quando o método execute é acionado.
<br/>




