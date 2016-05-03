package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class SCOrderXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("SC parsing order XML...");
		return "SP order XML message";
	}

}
