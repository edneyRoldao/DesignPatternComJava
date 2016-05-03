package factory.abstractFactory.exemploJavacodegeeks;

/**
 * @author Edney Roldao
 * 
 */
public class TestAbstractFactoryPattern {

	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////
		///////////////////// AbstractFactory pattern TESTE //////////////////////
		//////////////////////////////////////////////////////////////////////////
		
		AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("SPFactory");
		
		XMLParser parser = parserFactory.getParserInstance("SPORDER");
		String message = "";
		message = parser.parser();
		System.out.println(message);
		
		System.out.println("***********************************************");
		
		parserFactory = ParserFactoryProducer.getFactory("SCFactory");
		parser = parserFactory.getParserInstance("SCERROR");
		message = parser.parser();
		System.out.println(message);
		
	}
	
}
