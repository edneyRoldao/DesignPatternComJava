package factory.abstractFactory.exemploJavacodegeeks;

public class SaoPauloParserFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {

		switch(parserType) {
		
		case "SPERROR":
			return new SPErrorXMLParser();
		case "SPFEEDBACK":
			return new SPFeedbackXMLParser();
		case "SPORDER":
			return new SPOrderXMLParser();
		case "SPRESPONSE":
			return new SPResponseXMLParser();
		}
		
		return null;
	}

}
