package command.exemploHeadFirst;

/**
 * @author Edney Roldão
 * 
 * Vamos implementar o commando específico que vai tratar de abrir o portão da garagem.
 * 
 * Vamos armazenar a variável de instancia garagem.
 * 
 *  Quando o método execute() for invocado, é esse objeto garagem que será o receptor da solicitação 
 */
public class AbrirPortaoGaragemCommand implements Command {

	PortaoDaGaragem garagem;
	
	public AbrirPortaoGaragemCommand(PortaoDaGaragem garagem) {
		this.garagem = garagem;
	}
	
	@Override
	public void execute() {
		garagem.abrir();
	}

}
