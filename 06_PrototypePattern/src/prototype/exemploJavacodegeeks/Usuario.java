package prototype.exemploJavacodegeeks;

import java.io.Serializable;

/**
 * @author Edney Roldão
 *
 * Java Beans
 *
 */
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	// Atributos
	private String userName;
	private String level;
	private ControleAcesso acesso;

	// Construtor
	public Usuario(String userName, String level, ControleAcesso acesso) {
		this.userName = userName;
		this.level = level;
		this.acesso = acesso;
	}

	@Override
	public String toString() {
		return "Usuario [userName=" + userName + ", level=" + level + ", acesso=" + acesso.getAccess() + "]";
	}

	// Getters and Setters
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public ControleAcesso getAcesso() {
		return acesso;
	}

	public void setAcesso(ControleAcesso acesso) {
		this.acesso = acesso;
	}

}
