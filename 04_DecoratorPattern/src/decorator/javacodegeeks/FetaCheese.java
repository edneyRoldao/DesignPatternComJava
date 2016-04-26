package decorator.javacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class FetaCheese extends PizzaDecorator {

	private final Pizza pizza;
	
	public FetaCheese(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", FetaCheese (25.99)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 25.99;
	}

}
