package singleton.derekBanasExemplo;

/**
 * 
 * Esta classe de teste verifica as duas implementações de singleton.
 * 
 * @author Edney Roldão
 *
 */
public class ScrabbleTestWithThreads {

	public static void main(String[] args) throws InterruptedException {
		
		// Testando o singleton sem a implementação do synchronized. O id das instancias são diferentes.
		Runnable getTiles = new GetTheTiles();
		Runnable getTilesAgain = new GetTheTiles();
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
		
		// testando o singleton com a implementação do synchronized. Perceba que o id das instancias são iguais
		Thread.sleep(3000);
		System.out.println();
		System.out.println("Agora são a mesma instancia.");
		Runnable getTiles2 = new GetTheTilesWithSynchronized();
		Runnable getTilesAgain2 = new GetTheTilesWithSynchronized();
		new Thread(getTiles2).start();
		new Thread(getTilesAgain2).start();

		
	}
	
}
