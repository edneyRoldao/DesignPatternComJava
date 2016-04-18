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
		 * Veja que cada tipo de classe filha possui suas habilidades específicas, porém...
		 * Vamos trocar as habilidade dinâmicamente
		 * 
		 * Agora a juli vai poder voar e o gaviao vai voar mais alto
		 */
		juli.setHabilidadeVoar(new VoarNormal());
		gaviao.setHabilidadeVoar(new VoarAlto());
		
		System.out.println();
		System.out.println("**************************************************************");
		System.out.println("As habilidaddes de voar de cachorro e passaro foram alteradas dinâmicamente.");
		System.out.println("Cachorro: " + juli.queroVoar());
		System.out.println("Passaro: " + gaviao.queroVoar());
		
		//////////////////////////////////////////////////////////////////////////
		////////////////////////// CONCLUSAO /////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
		/**
		 * Este exemplo não é o melhor para se aplicar o Strategy, porém o melhor para demonstrar conceito.
		 * 
		 * Veja que podemos adicionar novos comportamentos e troca-los sem precisar alterar o código já existente e de forma dinâmica.
		 * Veja no exemplo02 como é possível substituir um método com diversas condicionais para resolver um problema usando este Pattern
		 * 
		 */
		
		
	}

}
