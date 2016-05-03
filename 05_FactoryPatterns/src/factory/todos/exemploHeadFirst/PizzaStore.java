package factory.todos.exemploHeadFirst;

/**
 * @author Edney Roldao
 *
 */
public abstract class PizzaStore {
	
	public Pizza pedirPizza(String tipo) {
		
		Pizza pizza = criarPizza(tipo);
		
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
		
		return pizza;
	}
	
	abstract Pizza criarPizza(String tipo);
	
}
