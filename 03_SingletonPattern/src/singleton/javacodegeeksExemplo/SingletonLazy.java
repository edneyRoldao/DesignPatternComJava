package singleton.javacodegeeksExemplo;

/**
 * Esta forma de implementar singleton foi sugerida para que a classe só seja instanciada quando ela for utilizada pela primeira vez.
 * 
 * PROBLEMA:
 * 		Se o primeiro acesso ocorre por multiplas threads ao mesmo tempo, cada thread vai criar uma instancia diferente.
 * 		Esse problema pode ser visto aqui executando o classe singleton.derekBanas.ScrabbleTestWithThreads.
 * 
 * @author Edney Roldao
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy singleton = null;
	
	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if(singleton == null)
			singleton = new SingletonLazy();
		
		return singleton;
	}
	
}
