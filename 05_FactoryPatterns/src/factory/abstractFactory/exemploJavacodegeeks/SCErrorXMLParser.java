package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class SCErrorXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("SC parsing error XML...");
		return "SC error XML message";
	}

}
