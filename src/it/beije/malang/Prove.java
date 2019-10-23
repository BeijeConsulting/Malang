package it.beije.malang;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Prove {

		public static void main(String[] args) {
			
			LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
			Period p = Period.of(1, 2, 3);
			d = d.minus(p);
			DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
			System.out.println(d.format(f));
			
		//	System.out.println("ciaocome stai".endsWith("e stai"));
			
			StringBuilder a = new StringBuilder("ciao");
			StringBuilder c = a.append(2);
			System.out.println(a.equals(c));
			//mi da NumberFormatExc, vuole solo stringhe di interi
			int x = Integer.parseInt("12.24");
			System.out.println(x);
			}
			
			
	//	Bird bird = new Bird();
	//	bird.displayInformation();
			
//			int arr[] = new int[5];
//			arr = new int[] {1,2,3,4};
//			int x = arr[0]-- /arr[0]*arr[4];
//			System.out.println(x);
//			
			
//			for (int i = 0; i < 10;) {
//				i = i++;
//				System.out.println("prova");

			
	
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("inserisci data: giorno mese anno");
//		int giorno = sc.nextInt();
//		int mese = sc.nextInt();
//		int anno = sc.nextInt();
//		
//		
//		System.out.println(giorno);
//		System.out.println(mese);
//		System.out.println(anno);
//		
//		LocalDate date = LocalDate.of(anno, mese, giorno);
//		
//		
//		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
//		System.out.println(date.format(f));
//		 

		
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
	
		




















