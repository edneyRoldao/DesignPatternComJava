package factory.factoryMethod.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class OrderXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("Parsing order XML...");
		return "order XML Message";
	}
	
}
