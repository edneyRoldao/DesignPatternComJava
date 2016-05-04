package prototype.exemploJavacodegeeks;

/**
 * @author Edney Roldao
 *
 */
public class ControleAcesso implements Prototype {
	
	// Atributos
	private final String controleAcesso;
	private String access;
	
	
	// Construtor
	public ControleAcesso(String controleAcesso, String access) {
		this.controleAcesso = controleAcesso;
		this.access = access;
	}
	

	@Override
	public ControleAcesso clonar() {
		
		try {
			
			return (ControleAcesso) super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	
	//Getters and Setters
	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getControleAcesso() {
		return controleAcesso;
	}

}
