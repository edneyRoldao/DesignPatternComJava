package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class SPResponseXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("SP parsing response XML...");
		return "SP response XML message";
	}

}
