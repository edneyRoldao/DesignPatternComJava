package decorator.derekBanasExemplo;

public class Cebola extends CoberturaPizzaDecorator {

	// constructor
	public Cebola(Pizza pizza) {
		super(pizza);
		System.out.println("adicionando cebola");
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Cebola";
	}
	
	@Override
	public double getPreco() {
		return pizza.getPreco() + 0.75;
	}

}
