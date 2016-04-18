package strategy.exemplo01.model;

import strategy.exemplo01.VoarNormal;

public class Passaro extends Animal {

	
	/**
	 * Este construtor faz parte do Strategy pattern.
	 * Veja que j� est� sendo passado como padr�o uma classe que implementa a interface com o m�todo voar.
	 */
	public Passaro() {
		super();
		habilidadeVoar = new VoarNormal();
	}
	
	/**
	 * Isso � uma especializa��o.
	 * A classe pai obriga suas classes filhas a implementar este m�todo.
	 */
	@Override
	public String produzarBarulho() {
		return "piando";
	}

}
