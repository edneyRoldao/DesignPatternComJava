package adapter.exemploJavaCodeGeeks;

public class VisaToMasterAdapter implements PagamentoMaster {
	
	private String nomeConsumidor;
	private String cardNumber;
	private String dataVencimento;
	private int securityCode;
	private double valorTotal;
	
	private final PagamentoVisa pagamentoVisa;

	public VisaToMasterAdapter(PagamentoVisa pagamentoVisa) {
		this.pagamentoVisa = pagamentoVisa;
		setProperties();
	}
	
	private void setProperties() {
		setCardNumber(this.pagamentoVisa.getNumeroCartao());
		setNomeConsumidor(this.pagamentoVisa.getNomeCliente());
		setDataVencimento(this.pagamentoVisa.getMesVencimento() + "/" + this.pagamentoVisa.getAnoVencimento());
		setSecurityCode(this.pagamentoVisa.getCodigoSeguranca());
		setValorTotal(this.pagamentoVisa.getQuantia());
	}
	
	@Override
	public String getCardNumber() {
		return cardNumber;
	}

	@Override
	public String getNomeConsumidor() {
		return nomeConsumidor;
	}

	@Override
	public String getDataVencimento() {
		return dataVencimento;
	}

	@Override
	public int getSecurityCode() {
		return securityCode;
	}

	@Override
	public double getValorTotal() {
		return valorTotal;
	}

	@Override
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void setNomeConsumidor(String nomeConsumidor) {
		this.nomeConsumidor = nomeConsumidor;
	}

	@Override
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
