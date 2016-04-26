package singleton.derekBanas;

import java.util.LinkedList;

/**
 * Para os exemplos com as threads, temos que criar uma classe que implemente a interface Runnable.
 * 
 * @author Edney Roldão
 *
 */
public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		
		Singleton newInstance = Singleton.getInstance();
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player: " + playerOneTiles);
		System.out.println("Got Tiles");
		
	}

}
