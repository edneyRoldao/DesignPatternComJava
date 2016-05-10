package command.exemploDerekBanas;

/**
 * @author Edney Roldão
 * 
 * Esta classe representa o Invoker.
 * 
 * Ele não sabe qual dispositivo ou comando está sendo usado.
 *
 */
public class DispositivoBotao {

	Command comando;
	
	public DispositivoBotao(Command comando) {
		this.comando = comando;
	}
	
	public void acionarBotao() {
		comando.executar();
	}

	public void acionarBotaoDesfazer() {
		comando.desfazerComando();
	}
	
}
