package strategy.exemplo02.comPattern;

import strategy.exemplo02.model.Veiculo;
import strategy.exemplo02.util.PeriodoUtil;

public class CalculoDiaria implements CalculoValorEstacionamentoInterface{

	// Atributos
	private double valorDiaria;
	
	// Construtor onde o cliente será obrigado a passar o valor da diária para calcular o valor da conta.
	public CalculoDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	public double calcularConta(long periodoEstacionado, Veiculo veiculo) {
		return valorDiaria * (periodoEstacionado / PeriodoUtil.getDiaEmMilisegundos());
	}

}
