package singleton.javacodegeeksExemplo;

/**
 * Esta forma de implementar singleton, resolve o problema de multiThread somente na primeiro vez que o m�todo for acessado
 * 
 * @author Edney Roldao
 *
 */
public class SingletonLazyMultithreaded {

	private static SingletonLazyMultithreaded singleton = null;
	
	private SingletonLazyMultithreaded() {
	}

	// Desse forma uma thread por vez pode acessar esse m�todo
	public static synchronized SingletonLazyMultithreaded getInstance() {
		if (singleton == null) 
			singleton = new SingletonLazyMultithreaded();
		
		return singleton;
	}
	
}
