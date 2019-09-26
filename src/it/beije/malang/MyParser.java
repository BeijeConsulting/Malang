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
		int x = num.indexOf(".");
		double cont = 10;
		if (x != -1) {
			for(int i=0;i<num.length();i++) {
				if (i<x) {
					if ((num.charAt(i) >= '0' && num.charAt(i) <= '9')) {
						//System.out.println("altro");
						val += ((num.charAt(i)-48)*Math.pow(10, num.length()-x-2-i));
						//System.out.println("val = " + val);
					}
				}
				else if (i>x){
					if ((num.charAt(i) >= '0' && num.charAt(i) <= '9')) {
						//System.out.println("ciao");
							
						//val += ((num.charAt(i)-48)*Math.pow(10, cont));
						double d = ((num.charAt(i)-48))/cont;
						//System.out.println((num.charAt(i)-48) + " / " + cont);
						cont = cont * 10;
						//System.out.println("d = " + d);
						val += d;
						//System.out.println("val = " + val);
					}
				}	
			}
		}
		else {val = parseInt(num);}
		
		return val;
	}

	public static void main(String[] args) {
		//System.out.println(parseInt("5142"));
		
//		System.out.println(parseDouble("56"));
//		System.out.println(parseDouble("5.6"));
		System.out.println(parseDouble("53.76"));
		System.out.println(parseDouble("5.60"));
		System.out.println(parseDouble("54.6"));
		System.out.println(parseDouble("0.6"));
		System.out.println(parseDouble("5.6.8"));
		System.out.println(parseDouble(".56"));
		System.out.println(parseDouble("56."));	

}

}
