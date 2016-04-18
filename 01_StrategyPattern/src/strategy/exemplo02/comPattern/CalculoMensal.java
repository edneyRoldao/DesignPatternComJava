package strategy.exemplo02.comPattern;

import strategy.exemplo02.model.Veiculo;
import strategy.exemplo02.util.PeriodoUtil;

public class CalculoMensal implements CalculoValorEstacionamentoInterface{

	// Atributos
	private double valorMensal;
	
	// Construtor onde o cliente ser� obrigado a passar o valor da di�ria para calcular o valor da conta.
	public CalculoMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}

	@Override
	public double calcularConta(long periodoEstacionado, Veiculo veiculo) {
		return valorMensal * (periodoEstacionado / PeriodoUtil.getMesEmMilisegundos());
	}

}
