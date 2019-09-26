package it.beije.malang.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import it.beije.malang.file.Contatto;

public class FusioneFileMischiati {
	


	public static void main(String[] args) throws IOException {
		File f2 = new File("C:\\temp\\fusione1.txt");
		File f3 = new File("C:\\temp\\fusione2.txt");
		
		FileReader fileReader = new FileReader(f2);
		FileReader fileReader2 = new FileReader(f3);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
		
		FileWriter fileWriter = new FileWriter("C:\\temp\\fusione3.txt");
		
		List<Contatto> rows = new ArrayList<Contatto>();
		StringTokenizer tokenizer = null;
		Contatto contatto = null;
		while (bufferedReader.ready()) {
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
			contatto = new Contatto();
			contatto.setNome(tokenizer.nextToken());
			contatto.setCognome(tokenizer.nextToken());
			contatto.setIndirizzo(tokenizer.nextToken());
			contatto.setNumero(tokenizer.nextToken());
			contatto.setCognomeNome();
			rows.add(contatto);
			fileWriter.write(contatto.toString());
		}
		
		List<Contatto> rows2 = new ArrayList<Contatto>();
		StringTokenizer tokenizer2 = null;
		Contatto contatto2 = null;
		while (bufferedReader2.ready()) {
			tokenizer2 = new StringTokenizer(bufferedReader2.readLine(), ";");
			contatto2 = new Contatto();
			contatto2.setIndirizzo(tokenizer2.nextToken());
			contatto2.setCognome(tokenizer2.nextToken());
			contatto2.setNome(tokenizer2.nextToken());
			contatto2.setNumero(tokenizer2.nextToken());
			contatto2.setCognomeNome();
			rows2.add(contatto2);
			fileWriter.write(contatto2.toString());
		}
		
		bufferedReader.close();
		bufferedReader2.close();
		fileWriter.close();

}
}