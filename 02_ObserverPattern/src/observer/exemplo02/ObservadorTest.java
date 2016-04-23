package observer.exemplo02;

/**
 * 
 * @author Edney Roldão
 * Nesse exemplo são adicionados os dois observadores que são atualizados de acordo com a adição de ações.
 */
public class ObservadorTest {

	public static void main(String[] args) throws Exception {
		
		GraficoBarras gb = new GraficoBarras();
		
		AcoesLogger al = new AcoesLogger();
		
		CarteiraAcoes carteira = new CarteiraAcoes();
		
		carteira.addObservador(gb);
		carteira.addObservador(al);
		
		Thread.sleep(2000);
		carteira.adicionarAcoes("tesouro nacional", 200);

		Thread.sleep(2000);
		carteira.adicionarAcoes("Papeis Petrobras", 100);

		Thread.sleep(2000);
		carteira.adicionarAcoes("CDI", 250);

		Thread.sleep(2000);
		carteira.adicionarAcoes("papeis wallmart", 300);

		Thread.sleep(2000);
		carteira.adicionarAcoes("Divida ativa", 150);
		
		Thread.sleep(2000);
		carteira.adicionarAcoes("Divida ativa", 800);
		
		Thread.sleep(2000);
		carteira.adicionarAcoes("tesouro nacional", 200);

		Thread.sleep(2000);
		carteira.adicionarAcoes("Papeis Petrobras", 100);

		Thread.sleep(2000);
		carteira.adicionarAcoes("CDI", 250);

		Thread.sleep(2000);
		carteira.adicionarAcoes("papeis wallmart", 300);

		Thread.sleep(2000);
		carteira.adicionarAcoes("Divida ativa", 150);
		
		Thread.sleep(2000);
		carteira.adicionarAcoes("Divida ativa", 800);
		
	}
	
}
