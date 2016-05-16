package command.exemploHeadFirst;

/**
 * @author Edney Roldão
 * 
 * Essa classe vai armazenar os nossos comandos.
 * 
 * Podemos chamar esse objeto de: 	INVOCADOR
 */
public class SimpleRemoteControl {
	
	// Temos um slot para armazenar nosso comando, e este controlará um dispositivo específico.
	Command slot;
	
	// Esse método é para definir qual comando que o slot deverá controlar.
	// Esse método poderia ser chamado muitas vezes caso o cliente quisesse mudar o comportamento do botão do controle remote
	public void setCommand(Command command) {
		slot = command;
	}
	
	// Esse método é chamada quando o botão é pressionado, tudo o que fazemos é chamar o método execute() do comando que atualmente está associado ao slot. 
	public void botaoFoiPressionado() {
		slot.execute();
	}

}
