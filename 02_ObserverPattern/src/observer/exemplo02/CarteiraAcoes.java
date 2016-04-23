package observer.exemplo02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Edney Roldão
 *
 */
public class CarteiraAcoes {
	
	// Aqui temos um mapa com a descricao das acões e suas respectivas quantidades.
	private Map<String, Integer> acoes = new HashMap<>();
	
	//Lista de observers
	private List<Observador> observadores = new ArrayList<>();

	public void adicionarAcoes(String acao, Integer quantidade) {
		if(acoes.containsKey(acao)) {
			quantidade += acoes.get(acao);
		}
		acoes.put(acao, quantidade);
		notificar(acao, quantidade);
	}
	
	public void addObservador(Observador observador) {
		observadores.add(observador);
	}
	
	private void notificar(String acao, Integer quantidade) {
		for(Observador observador : observadores) {
			observador.mudancaQuantidade(acao, quantidade);
		}
	}
	
}
