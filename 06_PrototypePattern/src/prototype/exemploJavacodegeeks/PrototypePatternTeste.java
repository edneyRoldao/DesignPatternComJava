package prototype.exemploJavacodegeeks;

/**
 * @author Edney Roldão
 *
 */
public class PrototypePatternTeste {
	
	public static void main(String[] args) {

		ControleAcesso userAccessControl = ControleAcessoProvider.getObjetoControleAcesso("USER");
		Usuario user = new Usuario("Edney", "USER Level", userAccessControl);
		
		System.out.println("*************************");
		System.out.println(user);
		
		userAccessControl = ControleAcessoProvider.getObjetoControleAcesso("USER");
		user = new Usuario("Giselle", "USER Level", userAccessControl);
		
		System.out.println();
		
		System.out.println("Trocando o controle de acesso de: " + user.getUserName());
		user.getAcesso().setAccess("READ REPORTS");
		System.out.println(user);
		
		System.out.println("****************************");
		
		userAccessControl = ControleAcessoProvider.getObjetoControleAcesso("MANAGER");
		user = new Usuario("Nadine", "MANAGER Level", userAccessControl);
		System.out.println(user);
		
	}

}
