package strategy.exemplo01;

public class NaoVoa implements HabilidadeVoarInterface {

	@Override
	public String voar() {
		return "NAO pode voar !";
	}

}
