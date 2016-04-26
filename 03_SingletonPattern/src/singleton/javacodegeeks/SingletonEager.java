package singleton.javacodegeeks;

/**
 * Muitos desenvolvedores não gostam de implementar o singleton desse forma pois o objeto é instanciado no momento que a JVM carrega a classe.
 * 
 * VANTAGENS:
 *		É de longe, a forma mais simples de se criar este pattern.
 * 
 * DESVANTAGENS:
 * 		Muitos falam que esta forma não é performática pois o objeto é instanciado mesmo se não precisarmos dele. Por isso o terno Eager.
 * 
 * OBS: Para muitos desenvolvedores, essa é a melhor forma devido a sua simplicidade.
 * 
 * @author Edney Roldao
 *
 */
public class SingletonEager {

	// Criando uma instancia do objeto no momento de carregar a classe.
	private static SingletonEager singleton = new SingletonEager();
	
	// Com esse construtor, ninguém exceto esta classe poderá instanciar 
	private SingletonEager() {
	}
	
	// Método para o acesso global à instancia
	public static SingletonEager getInstance() {
		return singleton;
	}
	
}
