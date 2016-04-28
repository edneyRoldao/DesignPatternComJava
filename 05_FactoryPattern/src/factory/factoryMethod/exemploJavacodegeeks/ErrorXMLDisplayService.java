package factory.factoryMethod.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class ErrorXMLDisplayService extends DisplayService {

	@Override
	protected XMLParser getParser() {
		return new ErrorXMLParser();
	}

}
