package command.exemploDerekBanas;

public class Televisao implements DispositivoEletronico{

	private int volume = 0;
	
	@Override
	public void ligar() {
		System.out.println("TV ligada");
	}

	@Override
	public void desligar() {
		System.out.println("TV desligada");
	}

	@Override
	public void aumentarVolume() {
		volume++;
		System.out.println("O som de TV esta com o volume: " + volume);
	}

	@Override
	public void reduzirVolume() {
		volume--;
		System.out.println("O som de TV esta com o volume: " + volume);
	}

}
