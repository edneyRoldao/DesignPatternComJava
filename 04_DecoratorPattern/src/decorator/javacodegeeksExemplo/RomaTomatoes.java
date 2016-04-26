package decorator.javacodegeeksExemplo;

/**
 * 
 * @author Edney Roldao
 *
 */
public class RomaTomatoes extends PizzaDecorator{

	private final Pizza pizza;
	
	public RomaTomatoes(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", RomaTomatoes (10.11)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 10.11;
	}

}
