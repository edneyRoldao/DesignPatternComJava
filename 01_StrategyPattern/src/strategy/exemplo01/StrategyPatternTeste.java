package strategy.exemplo01;

import strategy.exemplo01.model.Animal;
import strategy.exemplo01.model.Cachorro;
import strategy.exemplo01.model.Passaro;

public class StrategyPatternTeste {
	
	public static void main(String[] args) {
		
		// Criando isntancias de cachorro e passaro
		Animal juli = new Cachorro();
		Animal gaviao = new Passaro();
		
		//Chamando a habilidade de voar 
		System.out.println("Cachorro: " + juli.queroVoar());
		System.out.println("Passaro: " + gaviao.queroVoar());
		
		//////////////////////////////////////////////////////////////////////////
		///////////////////// Strategy pattern TESTE /////////////////////////////
		//////////////////////////////////////////////////////////////////////////
		
		/**
		 * Veja que cada tipo de classe filha possui suas habilidades espec�ficas, por�m...
		 * Vamos trocar as habilidade din�micamente
		 * 
		 * Agora a juli vai poder voar e o gaviao vai voar mais alto
		 */
		juli.setHabilidadeVoar(new VoarNormal());
		gaviao.setHabilidadeVoar(new VoarAlto());
		
		System.out.println();
		System.out.println("**************************************************************");
		System.out.println("As habilidaddes de voar de cachorro e passaro foram alteradas din�micamente.");
		System.out.println("Cachorro: " + juli.queroVoar());
		System.out.println("Passaro: " + gaviao.queroVoar());
		
		//////////////////////////////////////////////////////////////////////////
		////////////////////////// CONCLUSAO /////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
		/**
		 * Este exemplo n�o � o melhor para se aplicar o Strategy, por�m o melhor para demonstrar conceito.
		 * 
		 * Veja que podemos adicionar novos comportamentos e troca-los sem precisar alterar o c�digo j� existente e de forma din�mica.
		 * Veja no exemplo02 como � poss�vel substituir um m�todo com diversas condicionais para resolver um problema usando este Pattern
		 * 
		 */
		
		
	}

}
