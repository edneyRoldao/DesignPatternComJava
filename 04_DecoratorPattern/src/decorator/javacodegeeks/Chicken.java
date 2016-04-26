package decorator.javacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class Chicken extends PizzaDecorator {

	private final Pizza pizza;
	
	public Chicken(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Chicken (15.72)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 15.72;
	}

}
