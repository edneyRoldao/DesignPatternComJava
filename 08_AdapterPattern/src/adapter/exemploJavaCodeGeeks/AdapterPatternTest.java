package adapter.exemploJavaCodeGeeks;

public class AdapterPatternTest {

	public static void main(String[] args) {
		
			PagamentoVisa visa = new PagamentoVisaImpl();
			visa.setAnoVencimento("2030");
			visa.setCodigoSeguranca((short) 666);
			visa.setMesVencimento("06");
			visa.setNomeCliente("Joao das Couves");
			visa.setNumeroCartao("7845325614746666");
			visa.setQuantia(2678.45);
			
			PagamentoMaster master = new VisaToMasterAdapter(visa);
			
			testPagamentoMaster(master);
	}
	
	private static void testPagamentoMaster(PagamentoMaster master) {
		System.out.println(master.getCardNumber());
		System.out.println(master.getNomeConsumidor());
		System.out.println(master.getDataVencimento());
		System.out.println(master.getValorTotal());
		System.out.println(master.getSecurityCode());
	}
	
}
