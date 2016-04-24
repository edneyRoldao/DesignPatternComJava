package observer.EstacaoMetereologica.exemplo03;

/**
 * 
 * @author Edney Roldão
 *
 */
public class CondicoesAtuaisObserver implements Observer, DisplayExibicao {

	// Atributos que serão atualizados sempre que este observer receber uma notificação de Subject
	private Float humidade;
	private Float temperatura;
	private String previsao;
	
	// Esse é o cara que desejamos receber notificações de alteração
	public final Subject objetoObservavel;
	
	
	// Construtor que obriga o passagem de um Subject concreto e em seguida é feito o registro 
	// deste observador no mesmo.
	public CondicoesAtuaisObserver(Subject objetoObservavel) {
		
		// Lancando uma exceção caso o Objeto que implementa Subject passado ser nulo.
		if(objetoObservavel == null) {
			throw new IllegalArgumentException("Objeto observavel nao encontrado");
		}
		
		this.objetoObservavel = objetoObservavel;
		
		// Esse linha é uma das partes mais importates do Pattern.
		// Este observer está se registrando junto ao objeto observável
		objetoObservavel.adicionarObservador(this);
	}
	
	// Recebendo os valores atualizados e chamando o método que exibe
	@Override
	public void atualizar(Float humidade, Float temperatura, String previsao) {
		this.humidade = humidade;
		this.temperatura = temperatura;
		this.previsao = previsao;
		
		//exibindo...
		exibir();
	}

	// Método não faz parte do pattern.
	// A exibição será bem simples pelo console.
	@Override
	public void exibir() {
		System.out.println("***************  OBSERVADOR - CONDICOES ATUAIS ***************");
		System.out.println();
		System.out.println("[Humidade: " + this.humidade + "] - [Temperatura: " + this.temperatura + "] - [Previsao: " + previsao + "]");
		System.out.println();
		System.out.println("**************************************************************");
	}

}
