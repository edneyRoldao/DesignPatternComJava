package command.exemploDerekBanas;

public class AumentaVolumeTV implements Command {

	DispositivoEletronico dispositivo;
	
	public AumentaVolumeTV(DispositivoEletronico dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	@Override
	public void executar() {
		dispositivo.aumentarVolume();
	}

	@Override
	public void desfazerComando() {
		dispositivo.reduzirVolume();
	}

}
