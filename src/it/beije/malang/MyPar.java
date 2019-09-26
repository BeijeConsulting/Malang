package it.beije.malang;

public class MyPar {


	
	public static int parseInt(String num) {
		int val=0;
		for(int i=0;i<num.length();i++){
			char c=num.charAt(i);
			if (c>='0' && c<='9') {
				val=((val*10)+(c-48));
				
			
			}else {
				throw new IllegalArgumentException("il vaor inserito non è un numerico");
			}
		}return val;
	}
	
	public static double parseIntero(String num) {
		double dec = 0;
		int res = 0;
		
		
		for(int i = 0; i < num.length(); i++) {
			
			char c = num.charAt(i);
			
			if(c >= '0' && c <= '9'){
				
				res = (res * 10) + (c - 48);
			
			}else if(	i != 0		&&		i != num.length()-1		&&	c == '.'    ) {
				
				dec = parseDouble(num.substring(i+1));
				
				break;
							
			}else {
				throw new IllegalArgumentException("non hai inserito un numero1");
			}
			
		}
	//eturn res+dec;
		
		return res;
	}
	
	public static double parseDouble(String num) {
		
	double res = 0.0;
	
	for(int i = num.length()-1; i >= 0; i--) {
		char c = num.charAt(i);
		if(c >= '0' && c <= '9'){
			res = (res/10) + (c - 48);
		}else {
			throw new IllegalArgumentException("non hai inserito un numero");
		}
		
	}
	return res/10;
}
	public static double somma(String num1,String num2) {
		
		double a=	parseIntero(num1);
		double b=	parseDouble(num2); 
		double c=a+b;

		return c;
	}
	

	public static void main(String[] args) {

		System.out.println(somma("450","353"));
		
	}
//System.out.println(parseIntero("450"));
//System.out.println(parseDouble("345"));
	//	System.out.println(parseIntero("925.643"));
		
	
	public static int parseInt1(String num) {
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
	
	public static double parseDouble1(String num) {
		double val = 0;
		
		//....
		
		return val;
	}

	public static void main1(String[] args) {
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
