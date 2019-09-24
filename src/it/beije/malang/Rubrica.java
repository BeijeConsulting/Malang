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

public class Rubrica {
	
	public static void main(String[] args) throws Exception{

		File f = new File("C:\\temp\\rubrica.txt");
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

//		List<Contatto> rows = new ArrayList<Contatto>();
//		StringTokenizer tokenizer = null;
//		Contatto contatto = null;
//		while (bufferedReader.ready()) {
//			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
//			contatto = new Contatto();
//			contatto.setNome(tokenizer.nextToken());
//			contatto.setCognome(tokenizer.nextToken());
//			contatto.setTelefono(tokenizer.nextToken());
//			contatto.setEmail(tokenizer.nextToken());
//			
//			System.out.println(contatto);
//			rows.add(contatto);
//		} 
//		System.out.println("rows : " + rows.size());
//		bufferedReader.close();
//
		Rubrica.trasferisciColonne();	
		
	}
	
	public static void trasferisciColonne() throws IOException {
		File f = new File("C:\\temp\\rubrica.txt");
		System.out.println("il file è presente ? " + f.exists());
		
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);


		//leggo e carico tutto in un ArrayList di array di stringhe
		List<String[]> rows = new ArrayList<String[]>();
		while (bufferedReader.ready()) {
			String row = bufferedReader.readLine();
			String[] cols = row.split(";");
			System.out.println(Arrays.toString(cols));
			rows.add(cols);
		}
		System.out.println("rows : " + rows.size());
		bufferedReader.close();
		
		FileWriter fileWriter = new FileWriter("C:\\temp\\new_rubrica.txt");//C:\temp\new_rubrica.txt
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		String firstRow ="\"COGNOME\"\"NOME\"\t\"TELEFONO\"\"mail\n";// "COGNOME"	"NOME"	"TELEFONO"
		bufferedWriter.write(firstRow);
		
		for (String[] cols : rows) {
			StringBuilder row = new StringBuilder("\"");
			row.append(cols[1]).append('"');
			row.append('\t').append('"');
			row.append(cols[0]).append('"');
			row.append('\t').append('"');
			row.append(cols[2]).append('"');
			row.append('\t').append('"');
			row.append(cols[3]).append('"').append('\n');
			
			bufferedWriter.write(row.toString());
		}
		
		bufferedWriter.close();

	}
}