package strategy.exemplo02.comPattern;

import strategy.exemplo02.model.Veiculo;

public class ContaEstacionamento {

	// Atributos
	private long tempoInicial;
	private long tempoFinal;

	// Objeto Veiculo
	private Veiculo veiculo;

	//////////////////////////////////////////////////////////////////////////
	///////////////////// Inicio - Strategy pattern //////////////////////////
	//////////////////////////////////////////////////////////////////////////
	
	/**
	 * Foi substituido o m�todo gigante com v�rias condicionais (code smell)
	 * perceba que o trecho aqui � praticamente igual ao exemplo01
	 */

	// Adicionando a interface como dependecia
	private CalculoValorEstacionamentoInterface calculoInterface;
	
	// Chamada do m�todo a partir da interface acima
	public double getValorConta() {
		long periodoEstacionado = tempoFinal - tempoInicial;
		return calculoInterface.calcularConta(periodoEstacionado, veiculo);
	}
	
	// Este trecho � quem vai permitir a troca da classe que implementa o forma de calcular 
	public void setCalculoInterface(CalculoValorEstacionamentoInterface calculoInterface) {
		this.calculoInterface = calculoInterface;
	}
	
	//////////////////////////////////////////////////////////////////////////
	///////////////////// fim - Strategy pattern /////////////////////////////
	//////////////////////////////////////////////////////////////////////////

	
	// Getters and Setters
	public long getTempoInicial() {
		return tempoInicial;
	}
	
	public void setTempoInicial(long tempoInicial) {
		this.tempoInicial = tempoInicial;
	}
	
	public long getTempoFinal() {
		return tempoFinal;
	}
	
	public void setTempoFinal(long tempoFinal) {
		this.tempoFinal = tempoFinal;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
