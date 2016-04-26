package singleton.derekBanas;

import java.util.LinkedList;

/**
 * Quanto o acesso as instancias de singleton não foram por meio de threads, esse abordagem é excelente.
 * 
 * @author Edney Roldão
 *
 */
public class ScrabbleTest {

	public static void main(String[] args) {

		// Instance one
		Singleton newInstance = Singleton.getInstance();
		System.out.println("Innstance ID: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 1: " + playerOneTiles);
		System.out.println(newInstance.getLetterList());
		
		System.out.println();
		
		// Instance two
		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));
		System.out.println(instanceTwo.getLetterList());
		LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);
		System.out.println("Player 2: " + playerTwoTiles);
		System.out.println(instanceTwo.getLetterList());
		
		
	}
	
}
