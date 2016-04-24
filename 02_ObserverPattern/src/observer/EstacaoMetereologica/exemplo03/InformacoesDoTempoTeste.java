package observer.EstacaoMetereologica.exemplo03;

public class InformacoesDoTempoTeste {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Criando o objeto observável - Subject
		Subject objObservavel = new DadosDoTempoSubject();
		
		// Criando os objetos observadores - Observer
		Observer objObservadorCondicoes = new CondicoesAtuaisObserver(objObservavel);
		Observer objObservadorEstatisticas = new EstatisticasObserver(objObservavel);

		System.out.println("Condicoes atualizadas com dois Observers registrados");
		((DadosDoTempoSubject) objObservavel).setMedicoes(33.5f, 29.6f, "calor o dia todo");
		
		System.out.println("Adicionando mais um objeto observador");
		Observer objObservadorPrevisao = new PrevisaoTempoObserver(objObservavel);
		System.out.println("valores alterados");

		System.out.println("Condicoes atualizadas com tres Observers registrados");
		((DadosDoTempoSubject) objObservavel).setMedicoes(45.5f, 11.6f, "frio o dia todo");

		System.out.println("Removendo dois observadores de tres registrados");
		// Perceba a flexibilidade para acessar os métodos
		((PrevisaoTempoObserver) objObservadorPrevisao).objetoObservavel.removerObservador(objObservadorPrevisao);
		objObservavel.removerObservador(objObservadorEstatisticas);
		
		System.out.println("valores alterados");
		System.out.println("Condicoes atualizadas com hum Observer registrado");
		((DadosDoTempoSubject) objObservavel).setMedicoes(57.5f, 23.6f, "normal o dia todo");
		
	}

}
