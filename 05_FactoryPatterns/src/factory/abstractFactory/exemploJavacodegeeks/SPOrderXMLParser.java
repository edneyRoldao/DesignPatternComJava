package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class SPOrderXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("SP parsing order XML...");
		return "SP order XML message";
	}

}
