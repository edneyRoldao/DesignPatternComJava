package strategy.exemplo02.util;

public class PeriodoUtil {
	
	/**
	 * Constantes
	 * Hora, dia e mes definidos em milisegundos
	 */
	private static final long HORA = 3600000;
	private static final long DIA = 24 * HORA;
	private static final long MES = 30 * DIA;

	
	public static long getHoraEmMilisegundos() {
		return HORA;
	}
	
	public static long getDiaEmMilisegundos() {
		return DIA;
	}
	
	public static long getMesEmMilisegundos() {
		return MES;
	}

}
