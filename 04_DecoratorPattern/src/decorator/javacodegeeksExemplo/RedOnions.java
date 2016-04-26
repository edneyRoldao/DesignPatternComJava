package decorator.javacodegeeksExemplo;

/**
 * 
 * @author Edney Roldao
 *
 */
public class RedOnions extends PizzaDecorator{

	private final Pizza pizza;
	
	public RedOnions(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", RedOnions (7.85)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 7.85;
	}

}
