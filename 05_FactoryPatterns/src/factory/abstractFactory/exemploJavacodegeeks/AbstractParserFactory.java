package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 * 
 *  Esta interface deve ser implementada pelas classes concretas que representam as factories espec�ficas para cada cliente.
 *  Estas factories v�o fornecer um grupo espec�fico de parsers de acordo com o cliente.
 *  
 *
 */
public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
	
}
