package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class SCFeedbackXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("SC parsing feedback XML...");
		return "SP feedback XML message";
	}

}
