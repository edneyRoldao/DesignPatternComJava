package factory.factoryMethod.exemploJavacodegeeks;

/**
 * Perceba que instanciamos a classe de serviço que exibe o nosso XML a partir da classe
 * abstrata que delega que tipo de parser deve ser criado.
 * 
 * @author Edney Roldao
 *
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////
		///////////////////// FactoryMethod pattern TESTE ///////////////////////////
		////////////////////////////////////////////////////////////////////////////
		
		/**
		 * Estamos usando a especialização de cada classe filha a partir do pai.
		 * Esse é o polimorfismo.
		 */
		
		DisplayService displayXML = new FeedbackXMLDisplayService();
		displayXML.display();
		
		displayXML = new ErrorXMLDisplayService();
		displayXML.display();
		
		displayXML = new OrderXMLDisplayService();
		displayXML.display();

		displayXML = new ResponseXMLDisplayService();
		displayXML.display();
		
	}
	
}
