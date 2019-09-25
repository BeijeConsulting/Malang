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
		double init = 0.0;
		double floatpoint = 0.0;
		String[] arrstr = num.split("\\.");

		if (arrstr.length > 2) throw new IllegalArgumentException();
		for (int i=0; i < arrstr[0].length(); i++) {
			char c = arrstr[0].charAt(i);
			if (c >= '0' && c <= '9') {
				init = (init*10) + (c - 48);
			} else {
				throw new IllegalArgumentException("il valore inserito non è numerico");
			}
		}
		//System.out.println(init);
		if(arrstr.length == 2) {
			for (int i=0; i < arrstr[1].length(); i++) {
				char c = arrstr[1].charAt(i);
				if (c >= '0' && c <= '9') {
					floatpoint += (c - 48) * Math.pow(10, -(i+1));
					//System.out.println(floatpoint);
				} else {
					throw new IllegalArgumentException("il valore inserito non è numerico");
				}


			}
		}
		return init + floatpoint;
	}



	public static void main(String[] args) {
		//System.out.println(parseInt("5142"));

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
