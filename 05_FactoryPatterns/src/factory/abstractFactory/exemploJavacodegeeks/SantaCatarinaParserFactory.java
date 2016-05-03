package factory.abstractFactory.exemploJavacodegeeks;

public class SantaCatarinaParserFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {

		switch(parserType) {
		
		case "SCERROR":
			return new SCErrorXMLParser();
		case "SCFEEDBACK":
			return new SCFeedbackXMLParser();
		case "SCORDER":
			return new SCOrderXMLParser();
		case "SCRESPONSE":
			return new SCResponseXMLParser();
		}
		
		return null;
	}

}
