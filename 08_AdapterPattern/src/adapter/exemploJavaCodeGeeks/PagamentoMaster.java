package adapter.exemploJavaCodeGeeks;

public interface PagamentoMaster {

	String getCardNumber();
	String getNomeConsumidor();
	String getDataVencimento();
	int getSecurityCode();
	double getValorTotal();
	
	void setCardNumber(String cardNumber);
	void setNomeConsumidor(String nomeConsumidor);
	void setDataVencimento(String dataVencimento);
	void setSecurityCode(int securityCode);
	void setValorTotal(double valorTotal);
	
}
