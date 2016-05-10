package command.exemploDerekBanas;

public class DesligaTV implements Command {

	DispositivoEletronico dispositivo;
	
	public DesligaTV(DispositivoEletronico dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	@Override
	public void executar() {
		dispositivo.desligar();
	}

	@Override
	public void desfazerComando() {
		dispositivo.ligar();
	}

}
