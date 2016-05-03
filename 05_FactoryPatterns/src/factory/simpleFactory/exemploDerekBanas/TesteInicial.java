package factory.simpleFactory.exemploDerekBanas;

/**
 * 
 * @author Edney Roldao
 *
 */
public class TesteInicial {

	public static void main(String args) {
		
		////////////////////////////////////////////////////////////////////////
		///////////////////// Simple Factory pattern TESTE /////////////////////
		////////////////////////////////////////////////////////////////////////

		EnemyShip ufoShip = new UFOEnemyShip();
		
		doStuffEnemy(ufoShip);

	}

	public static void doStuffEnemy(EnemyShip enemy) {
		enemy.displayEnemyShip();
		enemy.followHeroShip();
		enemy.enemyShipShoots();	
	}

}
