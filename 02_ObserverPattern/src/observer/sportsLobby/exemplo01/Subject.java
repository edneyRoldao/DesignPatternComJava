package observer.sportsLobby.exemplo01;
/**
 * Exemplo retirado do javacodegeeks
 * https://www.javacodegeeks.com/2015/09/observer-design-pattern.html.
 * 
 * DESIGN PATTERN OBSERVER
 * 
 * Aqui os três primeiros métodos são chave para o uso do Pattern, porém, podemos adicionar outros métodos de acordo com o modelo, 
 * que é o caso do quarto método.
 * 
 * @author Edney Roldao
 *
 */
public interface Subject { // Também pode ser chamado de: Sujeito ou Observado

	/**
	 * Este método serve para adicionarmos os nossos Observers.
	 * Quando o Subject sofrer mudanças, todos os os Observers registrados deverão ser notificados
	 * 
	 * @param observer
	 */
	void subscribeObserver(Observer observer);
	
	/**
	 * Quando o Subject não precisar mais receber notificação de alteração, devemos remover o Observer
	 * 
	 * @param observer
	 */
	void unSubscribeObserver(Observer observer);
	
	/**
	 * Este método vai notificar a todos os Observers que estão Subscribed de alguma modificação de estado
	 */
	void notifyObservers();
	
	/**
	 * Este método é opcional para o funcionamento do Observer Pattern.
	 * 
	 * @return details about observers.
	 */
	public String subjectDetails();
	
}
