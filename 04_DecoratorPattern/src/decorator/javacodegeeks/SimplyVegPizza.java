package decorator.javacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class SimplyVegPizza implements Pizza {

	@Override
	public String getDescription() {
		return "SimplyVegPizza (230)";
	}

	@Override
	public double getPrice() {
		return 230;
	}

}
