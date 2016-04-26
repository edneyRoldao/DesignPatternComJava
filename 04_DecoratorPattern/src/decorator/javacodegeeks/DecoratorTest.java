package decorator.javacodegeeks;

/**
 * 
 * @author Edney Roldao
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		
		// Criando uma instancia do tipo SimplyVegPizza
		Pizza vegPizza = new SimplyVegPizza();
		
		// Adicionando ingredientes à pizza (veja que lindo isso)
		vegPizza = new RomaTomatoes(vegPizza);
		vegPizza = new GreenOlives(vegPizza);
		vegPizza = new Spinach(vegPizza);
		System.out.println("Descricao: " + vegPizza.getDescription());
		System.out.println("Preco: " + vegPizza.getPrice());
		
		System.out.println();
		
		Pizza nonPizza = new SimplyNonVegPizza();
		nonPizza = new FetaCheese(nonPizza);
		nonPizza = new Meat(nonPizza);
		nonPizza = new RedOnions(nonPizza);
		nonPizza = new Ham(nonPizza);
		nonPizza = new Cheese(nonPizza);
		//Perceba que podemos adicionar o mesmo ingrediente duas vezes.
		nonPizza = new Cheese(nonPizza);
		System.out.println("Descricao: " + nonPizza.getDescription());
		System.out.println("Preco: " + nonPizza.getPrice());
		
	}
	
}
