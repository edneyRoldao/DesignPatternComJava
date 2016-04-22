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

<b>Exemplo 01 - Caso de uso: Lobby Sports </b>
Sports Lobby is a fantastic sports site for sport lovers. They cover almost all kinds of sports and provide the latest news, information, matches scheduled dates, information about a particular player or a team. Now, they are planning to provide live commentary or scores of matches as an SMS service, but only for their premium users. Their aim is to SMS the live score, match situation, and important events after short intervals. As a user, you need to subscribe to the package and when there is a live match you will get an SMS to the live commentary. The site also provides an option to unsubscribe from the package whenever you want to.
<br/>
As a developer, the Sport Lobby asked you to provide this new feature for them. The reporters of the Sport Lobby will sit in the commentary box in the match, and they will update live commentary to a commentary object. As a developer your job is to provide the commentary to the registered users by fetching it from the commentary object when it’s available. When there is an update, the system should update the subscribed users by sending them the SMS.
<br/>
This situation clearly shows one-to-many mapping between the match and the users, as there could be many users to subscribe to a single match. The Observer Design Pattern is best suited to this situation, let’s see about this pattern and then create the feature for Sport Lobby.
<br/>
![alt tag](https://github.com/edneyRoldao/DesignPatternComJava/blob/master/supportFiles/observerExemplo02.png)

<b>Foi retirado do site javacodegeeks.com</b>
<br/>
link: https://www.javacodegeeks.com/2015/09/observer-design-pattern.html
	
<br/>
