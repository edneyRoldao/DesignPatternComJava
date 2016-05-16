package command.exemploHeadFirst;

/**
 * @author Edney Rold�o
 * 
 * Vamos implementar o commando espec�fico que vai tratar de abrir o port�o da garagem.
 * 
 * Vamos armazenar a vari�vel de instancia garagem.
 * 
 *  Quando o m�todo execute() for invocado, � esse objeto garagem que ser� o receptor da solicita��o 
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
