package observer.carteiraDeAcoes.exemplo02;

/**
 * Essa classe vai escutar as mudanças na quantidade de ações e registrar no console.
 * 
 * @author Edney Roldão
 *
 */
public class AcoesLogger implements Observador { // Observador que vai imprimir as informações no console.

	@Override
	public void mudancaQuantidade(String acao, int quantidade) {
		System.out.println("Alterada a quantidade da acao " + acao + " para " + quantidade);
	}

}
