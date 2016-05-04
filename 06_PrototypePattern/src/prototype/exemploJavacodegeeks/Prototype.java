package prototype.exemploJavacodegeeks;

/**
 * @author Edney Roldao
 * 
 * Este é a parte principal desse pattern
 *
 */
public interface Prototype extends Cloneable {
	
	public ControleAcesso clonar() throws CloneNotSupportedException;

}
