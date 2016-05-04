package prototype.exemploJavacodegeeks;

/**
 * @author Edney Roldao
 * 
 * Este � a parte principal desse pattern
 *
 */
public interface Prototype extends Cloneable {
	
	public ControleAcesso clonar() throws CloneNotSupportedException;

}
