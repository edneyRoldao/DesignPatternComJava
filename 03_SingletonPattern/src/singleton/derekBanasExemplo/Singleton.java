package singleton.derekBanasExemplo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Esta forma de implementar o Singleton pode acontecer de se criar mais de 
 * uma instancia quando duas ou mais Threads tentam obter uma instancia de Singleton ao mesmo tempo e esta ainda estiver null
 * 
 * A classe de teste com uso de threads mostrar como isso ocorre. Veja que o ID das instancias são diferentes onde teriam que ser as mesmas.
 * 
 * @author Edney Roldão
 *
 */
public class Singleton {

	String[] scrabbleLetters = {"a","a","a","a","a","a","a","a","a","a","a",
			"b","b","b","b","b","b","b","b","b","b","b",
			"c","c","c","c","c","c","c","c","c","c","c",
			"d","d","d","d","d","d","d","d","d","d","d",
			"e","e","e","e","e","e","e","e","e","e","e",
			"f","f","f","f","f","f","f","f","f","f","f",
			"g","g","g","g","g","g","g","g","g","g","g"};

	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));
	
	static boolean firstThread = true;

	
	// Criando a variável de acesso global á instancia do singleton
	private static Singleton firstInstance = null;
	
	
	// Criando um construtor privado para evitar a criação do novas instâncias dessa classe
	private Singleton() {}
	
	
	// Os usuários só terão acesso à variável global por meio desse método
	public static Singleton getInstance() {
		
		if(firstInstance == null) {
			
			if(firstThread) {
				firstThread = false;
				Thread.currentThread();
				
				try {
					
					Thread.sleep(1000);
				
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			// Este trecho será alterado no próximo exemplo para resolver o problema com as threads
			firstInstance = new Singleton();
			Collections.shuffle(firstInstance.letterList);
			
		}
		
		return firstInstance;
	}
	// fim método getInstance.
	
	
	// Outros métodos
	public LinkedList<String> getLetterList() {
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles) {
		LinkedList<String> tilesToSend = new LinkedList<>();
		
		for(int i = 0; i <= howManyTiles; i++) {
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		return tilesToSend;
	}
	
}
