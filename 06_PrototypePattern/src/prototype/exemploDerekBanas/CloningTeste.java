package prototype.exemploDerekBanas;

public class CloningTeste {

	public static void main(String[] args) {
		
		////////////////////////////////////////////////////////////////////////
		///////////////////// Prototype pattern TESTE //////////////////////////
		////////////////////////////////////////////////////////////////////////

		
		CloneFactory animalMaker = new CloneFactory();
		
		Sheep sally = new Sheep();
		
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		
		System.out.println(sally);
		System.out.println(clonedSheep);
		
		System.out.println();		
		System.out.println("**************************");
		System.out.println();
		
		System.out.println("Sally hashcode: " + System.identityHashCode(sally));
		System.out.println("ClonedSheep hashcode: " + System.identityHashCode(clonedSheep));
	}
	
}
