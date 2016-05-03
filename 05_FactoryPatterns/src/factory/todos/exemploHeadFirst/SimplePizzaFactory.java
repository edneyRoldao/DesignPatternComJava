package factory.todos.exemploHeadFirst;

/**
 * @author Edney Roldao
 *
 */
public class SimplePizzaFactory {

	public Pizza criarPizza(String tipo) {
		
		Pizza pizza = null;
		
		if("queijo".equals(tipo)) {
			return new PizzaQueijoSaoPaulo();
		}
		
		if("calabresa".equals(tipo)) {
			return new PizzaCalabresaSaoPaulo();
		}
		
		if("portuguesa".equals(tipo)) {
			return new PizzaPortuguesaSaoPaulo();
		}
		
		if("palmito".equals(tipo)) {
			return new PizzaPalmitoSaoPaulo();
		}
		
		return pizza;
	}
	
}
