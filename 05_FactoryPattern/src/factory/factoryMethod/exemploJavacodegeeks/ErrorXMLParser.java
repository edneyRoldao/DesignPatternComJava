package factory.factoryMethod.exemploJavacodegeeks;

/**
 * Esta classe implementa o parser de XML que transporta mensagens de erro.
 * 
 * @author Edney Roldao
 *
 */
public class ErrorXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("Parsing error XML....");
		return "Error XML Message";
	}

}
