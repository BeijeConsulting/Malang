package it.beije.malang;

public class MyParser {
	
	public static int parseInt(String num) {
		int val = 0;
		for (int i=0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (c >= '0' && c <= '9') {
				val = (val*10) + (c - 48); //c- 48 perché 48 corrisponde al numero ASCII di 0 in char// val *10 per la gestione delle deccine, centinaie ..ecc
				
			} else {
				throw new IllegalArgumentException("il valore inserito non è numerico");
			}
		}
		
		return val;
	}
	
	public static double parseDouble(String num) {
		double val = 0;
		
		//....
		
		return val;
	}

	public static void main(String[] args) {
		//System.out.println(parseInt("5142"));
		
		System.out.println(parseDouble("56"));
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
