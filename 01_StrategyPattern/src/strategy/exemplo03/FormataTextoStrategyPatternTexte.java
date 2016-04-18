package strategy.exemplo03;

public class FormataTextoStrategyPatternTexte {

	public static void main(String[] args) {
		
		String texto = "textando os formatadores de texto com o strategy pattern";
		
		//////////////////////////////////////////////////////////////////////////
		///////////////////// Strategy pattern TESTE /////////////////////////////
		//////////////////////////////////////////////////////////////////////////
		FormataTextoInterface formatador = new UpperCaseFormataTexto();
		EditorTexto editor = new EditorTexto(formatador);
		editor.publicarTexto(texto);
		
		/**
		 * IMPORTANTE: Veja abaixo que vamos mudar o comportamento do editor apenas trocando o formatador.
		 * 			   tudo de forma dinâmica.
		 * 
		 * 			   Essa é a parte mais relevante do Strategy Pattern	
		 */
		
		//alterando o formatador
		formatador = new LowerCaseFormataTexto();
		editor = new EditorTexto(formatador);
		
		System.out.println();
		System.out.println("O formatador foi alterado dinamicamente");
		editor.publicarTexto(texto);
		
	}
	
}
