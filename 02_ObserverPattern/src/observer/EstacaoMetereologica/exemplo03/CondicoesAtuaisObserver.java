package observer.EstacaoMetereologica.exemplo03;

/**
 * 
 * @author Edney Rold�o
 *
 */
public class CondicoesAtuaisObserver implements Observer, DisplayExibicao {

	// Atributos que ser�o atualizados sempre que este observer receber uma notifica��o de Subject
	private Float humidade;
	private Float temperatura;
	private String previsao;
	
	// Esse � o cara que desejamos receber notifica��es de altera��o
	public final Subject objetoObservavel;
	
	
	// Construtor que obriga o passagem de um Subject concreto e em seguida � feito o registro 
	// deste observador no mesmo.
	public CondicoesAtuaisObserver(Subject objetoObservavel) {
		
		// Lancando uma exce��o caso o Objeto que implementa Subject passado ser nulo.
		if(objetoObservavel == null) {
			throw new IllegalArgumentException("Objeto observavel nao encontrado");
		}
		
		this.objetoObservavel = objetoObservavel;
		
		// Esse linha � uma das partes mais importates do Pattern.
		// Este observer est� se registrando junto ao objeto observ�vel
		objetoObservavel.adicionarObservador(this);
	}
	
	// Recebendo os valores atualizados e chamando o m�todo que exibe
	@Override
	public void atualizar(Float humidade, Float temperatura, String previsao) {
		this.humidade = humidade;
		this.temperatura = temperatura;
		this.previsao = previsao;
		
		//exibindo...
		exibir();
	}

	// M�todo n�o faz parte do pattern.
	// A exibi��o ser� bem simples pelo console.
	@Override
	public void exibir() {
		System.out.println("***************  OBSERVADOR - CONDICOES ATUAIS ***************");
		System.out.println();
		System.out.println("[Humidade: " + this.humidade + "] - [Temperatura: " + this.temperatura + "] - [Previsao: " + previsao + "]");
		System.out.println();
		System.out.println("**************************************************************");
	}

}
