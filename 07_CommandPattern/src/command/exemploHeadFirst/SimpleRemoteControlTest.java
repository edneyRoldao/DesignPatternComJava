package command.exemploHeadFirst;

/**
 * @author Edney Roldão
 *
 * Podemos considerar esse classe de teste como o nosso objeto Cliente.
 */
public class SimpleRemoteControlTest {

	public static void main(String[] args) {
		
		// Esse é o nosso invocador, ele receberá um objeto de comando que poderá ser utilizado para fazer solicitações
		SimpleRemoteControl controleRemoto = new SimpleRemoteControl();
		
		// Esses são os objetos que serão os receptores da solicitação
		LuzDaSala luz = new LuzDaSala();
		PortaoDaGaragem portaoGaragem = new PortaoDaGaragem();

		// Associando objeto de comando ao receptor
		Command comando = new LigaLuzCommand(luz); // Aqui criamos um objeto de comando a associamos ele ao nosso receptor
		controleRemoto.setCommand(comando); // Aqui é passado o comando para o invocador
		controleRemoto.botaoFoiPressionado(); // Agora vamos simular o botão sendo pressionado

		// Troccando o obejto de comando e seu receptor
		comando = new AbrirPortaoGaragemCommand(portaoGaragem);
		
		// Trocando o objeto associado ao slot no controle
		controleRemoto.setCommand(comando);
		
		// Simulação
		controleRemoto.botaoFoiPressionado();
	}
	
}
