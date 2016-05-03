package factory.todos.exemploHeadFirst;

/**
 * @author Edney Roldao
 *
 */
public class PizzaStoreParana extends PizzaStore {

	@Override
	Pizza criarPizza(String tipo) {

		if("calabresa".equalsIgnoreCase(tipo)) {
			return new PizzaCalabresaParana();
		}
		
		if("palmito".equalsIgnoreCase(tipo)) {
			return new PizzaPalmitoParana();
		}

		if("queijo".equalsIgnoreCase(tipo)) {
			return new PizzaQueijoParana();
		}
		
		if("portuguesa".equalsIgnoreCase(tipo)) {
			return new PizzaPortuguesaParana();
		}
		
		return null;
	}


}
