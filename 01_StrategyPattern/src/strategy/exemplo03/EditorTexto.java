package strategy.exemplo03;

public class EditorTexto {
	
	//////////////////////////////////////////////////////////////////////////
	///////////////////// Inicio - Strategy pattern //////////////////////////
	//////////////////////////////////////////////////////////////////////////

	// Composi��o
	private final FormataTextoInterface formatadorTexto;
	
	// Permitindo que possamos trocar a classe que implementa a interface ( interchangeable )
	public EditorTexto(FormataTextoInterface formatadorTexto) {
		this.formatadorTexto = formatadorTexto;
	}
	
	// Chamando o m�todo da interface.
	//OBS: no momento de usar, quem vai chamar este � a classe concreta que implementa a interface.
	public void publicarTexto(String texto) {
		formatadorTexto.formatar(texto);
	}
	
	//////////////////////////////////////////////////////////////////////////
	////////////////////// fim - Strategy pattern ////////////////////////////
	//////////////////////////////////////////////////////////////////////////


}
