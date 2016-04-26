package decorator.javacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public abstract class PizzaDecorator implements Pizza{

	@Override
	public String getDescription() {
		return "Toppings";
	}
	
}
