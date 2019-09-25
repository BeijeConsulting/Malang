package it.beije.malang;
public class MyParserDouble {

	public static double parseParteIntera(String num) {
		double decimale = 0;
		int result = 0;
		
		
		for(int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if(c >= '0' && c <= '9'){
				result = (result * 10) + (c - 48);
			
			}else if(c == '.'&& i != num.length()-1 && i != 0) {
				decimale = parseDouble(num.substring(i+1));
				break;
							
			}else {
				throw new IllegalArgumentException("Il valore inserito non è un carattere numerico");
			}
			
		}
		return result+decimale;
	}

	
	public static double parseDouble(String num) {
		
		double result = 0.0;
		
		for(int i = num.length()-1; i >= 0; i--) {
			char c = num.charAt(i);
			if(c >= '0' && c <= '9'){
				result = (result/10) + (c - 48);
			}else {
				throw new IllegalArgumentException("Il valore inserito non è un carattere numerico");
			}
			
		}
		return result/10;
	}

public static void main(String[] args) {
	
	System.out.println(parseParteIntera("78675.0998897902"));
	
	
	
	
}

	
	
}
