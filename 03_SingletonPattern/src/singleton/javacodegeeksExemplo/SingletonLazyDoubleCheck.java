package singleton.javacodegeeksExemplo;

/**
 * Esse forma de implementar singleton garante a cria��o de apenas uma instancia mesmo com o uso de v�rias threads.
 * 
 * DESVANTAGEM:
 * 		C�digo muito verboso.
 * 
 * @author Edney Roldao
 *
 */
public class SingletonLazyDoubleCheck {

	private static SingletonLazyDoubleCheck singleton = null;
	
	private SingletonLazyDoubleCheck() {
	}
	
	// Para garantir o acesso de apenas uma thread por vez, precisamos verificar duas vezes
	public static synchronized SingletonLazyDoubleCheck getInstance() {
		
		if(singleton == null) {
			synchronized (SingletonLazyDoubleCheck.class) {
				if(singleton == null) {
					singleton = new SingletonLazyDoubleCheck();
				}
			}
		}
		
		return singleton;
	}
	
}
