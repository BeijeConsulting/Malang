package it.beije.malang;
import java.io.*;
import java.util.*;



public class RubricaUno {

	public static void main(String[] args) throws IOException {
	
	
	File f = new File("C:\\temp\\prova.txt");
	if(!f.exists()) {
		f.createNewFile();
	}
	FileReader fReader = new FileReader(f);
	BufferedReader bufferedReader = new BufferedReader(fReader);
	FileWriter fWriter = new FileWriter("C:\\temp\\new_rubrica.txt");
	
	List<Contatto> righe = new ArrayList<Contatto>();
	StringTokenizer tokenizer = null;
	Contatto contatto = null;
	BufferedWriter bufferedWriter = new BufferedWriter(fWriter);
	
	String firstRow ="\"COGNOME\"\t\"NOME\"\t\"COGNOME_NOME\"\t\"EMAIL\"\t\"TELEFONO\"\n";
	bufferedWriter.write(firstRow);
	
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
