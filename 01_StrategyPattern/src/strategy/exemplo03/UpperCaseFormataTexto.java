package strategy.exemplo03;

public class UpperCaseFormataTexto implements FormataTextoInterface{

	@Override
	public void formatar(String texto) {
		System.out.println("Formatando o texto em capitalCase: " + texto.toUpperCase());
	}

}
