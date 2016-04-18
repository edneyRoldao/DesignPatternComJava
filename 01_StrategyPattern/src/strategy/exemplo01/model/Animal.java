package strategy.exemplo01.model;

import strategy.exemplo01.HabilidadeVoarInterface;

/**
 * Exemplo 01 - Strategy Pattern
 * 
 * Temos aqui uma superclasse animal, e ser� aplicado o Strategy na habilidade de voar
 * N�o ser� usado uma especializa��o, teremos uma composi��o onde, qualquer classe que extender esta poder� obter o habilidadde 
 * de voar apenas trocando a classe que a implementa.
 * 
 * @author Edney Rold�o
 *
 */
public abstract class Animal {

	// atributos
	private String nome;
	private double peso;
	private double altura;
	
	
	/**
	 * Este m�todo foi adicionado para ser comparado uma especializa��o do padr�o strategy.
	 * 
	 * @return barulho do animal.
	 */
	public abstract String produzarBarulho();

	
	//////////////////////////////////////////////////////////////////////////
	///////////////////// Inicio - Strategy pattern //////////////////////////
	//////////////////////////////////////////////////////////////////////////	
	/**
	 * Adicionando a interface com a assinatura do m�todo da funcionalidade de voar como dependencia. (isso � uma composi��o)
	 *
	 * OBS: nas filhas dessa classe, vamos criar um construtor que vai obrigar quem instancia-las a passar 
	 * uma classe concreta que implemente esta interface.    
	 *
	 */
	public HabilidadeVoarInterface habilidadeVoar; 
	
	/**
	 * Perceba que o m�todo voar da interface est� senddo chamado, portanto, e classe filha deve ter obrigat�riamente uma classe que
	 * implemente a mesma, por esse motivo que criamos uma construtor nas classes filhas.
	 * 
	 * @return O retorna poderia ser qualquer coisa, por�m coloquei apenas um texto para facilitar o entendimento
	 */
	public String queroVoar() {
		return habilidadeVoar.voar();
	}
	
	/**
	 * Este talvez seja o principal m�todo do strategy, � aqui que vamos trocar din�micamente as classes 
	 * que implementam a interface em quest�o
	 * 
	 * @param habilidadeVoar
	 */
	public void setHabilidadeVoar(HabilidadeVoarInterface habilidadeVoar) {
		this.habilidadeVoar = habilidadeVoar;
	}
	//////////////////////////////////////////////////////////////////////////
	///////////////////// fim - Strategy pattern /////////////////////////////
	//////////////////////////////////////////////////////////////////////////	

	
	// Getters and Setters 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
