package strategy.exemplo01.model;

import strategy.exemplo01.HabilidadeVoarInterface;

/**
 * Exemplo 01 - Strategy Pattern
 * 
 * Temos aqui uma superclasse animal, e será aplicado o Strategy na habilidade de voar
 * Não será usado uma especialização, teremos uma composição onde, qualquer classe que extender esta poderá obter o habilidadde 
 * de voar apenas trocando a classe que a implementa.
 * 
 * @author Edney Roldão
 *
 */
public abstract class Animal {

	// atributos
	private String nome;
	private double peso;
	private double altura;
	
	
	/**
	 * Este método foi adicionado para ser comparado uma especialização do padrão strategy.
	 * 
	 * @return barulho do animal.
	 */
	public abstract String produzarBarulho();

	
	//////////////////////////////////////////////////////////////////////////
	///////////////////// Inicio - Strategy pattern //////////////////////////
	//////////////////////////////////////////////////////////////////////////	
	/**
	 * Adicionando a interface com a assinatura do método da funcionalidade de voar como dependencia. (isso é uma composição)
	 *
	 * OBS: nas filhas dessa classe, vamos criar um construtor que vai obrigar quem instancia-las a passar 
	 * uma classe concreta que implemente esta interface.    
	 *
	 */
	public HabilidadeVoarInterface habilidadeVoar; 
	
	/**
	 * Perceba que o método voar da interface está senddo chamado, portanto, e classe filha deve ter obrigatóriamente uma classe que
	 * implemente a mesma, por esse motivo que criamos uma construtor nas classes filhas.
	 * 
	 * @return O retorna poderia ser qualquer coisa, porém coloquei apenas um texto para facilitar o entendimento
	 */
	public String queroVoar() {
		return habilidadeVoar.voar();
	}
	
	/**
	 * Este talvez seja o principal método do strategy, é aqui que vamos trocar dinâmicamente as classes 
	 * que implementam a interface em questão
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
