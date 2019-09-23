package it.beije.malang;
import java.util.*;

public class Operazioni {
	
	static Scanner t = new Scanner(System.in);
	static void somma(int[] addendiOperazione) {
		int somma = 0;
		for(int i = 0; i < addendiOperazione.length; i++)
			somma += addendiOperazione[i];
		
		System.out.println("La somma è uguale a " + somma);
	}
	
	static void sottrazione(int[] addendiOperazione) {
		int sottrazione = 0;
		
		if(addendiOperazione.length == 1 )
			sottrazione = addendiOperazione[0];
		else if(addendiOperazione.length == 2)
			sottrazione = addendiOperazione[0] - addendiOperazione[1];
		else {
			sottrazione = addendiOperazione[0];
		for(int i = 1; i < addendiOperazione.length; i++)
			sottrazione -= addendiOperazione[i];
		}
		
		System.out.println("La sottrazione è uguale a " + sottrazione);
	}
	
	static void moltiplicazione(int[] addendiOperazione) {
		int moltiplicazione = 1;
		
		if(addendiOperazione.length == 1 )
			moltiplicazione = addendiOperazione[0];
		else if(addendiOperazione.length == 2)
			moltiplicazione = addendiOperazione[0] * addendiOperazione[1];
		else {
		for(int i = 0; i < addendiOperazione.length; i++)
			moltiplicazione *= addendiOperazione[i];
		}
		
		System.out.println("La moltiplicazione è uguale a " + moltiplicazione);
		
	}
	
	static void divisione(int[] addendiOperazione) {
		
		int divisione = 1;
		
		if(addendiOperazione.length == 1 )
			divisione = addendiOperazione[0];
		else if(addendiOperazione.length == 2 && addendiOperazione[1] != 0)
			divisione = addendiOperazione[0] / addendiOperazione[1];
		else {
			divisione = addendiOperazione[0];
		for(int i = 1; i < addendiOperazione.length; i++)
			if(addendiOperazione[i] != 0)
				divisione /= addendiOperazione[i];
		}
		
		System.out.println("La divisione è uguale a " + divisione);
		
	}
	
	public static void main(String[] args) {
		
		
	
		System.out.println("Quanti elementi devono esserci?");
		int n = t.nextInt();
		
		int[] addendiOperazione = new int[n];
		
		System.out.println("Inserisci gli elementi: ");
		
		for(int i = 0; i < n; i++){
			addendiOperazione[i] = t.nextInt();
		}
		
		somma(addendiOperazione);
		sottrazione(addendiOperazione);
		moltiplicazione(addendiOperazione);
		divisione(addendiOperazione);
		
	}
}
