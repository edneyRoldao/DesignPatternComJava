package factory.simpleFactory.exemploDerekBanas;

/**
 * 
 * @author Edney Roldao
 *
 */
public class EnemyShipFactory {

	public EnemyShip makeEnemyShip(String enemyType) {

		if("U".equals(enemyType)) {
			return new UFOEnemyShip();
		}else if("R".equals(enemyType)) {
			return new RocketEnemyShip();
		}else if("B".equals(enemyType)) {
			return new BigUFOEnemyShip();
		}else {
			return null;
		}

	}

}
