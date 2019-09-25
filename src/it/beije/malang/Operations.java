package it.beije.malang;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Operations {
	
	// definisco un metodo che restituisce la somma degli elementi dell'array
	public static int sum(int[] arr) {
		int c = 0;
		for (int i = 0; i<arr.length; i++) {
			c = c + arr[i];
		}
		
		return c; 
	}
	
	// definisco un metodo che restituisce il prodotto degli elementi dell'array
	public static int prodotto(int[] arr) {
		int c = 1;
		for (int i = 0; i<arr.length; i++) {
			c = c * arr[i];
		}
		
		return c; 
	}
	
	// definisco un metodo che restituisce la differenza degli elementi dell'array
		public static int diff(int[] arr) {
			int c = arr[0];
			for (int i = 1; i<arr.length; i++) {
				c = c - arr[i];
			}
			
			return c; 
		}
	
	// definisco un metodo che restituisce il rapporto degli elementi dell'array
		public static int rapporto(int[] arr) {
			int c = arr[0];
			if (arr.length == 1){
				return arr[0];
			}
			else
				return arr[0]/arr[1];
				
			}
	
	
	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in); // definisco il metodo scanner
			
			int i;  // i è la variabile che definisce la lunghezza del mio array
			
			
			//INSERIMENTO INTERI NELL'ARRAY
			
			do {
			System.out.println("Inserisci la lunghezza dell'array: ");
			i = scan.nextInt();
			} while (i==0);
			
			
			String[] arr = new String[i];
						
			for(int j=0; j<arr.length; j++){
				System.out.println("Inserisci valore: ");
				String valore = scan.next();
				arr[j] = valore;
				}
			System.out.println(Arrays.toString(arr));
			
			int[] arr2 = new int[i-1]; // array di numeri
			
			//costruisco l'array numerico
			for(int k=1; k<arr.length; ) {
				for(int z=0; z<arr2.length; ) {
					arr2[z] = Integer.parseInt(arr[k]);
					k++;
					z++;
				}
			}
			
			System.out.println(Arrays.toString(arr2));
			

			//applico il metodo della somma
			if (arr[0].equals("+")) {				
				System.out.println(Operations.sum(arr2));

			}
			
			//applico il metodo del prodotto
			if (arr[0].equals("*")) {				
				System.out.println(Operations.prodotto(arr2));

			}
			
			//applico il metodo della sottrazione
			if (arr[0].equals("-")) {				
				System.out.println(Operations.diff(arr2));

			}
			
			//applico il metodo del rapporto
			if (arr[0].equals("/")) {
				System.out.println(Operations.rapporto(arr2));
				
			}
						
	}
}
			
			


			
