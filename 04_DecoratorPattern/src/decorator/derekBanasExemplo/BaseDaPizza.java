package decorator.derekBanasExemplo;

/**
 * 
 * @author Edney Roldao
 *
 */
public class BaseDaPizza implements Pizza{

	@Override
	public String getDescricao() {
		return "Massa fina";
	}

	@Override
	public double getPreco() {
		return 4.00;
	}

}
