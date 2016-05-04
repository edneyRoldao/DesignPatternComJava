package prototype.exemploDerekBanas;

/**
 * @author Edney Roldao
 *
 */
public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep is Made - criando um novo objeto");
	}
	
	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is being Made - clonando o objeto criado antes");
		
		Sheep sheepObject = null;
		
		try {
			
			sheepObject = (Sheep) super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return sheepObject;
	}
	
	@Override
	public String toString() {
		return "Dolly is my hero";
	}

}
