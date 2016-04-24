package observer.EstacaoMetereologica.exemplo03;

import java.util.ArrayList;

/**
 * Este � o nosso objeto Observavel.
 * Para o ObserverPattern, este � o ator principal.
 * 
 * @author Edney Rold�o
 *
 */
public class DadosDoTempoSubject implements Subject {

	// Declarando lista de observadores
	private ArrayList<Observer> listaObservadores;
	
	// Atributos modific�veis de medi��o do tempo
	private Float humidade;
	private Float temperatura;
	private String previsao;
	
	
	//Construtor onde ser� inicializada a lista de observadores
	public DadosDoTempoSubject() {
		listaObservadores = new ArrayList<>();
	}
	
	
	// Somente os observadores adicionados aqui que recebem as nofica��es de altera��o
	@Override
	public void adicionarObservador(Observer observador) {
		listaObservadores.add(observador);
	}

	
	// Quando removemos um observador, significa que ele n�o vai mais receber as notifica��es de altera��o
	@Override
	public void removerObservador(Observer observador) {
		int index = listaObservadores.indexOf(observador);
		
		if(index >= 0) 
			listaObservadores.remove(index);
	}

	
	// Toda vez que qualquer um dos atributos modific�veis s�o alterados, este m�todo ser� 
	// o respons�vel por notificar todos os observadores que foram adicionados antes da altera��o
	@Override
	public void notificarObservadores() {
		for(Observer observer : listaObservadores) {
			observer.atualizar(this.humidade, this.temperatura, this.previsao);
		}
	}
	
	
	// M�todos que verificam as altera��es metereol�gicas e que n�o fazem parte do Pattern.
	public void medicoesAlteradas() {
		notificarObservadores();
	}
	
	public void setMedicoes(Float humidade, Float temperatura, String previsao) {
		this.humidade = humidade;
		this.temperatura = temperatura;
		this.previsao = previsao;
		medicoesAlteradas();
	}

	
	// Getters and Setters
	public Float getHumidade() {
		return humidade;
	}

	public void setHumidade(Float humidade) {
		this.humidade = humidade;
	}

	public Float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
	}

	public String getPrevisao() {
		return previsao;
	}

	public void setPrevisao(String previsao) {
		this.previsao = previsao;
	}
	
}
