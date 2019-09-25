package it.beije.malang;

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
		double val = 0;
		double decimale = 0;
		
		for (int j=0; j<num.length(); j++) {
			char c = num.charAt(j);
			if (c>='0' && c<='9') {
				val=(val*10)+(c-48);
				
			} else if (c=='.' && j!=0 && j!=num.length()-1) {
				decimale = dec(num.substring(j+1));
				break;
			} else {
				throw new IllegalArgumentException("Il valore inserito non è numerico.");
			}
		}
		
		return val;
	}
	
	public static double dec (String num) {
		double valDouble = 0;

		for (int j=(num.length()-1); j>=0; j--) {
			char c = num.charAt(j);
			if (c>='0' && c<='9') {
				valDouble=(valDouble/10)+(c-48);
			} else {
				throw new IllegalArgumentException("Il valore inserito non è numerico.");
			}
		}
		
		
		return valDouble/10;
	}

	public static void main(String[] args) {
		System.out.println(parseDouble("12345.6789"));
		
//		System.out.println(parseDouble("5"));
//		System.out.println(dec("45678"));
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
