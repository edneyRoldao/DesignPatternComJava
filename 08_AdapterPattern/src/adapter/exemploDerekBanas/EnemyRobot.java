package adapter.exemploDerekBanas;

import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();
	
	public void smashWithHands() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Anemy robot causes " + attackDamage + " Damage with its hands");
	}
	
	public void walkForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy robot Walks Forward " + movement + " spaces");
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("Enemy robot tramps on " + driverName);
	}
	
}
