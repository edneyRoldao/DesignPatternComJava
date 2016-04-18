package strategy.exemplo02.model;

/**
 * 
 * @author Edney Roldao
 *
 */
public abstract class Veiculo {

	// Atributos
	private String nome;
	private String marca;
	private double valorDiaria;
	private double valorMensal;
	private double valorPorPeriodo;

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}

	public double getValorPorPeriodo() {
		return valorPorPeriodo;
	}

	public void setValorPorPeriodo(double valorPorPeriodo) {
		this.valorPorPeriodo = valorPorPeriodo;
	}

}
