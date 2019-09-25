//unire due file csv in un terzo file

package it.beije.malang;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class FileUnion {
	
	public static void main(String[] args) throws IOException {
		
		//leggo il primo file
	File f = new File("C:\\temp\\prova.txt");
	FileReader fReader = new FileReader(f);
	BufferedReader bufferedReader = new BufferedReader(fReader);
		//scrivo file
	FileWriter fWriter = new FileWriter("C:\\temp\\unionFile.txt");
	BufferedWriter bufferedWriter = new BufferedWriter(fWriter);
	
	List<Contatto> righe = new ArrayList<Contatto>();
	StringTokenizer tokenizer = null;
	Contatto contatto = null;
	
	while (bufferedReader.ready()) {
		tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
		contatto = new Contatto();
		contatto.setNome(tokenizer.nextToken());
		contatto.setCognome(tokenizer.nextToken());
		contatto.setTelefono(tokenizer.nextToken());
		contatto.setEmail(tokenizer.nextToken());
		
		System.out.println(contatto.toStringRubricaUno());
		bufferedWriter.write("\n" + contatto.toStringRubricaUno());;
	}
	
	 f = new File("C:\\temp\\prova_due.txt");
	fReader = new FileReader(f);
	bufferedReader = new BufferedReader(fReader);
	while (bufferedReader.ready()) {
		tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
		contatto = new Contatto();
		contatto.setNome(tokenizer.nextToken());
		contatto.setCognome(tokenizer.nextToken());
		contatto.setTelefono(tokenizer.nextToken());
		contatto.setEmail(tokenizer.nextToken());
		
		System.out.println(contatto.toStringRubricaUno());
		bufferedWriter.write("\n" + contatto.toStringRubricaUno());;
	}
	
	bufferedWriter.close();
	

}
}
