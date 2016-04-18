package strategy.exemplo01;

public class Cachorro extends Animal {

	
	/**
	 * Este construtor faz parte do Strategy pattern.
	 * Veja que j� est� sendo passado como padr�o uma classe que implementa a interface com o m�todo voar.
	 */
	public Cachorro() {
		super();
		habilidadeVoar = new NaoVoa();
	}
	
	/**
	 * Isso � uma especializa��o.
	 * A classe pai obriga suas classes filhas a implementar este m�todo.
	 */
	@Override
	public String produzarBarulho() {
		return "ladrando";
	}

}
