package decorator.derekBanasExemplo;

public class MontarPizzaTeste {

	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////
		///////////////////// Decorator pattern TESTE ////////////////////////////
		//////////////////////////////////////////////////////////////////////////

		Pizza pizzaBasica = new MolhoDeTomate(new Mussarela(new Azeitonas(new Cebola(new BaseDaPizza()))));
		System.out.println("Ingredientes da Pizza: " + pizzaBasica.getDescricao());
		System.out.println("Preço da pizza: " + pizzaBasica.getPreco());
		
	}

}
