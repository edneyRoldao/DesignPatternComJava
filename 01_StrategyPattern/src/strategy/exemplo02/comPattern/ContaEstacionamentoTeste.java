package strategy.exemplo02.comPattern;

import strategy.exemplo02.model.Veiculo;
import strategy.exemplo02.model.VeiculoCarga;
import strategy.exemplo02.util.PeriodoUtil;

public class ContaEstacionamentoTeste {

	public static void main(String[] args) {
		
		// Criando as instâncias para o calculo da conta
		ContaEstacionamento conta = new ContaEstacionamento();
		Veiculo caminhao = new VeiculoCarga();
		
		//
		conta.setTempoInicial(System.currentTimeMillis());
		conta.setTempoFinal(System.currentTimeMillis() + 750000000);
		conta.setVeiculo(caminhao);
		
		// Passando a classe que implementa o calculo da conta de estacionamento de acordo com o período
		long tempoAtual = (conta.getTempoFinal() == 0) ? System.currentTimeMillis() : conta.getTempoFinal();
		long periodoEstacionado = tempoAtual - conta.getTempoInicial();
		
		
		//////////////////////////////////////////////////////////////////////////
		///////////////////// Strategy pattern TESTE /////////////////////////////
		//////////////////////////////////////////////////////////////////////////

		/**
		 * Trocando as classes dinâmicamente de acordo com o período estacionado
		 * 
		 * A parte mais importante do padrão está aqui, perceba que podemos trocar as classes que implementam os 
		 * calculos da conta do estacionamento, independentemente do tipo da instancia de Veiculo.
		 * 
		 *  RESUMINDO: qualquer subclasse que extende Veiculo, pode utilizar esses métodos da forma que desejar.
		 *  		   As implementações são intercambiáveis.	
		 */
		if(periodoEstacionado < 12 * PeriodoUtil.getHoraEmMilisegundos()) {
			conta.setCalculoInterface(new CalculoPorPeriodo(conta.getVeiculo().getValorDiaria()));
		}else if(periodoEstacionado > 12 * PeriodoUtil.getHoraEmMilisegundos() && periodoEstacionado < 15 * PeriodoUtil.getDiaEmMilisegundos()) {
			conta.setCalculoInterface(new CalculoDiaria(conta.getVeiculo().getValorDiaria()));
		}else {
			conta.setCalculoInterface(new CalculoMensal(conta.getVeiculo().getValorDiaria()));
		}
		
		/**
		 * O valor aqui muda de acordo com o tipo de instancia de Veiculo e a classe que implementa CalculoValorEstacionamentoInterface
		 */
		double diaria = conta.getValorConta();

		// exibindo o valor
		System.out.println(diaria);
		
	}
	
}
