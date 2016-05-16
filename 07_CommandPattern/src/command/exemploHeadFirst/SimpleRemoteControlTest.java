package command.exemploHeadFirst;

/**
 * @author Edney Rold�o
 *
 * Podemos considerar esse classe de teste como o nosso objeto Cliente.
 */
public class SimpleRemoteControlTest {

	public static void main(String[] args) {
		
		// Esse � o nosso invocador, ele receber� um objeto de comando que poder� ser utilizado para fazer solicita��es
		SimpleRemoteControl controleRemoto = new SimpleRemoteControl();
		
		// Esses s�o os objetos que ser�o os receptores da solicita��o
		LuzDaSala luz = new LuzDaSala();
		PortaoDaGaragem portaoGaragem = new PortaoDaGaragem();

		// Associando objeto de comando ao receptor
		Command comando = new LigaLuzCommand(luz); // Aqui criamos um objeto de comando a associamos ele ao nosso receptor
		controleRemoto.setCommand(comando); // Aqui � passado o comando para o invocador
		controleRemoto.botaoFoiPressionado(); // Agora vamos simular o bot�o sendo pressionado

		// Troccando o obejto de comando e seu receptor
		comando = new AbrirPortaoGaragemCommand(portaoGaragem);
		
		// Trocando o objeto associado ao slot no controle
		controleRemoto.setCommand(comando);
		
		// Simula��o
		controleRemoto.botaoFoiPressionado();
	}
	
}
