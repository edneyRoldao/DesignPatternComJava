package command.exemploHeadFirst;

/**
 * @author Edney Roldão
 * 
 * Vamos implementar o commando específico que vai tratar de acender e apagar uma determinada luz.
 * 
 * Vamos armazenar a variável de instancia luz.
 * 
 *  Quando o método execute() for invocado, é esse objeto luz que será o receptor da solicitação 
 */
public class LigaLuzCommand implements Command {

	LuzDaSala luz;
	
	public LigaLuzCommand(LuzDaSala luz) {
		this.luz = luz;
	}
	
	/**
	 * Invocando o método no objeto receptor que estamos controlando
	 */
	@Override
	public void execute() {
		luz.ligar();
	}

}
