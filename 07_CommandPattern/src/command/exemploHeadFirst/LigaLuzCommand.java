package command.exemploHeadFirst;

/**
 * @author Edney Rold�o
 * 
 * Vamos implementar o commando espec�fico que vai tratar de acender e apagar uma determinada luz.
 * 
 * Vamos armazenar a vari�vel de instancia luz.
 * 
 *  Quando o m�todo execute() for invocado, � esse objeto luz que ser� o receptor da solicita��o 
 */
public class LigaLuzCommand implements Command {

	LuzDaSala luz;
	
	public LigaLuzCommand(LuzDaSala luz) {
		this.luz = luz;
	}
	
	/**
	 * Invocando o m�todo no objeto receptor que estamos controlando
	 */
	@Override
	public void execute() {
		luz.ligar();
	}

}
