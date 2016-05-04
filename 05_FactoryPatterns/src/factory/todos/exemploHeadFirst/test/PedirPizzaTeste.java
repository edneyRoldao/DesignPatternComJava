package factory.todos.exemploHeadFirst.test;

import factory.todos.exemploHeadFirst.Pizza;
import factory.todos.exemploHeadFirst.PizzaStore;
import factory.todos.exemploHeadFirst.PizzaStoreParana;
import factory.todos.exemploHeadFirst.PizzaStoreSaoPaulo;

public class PedirPizzaTeste {

	public static void main(String[] args) {
		
		////////////////////////////////////////////////////////////////////////
		///////////////////// Factory pattern TESTE ////////////////////////////
		////////////////////////////////////////////////////////////////////////
		
		PizzaStore lojaSP = new PizzaStoreSaoPaulo();
		PizzaStore lojaPR = new PizzaStoreParana();
		
		Pizza pizza = lojaSP.pedirPizza("calabresa");
		System.out.println("Edney pedindo uma " + pizza.getNome() + "\n");
		
		System.out.println("******************************************");
		
		pizza = lojaPR.pedirPizza("palmito");
		System.out.println("giselle pedindo uma " + pizza.getNome());
		
	}
	
}
