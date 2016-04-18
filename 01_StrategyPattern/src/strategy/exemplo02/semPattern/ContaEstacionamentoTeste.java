package strategy.exemplo02.semPattern;

import strategy.exemplo02.model.Veiculo;
import strategy.exemplo02.model.VeiculoNaoMotorizado;

public class ContaEstacionamentoTeste {
	
	public static void main(String[] args) {
		
		Veiculo carro = new VeiculoNaoMotorizado();
		ContaEstacionamento conta = new ContaEstacionamento();
		
		conta.setVeiculo(carro);
		conta.setTempoInicial(System.currentTimeMillis());
		conta.setTempoFinal(System.currentTimeMillis() + 800000000);
		
		double valorAPagar = conta.calcularValorConta();
		
		System.out.println("Valor a pagar: " + valorAPagar);
		
	}

}
