package it.beije.malang;
import java.util.*;
public class Calcolatrice {
	
		static double nums;
		static double somma;
		//static double differenza;
		static double div;
		/*
		public static double Somma() {
			
			Scanner sc = new Scanner(System.in);
			
			while (sc.hasNextDouble()) {
		         nums=sc.nextDouble();
		         if (nums <= 0) {
		        	 System.out.println("numero negativo non valido");
		        	 System.out.println("=");
		        	 break;
		         	}
		         somma = somma + nums;
		         }
		return somma;   
		}
		*/
		
		public static double Somma(double... numeri) {
			for(int i = 0 ; numeri[i] >= 0 && i < numeri.length; i++ ) {
				somma = somma + numeri[i];
			}
			if (nums <= 0) {
	        	 System.out.println("hai inserito un valore negativo");
			}
			return somma;
		}	
		
		
		public static double Sottrazione(double... numeri) {
			if (numeri.length == 1) {
				return numeri[0];
			}
			else if ( numeri.length == 2 ) {
				return numeri[0] - numeri[1];
			}
			else {
				double differenza = numeri[0];
				for(int i = 1 ; i < numeri.length; i++ ) {
				differenza = differenza - numeri[i];
			}
				return differenza;
				}
		}
		
		public static double Moltiplicazione(double... numeri ) {
			if(numeri.length == 1) {
				return numeri[0];
			}
			else {
				double prodotto = 1;
				for(int i = 0 ; i < numeri.length; i++ ) {
				prodotto = prodotto * numeri[i];
				}
				return prodotto;
			}
		}
		
		public static double Divisione(double... numeri) {
			if(numeri.length < 1) {
				return numeri[0];
			}
			else {
				double div = numeri[0];
				for(int i = 1 ; i < numeri.length ; i++ ) {
					if (numeri[0] == 0) {
						System.out.println("stai dividendo 0");
						return 0 ;
					}
					else if (numeri[i] == 0){
//se metto solo il throw senza try-catch ho l'errore con l'uscita dal programma, così invece no, mi da errore, ma
//lo riesco a gestire e il programma non si arresta del tutto, infatti così mi stampa fino all'errore, se no NO.						
						try {
							throw new IllegalArgumentException(			//mi da un'eccezione, mi avvisa che qualcosa non va
										"# non puoi dividere per zero");
						} catch (IllegalArgumentException error)		
						{
							System.out.println("metti un numero diverso da zero in posizione:" + i + error.getMessage());
							//break;
						}
						
						
						
						//throw new IllegalArgumentException(		//mi da un'eccezione, mi avvisa che qualcosa non va
							//	"# non puoi dividere per zero");	//gli dico cosa mi deve comuicare come eccezione
						//return 0;
					}
					else {
						div = div / numeri[i];
					}
				}
				return div;
			}
			
		}
		
		
		
		public static void main(String[] args ) {
			
			System.out.println("scegli operazione:");
			System.out.println("1. somma");
			System.out.println("2. sottrazione");
			System.out.println("3. prodotto");
			System.out.println("4. divisione");
			
			Scanner sc = new Scanner(System.in);
			int operazione = sc.nextInt();
			sc.close();
			
			switch (operazione) {
			
				case 1:
					//System.out.println("inserisci i numeri da sommare"); serviva per la classe col while, dare numeri da console
					//System.out.println("premi = per avere il risultato");
					System.out.println(Calcolatrice.Somma(5, -6.2, 2.1, -10));	
					break;
					
				case 2:
					//System.out.println("inserisci i numeri da sottrarre");
					//System.out.println("premi = per avere il risultato");
					System.out.println(Calcolatrice.Sottrazione(-5, 3, -1));	
					break;
				case 3:
					//System.out.println("inserisci i numeri da moltiplicare");
					//System.out.println("premi = per avere il risultato");
					System.out.println(Calcolatrice.Moltiplicazione(2.1, 3, 2));	
					break;
				case 4:
					//System.out.println("inserisci i numeri da dividere");
					//System.out.println("premi = per avere il risultato");
					System.out.println(Calcolatrice.Divisione(14, 0, 2, 0));	
					break;
			
			}
		}
}

