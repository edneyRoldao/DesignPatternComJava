package observer.EstacaoMetereologica.exemplo03;

import java.util.ArrayList;

/**
 * Este é o nosso objeto Observavel.
 * Para o ObserverPattern, este é o ator principal.
 * 
 * @author Edney Roldão
 *
 */
public class DadosDoTempoSubject implements Subject {

	// Declarando lista de observadores
	private ArrayList<Observer> listaObservadores;
	
	// Atributos modificáveis de medição do tempo
	private Float humidade;
	private Float temperatura;
	private String previsao;
	
	
	//Construtor onde será inicializada a lista de observadores
	public DadosDoTempoSubject() {
		listaObservadores = new ArrayList<>();
	}
	
	
	// Somente os observadores adicionados aqui que recebem as noficações de alteração
	@Override
	public void adicionarObservador(Observer observador) {
		listaObservadores.add(observador);
	}

	
	// Quando removemos um observador, significa que ele não vai mais receber as notificações de alteração
	@Override
	public void removerObservador(Observer observador) {
		int index = listaObservadores.indexOf(observador);
		
		if(index >= 0) 
			listaObservadores.remove(index);
	}

	
	// Toda vez que qualquer um dos atributos modificáveis são alterados, este método será 
	// o responsável por notificar todos os observadores que foram adicionados antes da alteração
	@Override
	public void notificarObservadores() {
		for(Observer observer : listaObservadores) {
			observer.atualizar(this.humidade, this.temperatura, this.previsao);
		}
	}
	
	
	// Métodos que verificam as alterações metereológicas e que não fazem parte do Pattern.
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
