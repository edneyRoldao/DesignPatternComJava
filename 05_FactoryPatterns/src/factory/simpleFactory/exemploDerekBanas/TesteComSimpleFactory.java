package factory.simpleFactory.exemploDerekBanas;

import java.util.Scanner;

/**
 * 
 * @author Edney Roldao
 *
 */
public class TesteComSimpleFactory {

	public static void main(String args) {

		EnemyShipFactory factory = new EnemyShipFactory();

		EnemyShip enemy = null;
		
		Scanner sc = new Scanner(System.in);

		String typeShipOption = "";

		System.out.println("What type ship ? (U / R / B)");
		
		if(sc.hasNextLine()) {
			typeShipOption = sc.nextLine();
			enemy = factory.makeEnemyShip(typeShipOption);
		}

		if(enemy != null) {
			doStuffEnemy(enemy);				
		}else 
			System.out.println("Enter a U, R or B next time");

		sc.close();
	}


	public static void doStuffEnemy(EnemyShip enemy) {
		enemy.displayEnemyShip();
		enemy.followHeroShip();
		enemy.enemyShipShoots();	
	}

}
