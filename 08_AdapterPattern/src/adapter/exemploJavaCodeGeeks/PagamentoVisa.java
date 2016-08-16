package adapter.exemploJavaCodeGeeks;

public interface PagamentoVisa {

	String getNumeroCartao();
	String getNomeCliente();
	String getMesVencimento();
	String getAnoVencimento();
	short getCodigoSeguranca();
	double getQuantia();
	
	void setNumeroCartao(String numeroCartao);
	void setNomeCliente(String nomeCliente);
	void setMesVencimento(String mesVencimento);
	void setAnoVencimento(String anoVencimento);
	void setCodigoSeguranca(short codigoSeguranca);
	void setQuantia(double quantia);
	
}
