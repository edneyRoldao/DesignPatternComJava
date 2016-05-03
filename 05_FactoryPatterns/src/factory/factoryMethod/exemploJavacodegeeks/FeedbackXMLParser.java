package factory.factoryMethod.exemploJavacodegeeks;

/**
 * Esta classe implementa o parser de XML que transporta mensagens de feedback.
 * @author Edney Roldao
 *
 */
public class FeedbackXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("Parsing feedback XML...");
		return "feedback XML Message";
	}

}
