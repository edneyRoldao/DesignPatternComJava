package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class SPFeedbackXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("SP parsing feedback XML...");
		return "SP feedback XML message";
	}

}
