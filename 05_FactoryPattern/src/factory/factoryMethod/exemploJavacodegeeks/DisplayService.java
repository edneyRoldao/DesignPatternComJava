package factory.factoryMethod.exemploJavacodegeeks;

/**
 * O m�todo getParser() � o nosso factoryMethod e que deve ser implementado pelas classes
 * filhas. Ser� �sse m�todo que ir� retornar o parser de XML correto.
 * 
 * Os dois m�todos desse classe trabalham em conjunto.
 * 
 * A forma de exibi��o do XML � comum entre todos os tipos existentes, por isso que o m�todo
 * displayService j� est� implementado, por�m para ele funcionar, as classes filhas devem 
 * informar qual o tipo de parser que ser� instanciado.
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
	
	// delegando o tipo de parser que ser� instanciado para as classes filhas (subclasses)
	protected abstract XMLParser getParser(); 
	
}
