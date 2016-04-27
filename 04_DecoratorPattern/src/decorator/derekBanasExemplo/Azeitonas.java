package decorator.derekBanasExemplo;

public class Azeitonas extends CoberturaPizzaDecorator {

	// constructor
	public Azeitonas(Pizza pizza) {
		super(pizza);
		System.out.println("adicionando azeitonas");
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Azeitonas";
	}
	
	@Override
	public double getPreco() {
		return pizza.getPreco() + 1.95;
	}

}
