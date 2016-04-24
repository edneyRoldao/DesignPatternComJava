package observer.EstacaoMetereologica.exemplo03;

/**
 * 
 * @author Edney Roldão
 *
 */
public interface Observer {

	public void atualizar(Float humidade, Float temperatura, String previsao); 
	
}
