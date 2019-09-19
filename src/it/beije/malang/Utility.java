package it.beije.malang;

public class Utility {
	
	
	public static void main(String[] args) {
		System.out.println(divisione(10, 2));
	}
	
	public static double somma(double... args){
		int sum = 0;

		for (double arg : args){
			sum += arg;
		}
		return sum;
	}
	
	public static double sottrazione(double... args){
		double sott = 0;

		for (double arg : args){
			sott -= arg;
		}
		return sott;
	}
	
	public static double moltiplicazione(double... args){
		double mol = 1;

		for (double arg : args){
			mol *= arg;
		}
		return mol;
	}
	
	public static double divisione(double... args){
		double mol = args[0];
		
		for (int i = 1; i < args.length; i++){
			mol /= args[i];
		}
		return mol;
	}
	
}
