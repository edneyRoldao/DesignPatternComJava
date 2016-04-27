package decorator.derekBanasExemplo;

public class Mussarela extends CoberturaPizzaDecorator {

	// constructor
	public Mussarela(Pizza pizza) {
		super(pizza);
		System.out.println("adicionando massa");
		System.out.println("adicionando mussarela");
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Mussarela";
	}
	
	@Override
	public double getPreco() {
		return pizza.getPreco() + 5.48;
	}

}
