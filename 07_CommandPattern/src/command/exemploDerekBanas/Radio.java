package command.exemploDerekBanas;

public class Radio implements DispositivoEletronico{

	private int volume = 0;
	
	@Override
	public void ligar() {
		System.out.println("Radio ligado");
	}

	@Override
	public void desligar() {
		System.out.println("Radio desligado");
	}

	@Override
	public void aumentarVolume() {
		volume++;
		System.out.println("O som do Radio esta com o volume: " + volume);
	}

	@Override
	public void reduzirVolume() {
		volume--;
		System.out.println("O som do Radio esta com o volume: " + volume);
	}

}
