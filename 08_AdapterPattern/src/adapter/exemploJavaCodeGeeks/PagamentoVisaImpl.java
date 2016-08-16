package adapter.exemploJavaCodeGeeks;

public class PagamentoVisaImpl implements PagamentoVisa {
	
	private String numeroCartao;
	private String nomeCliente;
	private String mesVencimento;
	private String anoVencimento;
	private short codigoSeguranca;
	private double quantia;

	@Override
	public String getNumeroCartao() {
		return numeroCartao;
	}

	@Override
	public String getNomeCliente() {
		return nomeCliente;
	}

	@Override
	public String getMesVencimento() {
		return mesVencimento;
	}

	@Override
	public String getAnoVencimento() {
		return anoVencimento;
	}

	@Override
	public short getCodigoSeguranca() {
		return codigoSeguranca;
	}

	@Override
	public double getQuantia() {
		return quantia;
	}

	@Override
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	@Override
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	@Override
	public void setMesVencimento(String mesVencimento) {
		this.mesVencimento = mesVencimento;
	}

	@Override
	public void setAnoVencimento(String anoVencimento) {
		this.anoVencimento = anoVencimento;
	}

	@Override
	public void setCodigoSeguranca(short codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	@Override
	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}

}
