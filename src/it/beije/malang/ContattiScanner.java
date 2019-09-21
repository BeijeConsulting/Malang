package it.beije.malang;
import java.io.*;
import java.util.*;
public class ContattiScanner {
	private static Scanner scan;
	private static Scanner m;

	public static void main(String[] args)throws IOException {
		
		FileWriter fileWriter = new FileWriter("C:\\temp\\prova5.txt");
		String firstRow = "\"COGNOME\"\t\"NOME\"\t\"TELEFONO\"\t\"E-MAIL\"\n";
		BufferedWriter writer = new BufferedWriter(fileWriter);
		writer.write(firstRow);//metodo per scrivere nel file
		System.out.println("inserici il numero di contatti da inserire...");
		scan = new Scanner(System.in);
		int numContatti = scan.nextInt();
		while(numContatti>0) {
			m = new Scanner(System.in);
			System.out.println("inserisci il Nome");
			String nome = m.nextLine();
			System.out.println("inserisci il Cognome");
			String cognome = m.nextLine();
			System.out.println("inserisci il Numero");
			String numero = m.nextLine();
			System.out.println("inserisci la E-Mail");
			String email = m.nextLine();
			writer.write(nome + "\t" + cognome + "\t" + numero + "\t" + email + "\n");
		numContatti -= 1;
		}
		writer.close();
		
		
		
	}
}
