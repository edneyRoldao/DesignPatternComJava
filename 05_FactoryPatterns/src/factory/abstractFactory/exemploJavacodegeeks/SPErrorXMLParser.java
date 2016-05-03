package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class SPErrorXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("SP parsing error XML...");
		return "SP error XML message";
	}

}
