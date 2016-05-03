package factory.factoryMethod.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class ResponseXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("Parsing response XML...");
		return "Response XML Message";
	}
	
}
