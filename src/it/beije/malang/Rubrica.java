import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Rubrica {
static Scanner s;
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("C:\\Users\\Padawan12\\Desktop\\test2.txt");
		String firstRow = "Nome\tCognome\tCellulare\n";
		BufferedWriter writer = new BufferedWriter(fileWriter);
		writer.write(firstRow);
		s = new Scanner(System.in);
		System.out.println("Quanti contatti vuoi aggiungere?");
		int loop = s.nextInt();

		while(loop > 0) {
		System.out.println("Inserisci Nome");
		String nome = s.next();
		System.out.println("Inserisci Cognome");
		String cognome = s.next();
		System.out.println("Inserisci Numero Cellulare");
		String cellulare = s.next();
		writer.write(nome+"\t"+cognome+"\t"+cellulare+"\n");
		
		loop-=1;
		}
		writer.close();
		
	}
}
