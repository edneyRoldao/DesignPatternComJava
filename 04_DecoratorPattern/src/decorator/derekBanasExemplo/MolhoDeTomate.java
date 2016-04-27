package decorator.derekBanasExemplo;

public class MolhoDeTomate extends CoberturaPizzaDecorator {

	// constructor
	public MolhoDeTomate(Pizza pizza) {
		super(pizza);
		System.out.println("Adicionando Molho");
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Molho de Tomate";
	}
	
	@Override
	public double getPreco() {
		return pizza.getPreco() + 1.65;
	}

}
