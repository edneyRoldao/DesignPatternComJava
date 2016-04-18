package strategy.exemplo01;

public class Cachorro extends Animal {

	
	/**
	 * Este construtor faz parte do Strategy pattern.
	 * Veja que já está sendo passado como padrão uma classe que implementa a interface com o método voar.
	 */
	public Cachorro() {
		super();
		habilidadeVoar = new NaoVoa();
	}
	
	/**
	 * Isso é uma especialização.
	 * A classe pai obriga suas classes filhas a implementar este método.
	 */
	@Override
	public String produzarBarulho() {
		return "ladrando";
	}

}
