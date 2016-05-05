package prototype.exemploJavacodegeeks;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Edney Rold�o
 * 
 * Esse classe simula a cria��o de diversos objetos de controle da acesso.
 * Todos esses objetos s�o criados estaticamente.
 * Quando for feita uma requisi��o uma requisi��o de acesso, o m�todo est�tico e chamado e retorna um clone desses objetos. 
 *
 */
public class ControleAcessoProvider {
	
	private static Map<String, ControleAcesso> map = new HashMap<>();
	
	static {
		System.out.println("Obtendo dados de um recurso externo e criando o objeto de controle de acesso");
		map.put("USER", new ControleAcesso("USER", "DO_WORK"));
		map.put("ADMIN", new ControleAcesso("ADMIN", "ADD/REMOVE USERS"));
		map.put("MANAGER", new ControleAcesso("MANAGER", "GENERATE/READ REPORTS"));
		map.put("VP", new ControleAcesso("VP", "MODIFY REPORTS"));
		
	}
	
	public static ControleAcesso getObjetoControleAcesso(String nivelControle) {
		
		ControleAcesso controleAcessoObjeto = null;
		controleAcessoObjeto = map.get(nivelControle);
		
		if(controleAcessoObjeto != null) {
			return controleAcessoObjeto.clonar();
		}
		
		return null;
	}

}
