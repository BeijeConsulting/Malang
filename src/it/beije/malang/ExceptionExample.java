package it.beije.malang;

public class ExceptionExample {
	
	public static void main(String[] args) {
		int a;
		int b;
		
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);

			double c = (double)a / b;
			System.out.println("la divisione " + a + " / " + b + " è uguale a " + c);
		} catch (ArrayIndexOutOfBoundsException aEx) {
			System.out.println("Argomenti insufficenti : " + aEx.getMessage());
			aEx.printStackTrace();
		} catch (NumberFormatException nEx) {
			System.out.println("Valore non numerico : " + nEx.getMessage());
			nEx.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Operazione non valida : " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Ciao vado");
		}
		
	}

}
