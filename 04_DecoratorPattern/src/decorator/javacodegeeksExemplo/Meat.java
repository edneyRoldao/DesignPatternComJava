package decorator.javacodegeeksExemplo;

/**
 * 
 * @author Edney Roldao
 *
 */
public class Meat extends PizzaDecorator {

	private final Pizza pizza;
	
	public Meat(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Meat (33.23)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 33.23;
	}

}
