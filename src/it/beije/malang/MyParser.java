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
		double count = 0;
		
		if(!num.contains("."))
			return parseInt(num);
		
		if(num.indexOf(".") == num.lastIndexOf("."))
		{
		for (int i=0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (c >= '0' && c <= '9' || c=='.'  ) {
				if (c=='.')
				{
					for (int j=i+1; j<num.length(); j++)
					{
					i=num.length();
					val = (val*10) + (num.charAt(j) - 48);
					count++;
					}
					val=val/(Math.pow(10,count));
				}
					
				else
				val = (val*10) + (c - 48);
			}
				else {
				throw new IllegalArgumentException("il valore inserito non è numerico");
			}
		}
		return val;
		}
		else
			throw new IllegalArgumentException("il valore inserito non è un numero");
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
