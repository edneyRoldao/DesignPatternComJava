package strategy.exemplo02.comPattern;

import strategy.exemplo02.model.Veiculo;
import strategy.exemplo02.util.PeriodoUtil;

public class CalculoPorPeriodo implements CalculoValorEstacionamentoInterface{

	// Atributos
	private double valorPorPeriodo;
	
	// Construtor onde o cliente será obrigado a passar o valor da diária para calcular o valor da conta.
	public CalculoPorPeriodo(double valorPorPeriodo) {
		this.valorPorPeriodo = valorPorPeriodo;
	}

	@Override
	public double calcularConta(long periodoEstacionado, Veiculo veiculo) {
		return valorPorPeriodo * (periodoEstacionado / PeriodoUtil.getHoraEmMilisegundos());
	}

}
