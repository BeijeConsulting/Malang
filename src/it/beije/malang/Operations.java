package it.beije.malang;



public class Operations {
	public static int somma(int... values) {
		int somma=0;
		for (int value:values)
		{
			somma+=value;
		}
		return somma;
	}
	
	public static int sottrazione(int... values ) {
		int sottr = 0;
		boolean started=false;
		for (int value:values)
		{
			if (!started) {
				sottr=value;
				started=true;
				}
			else 
				sottr-=value;
		}
		return sottr;
	}
	
	public static long moltiplicazione(int... values) {
		long molt=1;
		for (int value:values)
		{
			molt*=value;
		}
		return molt;
	}
	
	public static double divisione(int... values) {
		int div = 0;
		boolean started=false;
		for (int value:values)
		{
			if (!started) {
				div=value;
				started=true;
				}
			else 
				div-=value;
		}
		return div;
	}
}
