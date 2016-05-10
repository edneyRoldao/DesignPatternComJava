package command.exemploDerekBanas;

import java.util.List;

public class DesligarTodos implements Command {

	List<DispositivoEletronico> dispositivos;

	
	public DesligarTodos(List<DispositivoEletronico> dispositivo) {
		this.dispositivos = dispositivo;
	}
	
	
	@Override
	public void executar() {
		
		for(DispositivoEletronico dispositivo : dispositivos) {
			dispositivo.desligar();
		}
		
	}


	@Override
	public void desfazerComando() {

		for(DispositivoEletronico dispositivo : dispositivos) {
			dispositivo.ligar();
		}
	
	}

}
