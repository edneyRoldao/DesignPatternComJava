package decorator.javacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class SimplyNonVegPizza implements Pizza {

	@Override
	public String getDescription() {
		return "SimplyNonVegPizza (350)";
	}

	@Override
	public double getPrice() {
		return 350;
	}

}
