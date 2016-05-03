package factory.abstractFactory.exemploJavacodegeeks;

/**
 * 
 * @author Edney Roldao
 * 
 * Para evitar a dependencia entre o código cliente e as factories, opcionalmente foi implementada essa classe que tem um método estático
 * e é responsável por fornecer um objeto factory desejedo para o objeto cliente.
 *
 */
public final class ParserFactoryProducer {

	private ParserFactoryProducer() {
		throw new AssertionError();
	}
	
	public static AbstractParserFactory getFactory(String factoryType) {
		
		switch(factoryType) {
			case "SPFactory":
				return new SaoPauloParserFactory();
				
			case "SCFactory":
				return new SantaCatarinaParserFactory();
		}
		
		return null;
	}
	
	
}
