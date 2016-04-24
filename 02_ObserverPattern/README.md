#Observer Pattern

este padrão propõe um modelo de notificação de mudança de estado de um determinado objeto.
Alguns frameworks que são configurados por meio de arquivos tipo properties, utilizam esse pattern para notificar objetos interessados 
nas alterações desses arquivos. 
<br/>
O padrão Observer define um relacionamento one-to-many entre os objetos, então sempre que o objeto ou arquivo properties sofre mudança de estado, 
todas os objetos dependentes desse relacionamente são notificados e atualizados.
De forma contextual, imagine o processo de assinatura de uma revista ou jornal, sempre que sai uma nova edição, esta revista é enviada para todos os seus assinantes. Quando um assinante cancela a sua assinatura, o processo de envio da revista continue o mesmo, porém a pessoa que não é mais assinante, não irá receber novas edições.
Nesse pattern, iremos falar muito do <b>Subject ou Sujeito</b> em uma tradução livre, que no caso representa a Revista e os Observers ou Observadores, onde são representados pelos assinantes da revista.
<br/>

<b>Diagrama Geral do Observer Pattern</b>	
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/observerExemplo01.png)

<br/><br/>

<hr/>
<b>Exemplo 01 - Caso de uso: Lobby Sports </b>
<br/>
Sports Lobby is a fantastic sports site for sport lovers. They cover almost all kinds of sports and provide the latest news, information, matches scheduled dates, information about a particular player or a team. Now, they are planning to provide live commentary or scores of matches as an SMS service, but only for their premium users. Their aim is to SMS the live score, match situation, and important events after short intervals. As a user, you need to subscribe to the package and when there is a live match you will get an SMS to the live commentary. The site also provides an option to unsubscribe from the package whenever you want to.
<br/>
As a developer, the Sport Lobby asked you to provide this new feature for them. The reporters of the Sport Lobby will sit in the commentary box in the match, and they will update live commentary to a commentary object. As a developer your job is to provide the commentary to the registered users by fetching it from the commentary object when it’s available. When there is an update, the system should update the subscribed users by sending them the SMS.
<br/>
This situation clearly shows one-to-many mapping between the match and the users, as there could be many users to subscribe to a single match. The Observer Design Pattern is best suited to this situation, let’s see about this pattern and then create the feature for Sport Lobby.
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/observerExemplo02.png)

<b>Exemplo retirado de: Site javacodegeeks.com</b>
<br/>
link: https://www.javacodegeeks.com/2015/09/observer-design-pattern.html
<br/>

<hr/>
<b>Exemplo 02 - Caso de uso: Carteira de ações </b>
<br/>
O exemplo que será abordado envolve um objeto que representa uma carteira de ações. Essa carteira possui um mapa com os códigos das ações e sua respectiva quantidade. De acordo com as ações do usuário ou com gatilhos configurados na aplicação, ações podem ser compradas ou vendidas alterando sua quantidade. A questão é que existem diversas classes interessadas em saber quando uma informação é alterada
nessa classe para poder executar a sua lógica. Por exemplo, um componente que exibe um gráfico com a quantidade de cada ação da carteira precisa saber quando houve uma mudança para ser atualizado. Outro exemplo seria um componente que fizesse um log das alterações realizadas. Poderia também existir um componente para fazer a auditoria dos dados.
<br/>
<b>Exemplo retirado de: Livro da casa do código - Design Pattern</b>
<br/>

<hr/>
<b>Exemplo 03 - Caso de uso: Estação Metereológica </b>
<br/>
Agora o nosso Subject vulgo Sujeito vulgo ObjetoObservado será uma classe que recebe informações de temperatura, humidade e previsão do tempo, os Obserbers (Obsevadores) serão aqueles que desejam exibir essas informações em dispositivos distintos, exemplo:
Smartphone, website, console. Quando os dados na estação de tempo são atualizados, todos os dispositivos devem ser notificados para atualizarem as informações em seus dispositivos.
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/observerExemplo03.png)
<br/>
<b>Exemplo retirado de: Use a Cabeça ! - Padrões de Projeto (melhor referencia para iniciantes)</b>
<br/>

