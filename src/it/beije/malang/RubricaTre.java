package it.beije.malang;
import java.util.*;
import java.io.*;

public class RubricaTre {
	
	static Scanner t = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> rows = new ArrayList<String>();
		Contatto contatto = new Contatto();
		String continua = "";
		
		do {
			System.out.print("Inserisci il nome: ");
			contatto.setNome(t.nextLine());
			System.out.print("Inserisci il cognome: ");
			contatto.setCognome(t.nextLine());
			System.out.print("Inserisci l'email: ");
			contatto.setEmail(t.nextLine());
			System.out.print("Inserisci il numero di cellulare: ");
			contatto.setTelefono(t.nextLine());
			rows.add(contatto.toStringTerzaRubrica());
			
			System.out.println("\nDigitare exit o quit per interrompere l'inserimento dei contatti");
			System.out.println("Digitare continua per continuare");
			continua = t.nextLine();
		}while(!continua.equalsIgnoreCase("exit") && !continua.equalsIgnoreCase("quit"));
		
		FileWriter fileWriter = new FileWriter("C:\\temp\\new_rubrica_tre.txt");//C:\temp\new_rubrica.txt
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		String firstRow ="\"COGNOME\"\t\"NOME\"\t\"EMAIL\"\t\"TELEFONO\"\n";// "COGNOME"	"NOME"	"TELEFONO"
		bufferedWriter.write(firstRow);
		
		for(String stringa : rows) {
			String[] cols = stringa.split(",");
			bufferedWriter.write(cols[0]);
			
		}
	
		bufferedWriter.close();
	}

}
