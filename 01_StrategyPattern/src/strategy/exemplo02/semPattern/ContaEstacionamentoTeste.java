package strategy.exemplo02.semPattern;

public class ContaEstacionamentoTeste {
	
	public static void main(String[] args) {
		
		Veiculo carro = new VeiculoPasseio();
		ContaEstacionamento conta = new ContaEstacionamento();
		
		conta.setVeiculo(carro);
		conta.setTempoInicial(System.currentTimeMillis());
		conta.setTempoFinal(System.currentTimeMillis() + 8000000);
		
		double valorAPagar = conta.calcularValorConta();
		
		System.out.println("Valor a pagar: " + valorAPagar);
		
	}

}
