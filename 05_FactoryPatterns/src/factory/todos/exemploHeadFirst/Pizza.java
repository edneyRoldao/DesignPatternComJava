package factory.todos.exemploHeadFirst;

import java.util.ArrayList;

/**
 * @author Edney Roldao
 *
 */
public abstract class Pizza {
	
	String nome;
	String massa;
	String molho;
	ArrayList<String> coberturas = new ArrayList<>();
	
	public void preparar() {
		System.out.println("Preparando " + nome);
		System.out.println("Colocando a massa...");
		System.out.println("Adicionado o molho...");
		System.out.println("Adicionando as coberturas: ");
		for(String c : coberturas) {
			System.out.println(" " + c);
		}
	}
	
	public void assar() {
		System.out.println("Assar por 30 minutos a 350 graus");
	}
	
	public void cortar() {
		System.out.println("Cortar a pizza em oito pedacos na diagonal");
	}
	
	public void embalar() {
		System.out.println("Colocar a pizza na caixa com o logo da franquia");
	}

	public String getNome() {
		return nome;
	}
	
}
