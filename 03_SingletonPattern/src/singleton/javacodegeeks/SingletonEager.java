package singleton.javacodegeeks;

/**
 * Muitos desenvolvedores n�o gostam de implementar o singleton desse forma pois o objeto � instanciado no momento que a JVM carrega a classe.
 * 
 * VANTAGENS:
 *		� de longe, a forma mais simples de se criar este pattern.
 * 
 * DESVANTAGENS:
 * 		Muitos falam que esta forma n�o � perform�tica pois o objeto � instanciado mesmo se n�o precisarmos dele. Por isso o terno Eager.
 * 
 * OBS: Para muitos desenvolvedores, essa � a melhor forma devido a sua simplicidade.
 * 
 * @author Edney Roldao
 *
 */
public class SingletonEager {

	// Criando uma instancia do objeto no momento de carregar a classe.
	private static SingletonEager singleton = new SingletonEager();
	
	// Com esse construtor, ningu�m exceto esta classe poder� instanciar 
	private SingletonEager() {
	}
	
	// M�todo para o acesso global � instancia
	public static SingletonEager getInstance() {
		return singleton;
	}
	
}
