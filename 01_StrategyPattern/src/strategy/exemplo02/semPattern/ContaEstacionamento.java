package strategy.exemplo02.semPattern;

import strategy.exemplo02.model.Veiculo;
import strategy.exemplo02.model.VeiculoNaoMotorizado;
import strategy.exemplo02.model.VeiculoPasseio;
import strategy.exemplo02.util.PeriodoUtil;

/**
 * Diferente do exemplo01, este é um ótimo exemplo de aplicação do Strategy Pattern.
 * 
 * Esta classe ainda não está aplicando o pattern.
 * OBS: o método calcularValorConta vai sofrer grandes alterações com o Strategy. Ver no exemplo comPattern
 * 
 * @author Edney Roldão
 *
 */
public class ContaEstacionamento {

	// Atributos
	private long tempoInicial;
	private long tempoFinal;
	
	// Objeto Veiculo
	private Veiculo veiculo;
	
	/**
	 * Este método está horrível, precisamos refatorar.
	 * 
	 * Quando percebemos que um algoritmo não está consistênte e coerente, ou seja, passível de refatorção,
	 * ele pode ser chamado de CODE SMELL.
	 * 
	 * Temos aqui então um code smell que será melhorado com o uso do Strategy pattern.
	 * 
	 * @return valor a ser pago pelo tempo estacionado.
	 */
	public double calcularValorConta() {
		
		long tempoAtual = (tempoFinal == 0) ? System.currentTimeMillis() : tempoFinal;
		long periodoEstacionado = tempoAtual - tempoInicial;
		
		if(veiculo instanceof VeiculoNaoMotorizado) {
			if(periodoEstacionado < 12 * PeriodoUtil.getHoraEmMilisegundos()) {
				return veiculo.getValorPorPeriodo() * (periodoEstacionado / PeriodoUtil.getHoraEmMilisegundos());
			}else if(periodoEstacionado > 12 * PeriodoUtil.getHoraEmMilisegundos() && periodoEstacionado < 15 * PeriodoUtil.getDiaEmMilisegundos()) {
				return veiculo.getValorDiaria() * (periodoEstacionado / PeriodoUtil.getDiaEmMilisegundos());
			}else {
				return veiculo.getValorMensal() * (periodoEstacionado / PeriodoUtil.getMesEmMilisegundos());
			}
			
		}else if(veiculo instanceof VeiculoPasseio) {
			if(periodoEstacionado < 12 * PeriodoUtil.getHoraEmMilisegundos()) {
				return veiculo.getValorPorPeriodo() * (periodoEstacionado / PeriodoUtil.getHoraEmMilisegundos());
			}else if(periodoEstacionado > 12 * PeriodoUtil.getHoraEmMilisegundos() && periodoEstacionado < 15 * PeriodoUtil.getDiaEmMilisegundos()) {
				double valor = veiculo.getValorDiaria() * (periodoEstacionado / PeriodoUtil.getDiaEmMilisegundos());
				return valor;
			}else {
				return veiculo.getValorMensal() * (periodoEstacionado / PeriodoUtil.getMesEmMilisegundos());
			}
			
		}else {
			if(periodoEstacionado < 12 * PeriodoUtil.getHoraEmMilisegundos()) {
				return veiculo.getValorPorPeriodo() * (periodoEstacionado / PeriodoUtil.getHoraEmMilisegundos());
			}else if(periodoEstacionado > 12 * PeriodoUtil.getHoraEmMilisegundos() && periodoEstacionado < 15 * PeriodoUtil.getDiaEmMilisegundos()) {
				return veiculo.getValorDiaria() * (periodoEstacionado / PeriodoUtil.getDiaEmMilisegundos());
			}else {
				return veiculo.getValorMensal() * (periodoEstacionado / PeriodoUtil.getMesEmMilisegundos());
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
