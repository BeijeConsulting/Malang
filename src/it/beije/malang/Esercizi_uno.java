package it.beije.malang;
import java.util.*;
public class Esercizi_uno {
	public static void main(String[] args) {
		
		System.out.println("inserisci la tua frase");
		Scanner v = new Scanner(System.in);
		String valore = v.nextLine();
		StringBuilder prova_val = new StringBuilder(valore);
		System.out.println("inserisci i parametri della sostituzione della parola prima int e poi string...");
		Scanner p = new Scanner(System.in);
		int parametro = p.nextInt();
		Scanner s = new Scanner(System.in);
		String stringa = s.nextLine();
		prova_val.insert(parametro,stringa);
		System.out.println(prova_val);
		System.out.println();
		
		System.out.println("inserisci la tua frase ed essa verrà stampata al contrario");
		Scanner m = new Scanner(System.in);
		String valore_uno = m.nextLine();
		StringBuilder prova_val_uno = new StringBuilder(valore_uno);
		prova_val_uno.reverse();
		System.out.println(prova_val_uno);
		System.out.println();
		
		System.out.println("inserisci la tua frase");
		Scanner h = new Scanner(System.in);
		String valore_due = h.nextLine();
		StringBuilder prova_val_due = new StringBuilder(valore_due);
		System.out.println("inserisci i parametri della cancellazione di caratteri int iniziale e finale(non compreso)");
		Scanner pa = new Scanner(System.in);
		int parametro_uno = pa.nextInt();
		Scanner st = new Scanner(System.in);
		int int_uno = st.nextInt();
		prova_val_due.delete(parametro_uno,int_uno);
		System.out.println(prova_val_due);
		System.out.println();
		
		System.out.println("inserisci la tua frase");
		Scanner k = new Scanner(System.in);
		String valore_tre = k.nextLine();
		StringBuilder prova_val_tre = new StringBuilder(valore_tre);
		System.out.println("inserisci i parametri dell'aggiunta di una parola che andrà alla fine");
		Scanner str = new Scanner(System.in);
		String stringa_tre = str.nextLine();
		prova_val_tre.append(stringa_tre);
		System.out.println(prova_val_tre);
		System.out.println();
		
		
		
	}

}
