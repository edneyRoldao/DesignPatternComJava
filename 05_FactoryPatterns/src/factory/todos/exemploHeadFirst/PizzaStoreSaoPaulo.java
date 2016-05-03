package factory.todos.exemploHeadFirst;

/**
 * @author Edney Roldao
 *
 */
public class PizzaStoreSaoPaulo extends PizzaStore {

	@Override
	Pizza criarPizza(String tipo) {

		if("calabresa".equalsIgnoreCase(tipo)) {
			return new PizzaCalabresaSaoPaulo();
		}
		
		if("palmito".equalsIgnoreCase(tipo)) {
			return new PizzaPalmitoSaoPaulo();
		}

		if("queijo".equalsIgnoreCase(tipo)) {
			return new PizzaQueijoSaoPaulo();
		}
		
		if("portuguesa".equalsIgnoreCase(tipo)) {
			return new PizzaPalmitoSaoPaulo();
		}
		
		return null;
	}


}
