package command.exemploDerekBanas;

import java.util.Arrays;
import java.util.List;

public class UsarControleTeste {
	
	public static void main(String[] args) {
		
		DispositivoEletronico dispositivo = ControleRemotoTV.getDispositivo();
		LigaTV ligaComando = new LigaTV(dispositivo);
		DispositivoBotao botao = new DispositivoBotao(ligaComando);
		
		botao.acionarBotao();
		
		//////////////////////////////////////////////////////////////////////
		
		DesligaTV desligaComando = new DesligaTV(dispositivo);
		botao = new DispositivoBotao(desligaComando);
		
		botao.acionarBotao();
		
		//////////////////////////////////////////////////////////////////////

		AumentaVolumeTV volumeUP = new AumentaVolumeTV(dispositivo);
		botao = new DispositivoBotao(volumeUP);
		
		botao.acionarBotao();
		botao.acionarBotao();
		botao.acionarBotao();
		
		//////////////////////////////////////////////////////////////////////

		
		List<DispositivoEletronico> todosDispositivos = Arrays.asList(new DispositivoEletronico[]{new Televisao(), new Radio()});
		DesligarTodos turnOffAllDevices = new DesligarTodos(todosDispositivos);
		botao = new DispositivoBotao(turnOffAllDevices);
		
		botao.acionarBotao();
		
		/////////////////////////////////////////////////////////////////////
		
		botao.acionarBotaoDesfazer();
		
	}

}
