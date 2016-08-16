package adapter.exemploJavaCodeGeeks;

public interface PagamentoMaster {

	String getNomeConsumidor();
	String getNomePropCartao();
	String getDataVencimento();
	int getSecurityCode();
	double getValorTotal();
	
	void setNomeConsumidor(String nomeConsumidor);
	void setNomePropCartao(String nomePropCartao);
	void setDataVencimento(String dataVencimento);
	void setSecurityCode(int securityCode);
	void setValorTotal(double valorTotal);
	
}
