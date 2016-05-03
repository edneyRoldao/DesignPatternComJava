package factory.factoryMethod.exemploJavacodegeeks;

/**
 * O método getParser() é o nosso factoryMethod e que deve ser implementado pelas classes
 * filhas. Será ésse método que irá retornar o parser de XML correto.
 * 
 * Os dois métodos desse classe trabalham em conjunto.
 * 
 * A forma de exibição do XML é comum entre todos os tipos existentes, por isso que o método
 * displayService já está implementado, porém para ele funcionar, as classes filhas devem 
 * informar qual o tipo de parser que será instanciado.
 *  
 * 
 * @author Edney Roldao
 *
 */
public abstract class DisplayService {

	public void display() {
		XMLParser parser = getParser();
		String msg = parser.parser();
		System.out.println(msg);
	}
	
	// delegando o tipo de parser que será instanciado para as classes filhas (subclasses)
	protected abstract XMLParser getParser(); 
	
}
