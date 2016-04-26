package singleton.derekBanas;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Nesse exemplo de singleton � utilizado o modificador de acesso synchronized, onde somente uma thread pode acessar o m�todo de cada vez.
 * 
 * @author Edney Rold�o
 *
 */
public class SingletonWithSynchronized {

	String[] scrabbleLetters = {"a","a","a","a","a","a","a","a","a","a","a",
			"b","b","b","b","b","b","b","b","b","b","b",
			"c","c","c","c","c","c","c","c","c","c","c",
			"d","d","d","d","d","d","d","d","d","d","d",
			"e","e","e","e","e","e","e","e","e","e","e",
			"f","f","f","f","f","f","f","f","f","f","f",
			"g","g","g","g","g","g","g","g","g","g","g"};

	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));
	
	static boolean firstThread = true;

	
	// Criando a vari�vel de acesso global � instancia do singleton
	private static SingletonWithSynchronized firstInstance = null;
	
	
	// Criando um construtor privado para evitar a cria��o do novas inst�ncias dessa classe
	private SingletonWithSynchronized() {}
	
	
	// Os usu�rios s� ter�o acesso � vari�vel global por meio desse m�todo
	public static SingletonWithSynchronized getInstance() {
		
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
			
			// A instru��o abaixo resolve o problema do singleton quando usamos thread.
			synchronized (SingletonWithSynchronized.class) {
				if(firstInstance == null) {
					firstInstance = new SingletonWithSynchronized();
					Collections.shuffle(firstInstance.letterList);
				}
			}
			
		}
		
		return firstInstance;
	}
	// fim m�todo getInstance.
	
	
	// Outros m�todos
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
