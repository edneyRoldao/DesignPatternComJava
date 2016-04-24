package observer.sportsLobby.exemplo01;
/**
 * Exemplo retirado do javacodegeeks
 * https://www.javacodegeeks.com/2015/09/observer-design-pattern.html.
 * 
 * DESIGN PATTERN OBSERVER
 * 
 * Aqui os tr�s primeiros m�todos s�o chave para o uso do Pattern, por�m, podemos adicionar outros m�todos de acordo com o modelo, 
 * que � o caso do quarto m�todo.
 * 
 * @author Edney Roldao
 *
 */
public interface Subject { // Tamb�m pode ser chamado de: Sujeito ou Observado

	/**
	 * Este m�todo serve para adicionarmos os nossos Observers.
	 * Quando o Subject sofrer mudan�as, todos os os Observers registrados dever�o ser notificados
	 * 
	 * @param observer
	 */
	void subscribeObserver(Observer observer);
	
	/**
	 * Quando o Subject n�o precisar mais receber notifica��o de altera��o, devemos remover o Observer
	 * 
	 * @param observer
	 */
	void unSubscribeObserver(Observer observer);
	
	/**
	 * Este m�todo vai notificar a todos os Observers que est�o Subscribed de alguma modifica��o de estado
	 */
	void notifyObservers();
	
	/**
	 * Este m�todo � opcional para o funcionamento do Observer Pattern.
	 * 
	 * @return details about observers.
	 */
	public String subjectDetails();
	
}
