package observer.carteiraDeAcoes.exemplo02;

/**
 * Essa classe vai escutar as mudan�as na quantidade de a��es e registrar no console.
 * 
 * @author Edney Rold�o
 *
 */
public class AcoesLogger implements Observador { // Observador que vai imprimir as informa��es no console.

	@Override
	public void mudancaQuantidade(String acao, int quantidade) {
		System.out.println("Alterada a quantidade da acao " + acao + " para " + quantidade);
	}

}
