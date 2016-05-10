package command.exemploDerekBanas;

public class LigaTV implements Command {

	DispositivoEletronico dispositivo;
	
	public LigaTV(DispositivoEletronico dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	@Override
	public void executar() {
		dispositivo.ligar();
	}

	@Override
	public void desfazerComando() {
		dispositivo.desligar();
	}

}
