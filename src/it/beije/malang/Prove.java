package it.beije.malang;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Prove {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci data: giorno mese anno");
		int giorno = sc.nextInt();
		int mese = sc.nextInt();
		int anno = sc.nextInt();
		
		
		System.out.println(giorno);
		System.out.println(mese);
		System.out.println(anno);
		
		LocalDate date = LocalDate.of(anno, mese, giorno);
		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		System.out.println(date.format(f));
		 
		 
		
		

		
		
		
		
		
		
		
		
		
		
		
		 /*
		String name = "Webby";
		String a = speak(name);
		System.out.println(a);
		}
		public static String speak(String name) {
		name = "Sparky";
		return name;
		//System.out.println(name);
		 */
		
		 
		 
		 /*
		public class Prove {
			 static int number; // 1
			 public Prove() {
				 number++;
				 }
			 public static void main(String[] args) {
			 
			 Prove c1 = new Prove(); // 1 	
			 System.out.println(number);
			 }
			 
		*/	 
			 
		
	}
}

