package factory.simpleFactory.exemploDerekBanas;

import java.util.Scanner;

/**
 * 
 * @author Edney Roldao
 *
 */
public class TesteSemSimpleFactory {

	public static void main(String args) {
		
		////////////////////////////////////////////////////////////////////////
		///////////////////// Simple Factory pattern TESTE /////////////////////
		////////////////////////////////////////////////////////////////////////

		EnemyShip enemy = null;
		
		Scanner sc = new Scanner(System.in);

		String enemyShipOption = "";

		System.out.println("What type of ship ? (U / R)");
		if(sc.hasNextLine()) {
			enemyShipOption = sc.nextLine();		
		}

		if("U".equals(enemyShipOption)) {
			enemy = new UFOEnemyShip();
		}else if("R".equals(enemyShipOption)) {
			enemy = new RocketEnemyShip();			
		}		

		doStuffEnemy(enemy);

		sc.close();
	}

	public static void doStuffEnemy(EnemyShip enemy) {
		enemy.displayEnemyShip();
		enemy.followHeroShip();
		enemy.enemyShipShoots();	
	}

}
