package prototype.exemploDerekBanas;

/**
 * @author Edney Roldao
 *
 */
public class CloneFactory {

	public Animal getClone(Animal animal) {
		return animal.makeCopy();
	}
	
}
