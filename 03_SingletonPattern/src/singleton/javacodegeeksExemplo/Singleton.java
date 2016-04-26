package singleton.javacodegeeksExemplo;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Esse forma de implementar singleton garante 100% a criação de apenas uma instancia.
 * 
 * VANTAGEM:
 * 		Previne a quebra desse pattern por meio de:
 * 			
 * 													01) MultiThreads
 * 													02) classes serializadas
 * 													03) se ela for clonável
 * 													04) Usando Reflections
 * 													05) Usando class loaders
 * 
 * 
 * DESVANTAGEM:
 * 		É a mais verbosa de todas as implementações.
 * 
 * @author Edney Roldao
 *
 */
public class Singleton implements Serializable {

	// serializando com modificador final 
	private static final long serialVersionUID = 8588393999227340732L;
	
	private static Singleton singleton = null;

	// Construtor
	private Singleton() {
		if(singleton != null)
			throw new IllegalStateException("A classe ja foi instanciada !");
	}
	
	// Método de acesso global
	public static Singleton getInstance() {
		return singleton;
	}
	
	private Object readResolve() throws ObjectStreamException {
		return singleton;
	}
	
	private Object writeReplace() throws ObjectStreamException {
		return singleton;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Esta e uma classe do Pattern de Singleton, portanto nao pode ser clonada");
	}
	
	@SuppressWarnings({ "unused", "rawtypes" })
	private static Class getClass(String className) throws ClassNotFoundException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		if(loader == null)
			loader = Singleton.class.getClassLoader();
		
		return (loader.loadClass(className));
	}
	
}
