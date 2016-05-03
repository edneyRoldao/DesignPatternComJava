package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 * 
 *  Esta interface deve ser implementada pelas classes concretas que representam as factories específicas para cada cliente.
 *  Estas factories vão fornecer um grupo específico de parsers de acordo com o cliente.
 *  
 *
 */
public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
	
}
