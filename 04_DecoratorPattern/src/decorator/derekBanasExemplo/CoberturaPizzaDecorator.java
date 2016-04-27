package decorator.derekBanasExemplo;

/**
 * 
 * @author Edney Roldao
 *
 */
public abstract class CoberturaPizzaDecorator implements Pizza {

	protected Pizza pizza;
	
	// Construtor
	public CoberturaPizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao();
	}
	
	@Override
	public double getPreco() {
		return pizza.getPreco();
	}
	
}
