package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class SCResponseXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("SC parsing response XML...");
		return "SP response XML message";
	}

}
