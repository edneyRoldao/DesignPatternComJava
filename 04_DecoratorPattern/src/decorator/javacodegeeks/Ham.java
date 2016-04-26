package decorator.javacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class Ham extends PizzaDecorator {

	private final Pizza pizza;
	
	public Ham(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Ham (17.43)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 17.43;
	}

}
