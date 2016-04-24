package observer.EstacaoMetereologica.exemplo03;

/**
 * 
 * @author Edney Roldão
 *
 */
public interface Subject {

	public void adicionarObservador(Observer observador);
	
	public void removerObservador(Observer observador);
	
	public void notificarObservadores();
	
}
