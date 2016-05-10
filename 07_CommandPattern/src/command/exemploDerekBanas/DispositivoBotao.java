package command.exemploDerekBanas;

/**
 * @author Edney Rold�o
 * 
 * Esta classe representa o Invoker.
 * 
 * Ele n�o sabe qual dispositivo ou comando est� sendo usado.
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
