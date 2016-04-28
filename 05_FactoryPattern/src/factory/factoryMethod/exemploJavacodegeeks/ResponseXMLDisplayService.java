package factory.factoryMethod.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class ResponseXMLDisplayService extends DisplayService {

	@Override
	protected XMLParser getParser() {
		return new ResponseXMLParser();
	}

}
