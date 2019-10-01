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

public class CreaMailDaFile {
	
	static StringBuilder mail;
	
	public static String CreaMail() throws IOException {
		
		
		
		File f = new File("C:\\temp\\rubrica.txt");
		System.out.println("il file è presente ? " + f.exists());
		
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);


		//leggo e carico tutto in un ArrayList di array di stringhe
		List<String[]> rows = new ArrayList<String[]>();
		while (bufferedReader.ready()) {
			String row = bufferedReader.readLine();
			String[] cols = row.split("; ");
			System.out.println(Arrays.toString(cols));
			rows.add(cols);
		}
		System.out.println("rows : " + rows.size());
		bufferedReader.close();
		
		FileWriter fileWriter = new FileWriter("C:\\temp\\new_rubrica.txt");//C:\temp\new_rubrica.txt
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		String firstRow ="\"COGNOME\"\t\"NOME\"\t\"TELEFONO\"\n";// "COGNOME"	"NOME"	"TELEFONO"
		bufferedWriter.write(firstRow);
	
		for (String[] cols : rows) {
			StringBuilder row = new StringBuilder("\"");

			//ho creato io la mail con nome@cognome.it			
		mail = row.append(cols[0]).append("@").append(cols[1]).append(".it").append("\n");  
		}
		return mail.toString();
		}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(CreaMailDaFile.CreaMail());
	}
}