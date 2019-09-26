package it.beije.malang;
import java.lang.Math;

public class MyParser {
	
	public static int parseInt(String num) {
		int val = 0;
		for (int i=0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (c >= '0' && c <= '9') {
				val = (val*10) + (c - 48);
			} else {
				throw new IllegalArgumentException("il valore inserito non è numerico");
			}
		}
		
		return val;
	}
	
	
	public static double parseDouble(String num) {
		
		double val = 0; 			// variabile per la parte intera
		String caratteri = ".";		// carattere di controllo 
		double decimale = 0;		// variabile per la parte decimale
		int count = 0;				// contatore dei punti
		
		//ciclo per contare il numero dei punti, se sono più di uno esce e ritorna 0.0 altrimenti entra nel ciclo
		for (int k = 0; k<num.length(); k++) {
			char c = num.charAt(k);
			if (c == caratteri.charAt(0)) {
				count++;
			}
		}
		System.out.println("count: " + count);
		
		// se i punti sono meno o uguali a uno esegue..
		if (count<=1) {
			
			for (int i=0; i < num.length(); i++) {
				char c = num.charAt(i);
				
				// se il numero inserito è un numero procedo...
				if (c >= '0' && c <= '9') {
					val = (val*10) + (c - 48);
					System.out.println("val " +val);
				}
				
				//se incontro il primo punto..
				else if (c == caratteri.charAt(0)) {  
				
					// entro nelle cifre decimali aumentando il contatore di uno in modo da saltare l'indice del punto
					for (int j = i + 1; j < num.length(); j++) {
						int esp = j-i;
						char ca  = num.charAt(j);
					
						if (ca >= '0' && ca <= '9') {
						
							decimale = decimale + ((ca-48)*Math.pow(10, -esp));
						
							System.out.println("decimale: "+(decimale));
						}
					}
				
					i = num.length(); // aumento i per non farlo rientrare nel ciclo iniziale
				}
			
				else {
					throw new IllegalArgumentException("il valore inserito non è numerico");
				}
			}
		
			return (val + decimale);
		}
		
		else {
			System.out.println("il valore inserito non è accettabile!!");
			return 0.0;
		}
	}
		
		

public static void main(String[] args) {
		//System.out.println(parseInt("5142"));
		
//		System.out.println(parseDouble("56"));
//		System.out.println(parseDouble("5.6"));
//		System.out.println(parseDouble("53.76"));
//		System.out.println(parseDouble("5.60"));
//		System.out.println(parseDouble("54.6"));
//		System.out.println(parseDouble("0.6"));
//		System.out.println(parseDouble("5.6.8"));
//		System.out.println(parseDouble(".56"));
//		System.out.println(parseDouble("56."));
	}

}
