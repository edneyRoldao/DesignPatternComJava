package strategy.exemplo03;

public class FormataTextoRegraVancouver implements FormataTextoInterface{

	@Override
	public void formatar(String texto) {
		System.out.println("Formatando o texto em capitalCase: " + texto.toUpperCase());
	}

}
