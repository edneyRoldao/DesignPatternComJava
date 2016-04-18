package strategy.exemplo02.semPattern;

/**
 * Diferente do exemplo01, este � um �timo exemplo de aplica��o do Strategy Pattern.
 * 
 * Esta classe ainda n�o est� aplicando o pattern.
 * OBS: o m�todo calcularValorConta vai sobre grandes altera��es com o Strategy.
 * 
 * @author Edney Rold�o
 *
 */
public class ContaEstacionamento {

	//Atributos
	private long tempoInicial;
	private long tempoFinal;
	private final long HORA = 3600000;
	private final long DIA = 24 * HORA;
	private final long MES = 30 * DIA;
	
	// Objeto Veiculo
	private Veiculo veiculo;
	
	/**
	 * Quando percebemos que um algoritmo n�o est� consist�nte e coerente, ou seja, pass�vel de refator��o,
	 * ele pode ser chamado de CODE SMELL.
	 * 
	 * Temos aqui ent�o um code smell que ser� melhorado com o uso do Strategy pattern.
	 * 
	 * @return valor a ser pago pelo tempo estacionado.
	 */
	public double calcularValorConta() {
		
		long tempoAtual = (tempoFinal == 0) ? System.currentTimeMillis() : tempoFinal;
		long periodoEstacionado = tempoAtual - tempoInicial;
		
		if(veiculo instanceof VeiculoNaoMotorizado) {
			if(periodoEstacionado < 12 * HORA) {
				return 0.5 * Math.ceil(periodoEstacionado / HORA);
			}else if(periodoEstacionado > 12 * HORA && periodoEstacionado < 15 * DIA) {
				return 9.50 * Math.ceil(periodoEstacionado / DIA);
			}else {
				return 100.00 * Math.ceil(periodoEstacionado / MES);
			}
			
		}else if(veiculo instanceof VeiculoPasseio) {
			if(periodoEstacionado < 12 * HORA) {
				return 2.0 * Math.ceil(periodoEstacionado / HORA);
			}else if(periodoEstacionado > 12 * HORA && periodoEstacionado < 15 * DIA) {
				double valor = 13.5 * Math.ceil(periodoEstacionado / DIA);
				return valor;
			}else {
				return 200.00 * Math.ceil(periodoEstacionado / MES);
			}
			
		}else {
			if(periodoEstacionado < 12 * HORA) {
				return 3.50 * Math.ceil(periodoEstacionado / HORA);
			}else if(periodoEstacionado > 12 * HORA && periodoEstacionado < 15 * DIA) {
				return 17.45 * Math.ceil(periodoEstacionado / DIA);
			}else {
				return 300.00 * Math.ceil(periodoEstacionado / MES);
			}
		}
	}

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
