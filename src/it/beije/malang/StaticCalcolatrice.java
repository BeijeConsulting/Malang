package it.beije.malang;

public class StaticCalcolatrice {


	public static double somma(double... vettore) {
		double somma = 0.0;
		for(int i=0; i<=vettore.length-1; i++) {	
			somma += vettore[i];
		}
		return somma;
	}

	public static double sottrazione(double... vettore) {
		double somma = vettore[0];
		for(int i=1; i<=vettore.length-1; i++) {	
			somma -= vettore[i];
		}
		return somma;
	}
	
	public static double moltiplicazione(double... vettore) {
		double somma = vettore[0];
		for(int i=1; i<=vettore.length-1; i++) {	
			somma *= vettore[i];
		}
		return somma;
	}
	public static double divisione(double... vettore) {
		double somma = vettore[0];
		if(vettore.length==1) {
			somma = vettore[0];
		}
		else {
			for(int i=1; i<=vettore.length-1; i++) {	
				somma /= vettore[i];
			}
		}
		return somma;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s = somma(1,2,3,10);
		System.out.println(s);
		double d = sottrazione(10,15);
		System.out.println(d);
		double p = moltiplicazione(2,7);
		System.out.println(p);
		double q = divisione(10,7);
		System.out.println(q);
	}

}
