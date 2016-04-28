package factory.factoryMethod.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class FeedbackXMLDisplayService extends DisplayService {

	@Override
	protected XMLParser getParser() {
		return new FeedbackXMLParser();
	}

}
