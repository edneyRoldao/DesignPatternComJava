package decorator.javacodegeeksExemplo;

/**
 * 
 * @author Edney Roldao
 *
 */
public class GreenOlives extends PizzaDecorator {

	private final Pizza pizza;
	
	public GreenOlives(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", GreenOlives (5.63)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 5.63;
	}

}
