package decorator.javacodegeeksExemplo;

/**
 * 
 * @author Edney Roldao
 *
 */
public class Spinach extends PizzaDecorator {

	private final Pizza pizza;
	
	public Spinach(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Spinach (7.72)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 7.72;
	}

}
