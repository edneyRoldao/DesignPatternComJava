package strategy.exemplo02.comPattern;

import strategy.exemplo02.model.Veiculo;

public interface CalculoValorEstacionamentoInterface {
	
	double calcularConta(long periodoEstacionado, Veiculo veiculo);

}
