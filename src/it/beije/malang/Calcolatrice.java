package it.beije.malang;

public class Calcolatrice {
	
	static double risultato;
	static Double vect[] = new Double[3];
	
	public static void main(String... args) {
		
		//Double var1 = Double.valueOf(args[0]);
		//Double var2 = Double.valueOf(args[1]);
		//Double var3 = Double.valueOf(args[2]);
		

		
		
		for(int i=0; i<args.length; i++) {
			Double var = Double.valueOf(args[i]);
			vect[i] = var;
		}
		
		
		for (int j=0; j<vect.length;j++) {
			
			Double result=(vect[j]);
			System.out.println(result);
		}
		
	}
	
	
	static double addizione(double... a) {
		for(int i=0; i<a.length; i++) {
			risultato += a[i];
		}
		
		return risultato;
	}
}
