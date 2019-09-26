package it.beije.malang;
import java.util.*;
import java.math.*;
public class MyParser {
	

//	public static int parseInt(String num) {
//		int val = 0;
//		for (int i=0; i < num.length(); i++) {
//			char c = num.charAt(i);
//			if (c >= '0' && c <= '9') {
//				val = (val*10) + (c - 48);
//			} else {
//				throw new IllegalArgumentException("il valore inserito non è numerico");
//			}
//		}
//		
//		return val;
//	}
	
	public static double parseDouble(String num) {
		double val = 0;
		double decimale = 0;
		//System.out.println("lunghezza stringa: " + num.length());
		int indice =num.indexOf('.');
		//System.out.println("posizione indice: " + indice);
				
		try {
			val = Integer.parseInt(num);						//verifico se è un intero, se ok fine.
		}catch(IllegalArgumentException e) {					//se decimale tratto l'eccezione
			
			for (int i=0; i < indice; i++) {					//ciclo prima della virgola per prendere
				char c = num.charAt(i);							//la parte intera
				val = (val*10) + (c - 48);						//assego alla parte intera
				
				
				//System.out.println("valore int: "+val);
			}		
			
		for (int b = num.length()-1 ; b > indice ; b--) {		//ciclo dopo la virgola per prendere i decimali
			char caratt = num.charAt(b);
			//System.out.println("ok");
			
			decimale =decimale*Math.pow(10, -1) + (caratt-48)*Math.pow(10, -1);		//come per val ma scalo di 10^-1
			//System.out.println(decimale);
			if(caratt =='.') throw new IllegalArgumentException("il valore inserito non è numerico");  //errore se trova un altro punto '.'
		}
		}
	return val + decimale;  //ritrona la somma della parte intera piu quella decimale
	}

	public static void main(String[] args) {
//		System.out.println(parseInt("5142.5"));
		
	System.out.println(parseDouble("56"));
		System.out.println(parseDouble("5.6"));
		System.out.println(parseDouble("53.76"));
		System.out.println(parseDouble("5.60"));
		System.out.println(parseDouble("54.6"));
		System.out.println(parseDouble("0.6"));
		System.out.println(parseDouble("5.6.8"));
		System.out.println(parseDouble(".56"));
		System.out.println(parseDouble("56."));
		
	}
}
