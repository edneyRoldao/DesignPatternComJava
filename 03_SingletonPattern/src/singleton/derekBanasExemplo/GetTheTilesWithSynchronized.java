package singleton.derekBanasExemplo;

import java.util.LinkedList;

/**
 * Classe que implementa Runnable e utiliza a instancia de singleton com synchronized.
 * 
 * @author Edney Roldão
 *
 */
public class GetTheTilesWithSynchronized implements Runnable {

	@Override
	public void run() {
		
		SingletonWithSynchronized newInstance = SingletonWithSynchronized.getInstance();
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player: " + playerOneTiles);
		System.out.println("Got Tiles");
		
	}

}
