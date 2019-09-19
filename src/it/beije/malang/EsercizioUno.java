import java.lang.Math;
import java.util.*;

public class EsercizioUno {

	public static void main(String... args) {
		System.out.println("\nScegliere tipo di operazione: \n");
		System.out.println("\n1. Addizione\n2. Sottrazione\n3.Moltiplicazione\n4. Divisione\n");
		
		Scanner sc = new Scanner(System.in);
		
		double operazione = sc.nextDouble();
		
		if(operazione == 1) {
			System.out.println("\nIl risultato dell'addizione tra operandi e' di: " + addizione(args[]));
		}
			
	}


	public static double addizione(double... n) {
		double res;
		for(i=0; i<(n.length - 1); i++) {
			res += n[1];
		}
		return res;
	}

	public static double sottrazione(double... n){

	}

	public static double moltiplicazione(double... n){

	}

	public static double divisione(double... n){

	}

}