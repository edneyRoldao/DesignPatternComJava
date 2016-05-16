package command.exemploHeadFirst;

/**
 * @author Edney Rold�o
 * 
 * Essa classe vai armazenar os nossos comandos.
 * 
 * Podemos chamar esse objeto de: 	INVOCADOR
 */
public class SimpleRemoteControl {
	
	// Temos um slot para armazenar nosso comando, e este controlar� um dispositivo espec�fico.
	Command slot;
	
	// Esse m�todo � para definir qual comando que o slot dever� controlar.
	// Esse m�todo poderia ser chamado muitas vezes caso o cliente quisesse mudar o comportamento do bot�o do controle remote
	public void setCommand(Command command) {
		slot = command;
	}
	
	// Esse m�todo � chamada quando o bot�o � pressionado, tudo o que fazemos � chamar o m�todo execute() do comando que atualmente est� associado ao slot. 
	public void botaoFoiPressionado() {
		slot.execute();
	}

}
