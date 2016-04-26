package singleton.derekBanasExemplo;

/**
 * 
 * Esta classe de teste verifica as duas implementa��es de singleton.
 * 
 * @author Edney Rold�o
 *
 */
public class ScrabbleTestWithThreads {

	public static void main(String[] args) throws InterruptedException {
		
		// Testando o singleton sem a implementa��o do synchronized. O id das instancias s�o diferentes.
		Runnable getTiles = new GetTheTiles();
		Runnable getTilesAgain = new GetTheTiles();
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
		
		// testando o singleton com a implementa��o do synchronized. Perceba que o id das instancias s�o iguais
		Thread.sleep(3000);
		System.out.println();
		System.out.println("Agora s�o a mesma instancia.");
		Runnable getTiles2 = new GetTheTilesWithSynchronized();
		Runnable getTilesAgain2 = new GetTheTilesWithSynchronized();
		new Thread(getTiles2).start();
		new Thread(getTilesAgain2).start();

		
	}
	
}
