package strategy.exemplo03;

public class LowerCaseFormataTexto implements FormataTextoInterface{

	@Override
	public void formatar(String texto) {
		System.out.println("Formatando o texto em caixa baixa: " + texto.toLowerCase());
	}

}
