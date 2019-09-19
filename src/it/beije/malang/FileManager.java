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
import java.util.*;

import java.util.StringTokenizer;

public class FileManager {
	
	public static void copiaFile(String pathOrig, String pathCopia) throws IOException {
		File orig = new File(pathOrig);
		File copia = new File(pathCopia);
		copiaFile(orig, copia);
	}
	
	public static void copiaFile(File orig, File copia) throws IOException {
		if (orig.exists()) {
			FileReader fileReader = new FileReader(orig);
			FileWriter fileWriter = new FileWriter(copia);
			while (fileReader.ready()) {
				fileWriter.write((char)fileReader.read());
			}
			
			fileReader.close();
			fileWriter.close();
		} else {
			System.out.println("il path del file origine è errato");
		}
	}
	
	public static void trasferisciColonne() throws IOException {
		File f = new File("C:\\temp\\prova.txt");
		System.out.println("il file è presente ? " + f.exists());
		
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

//		//leggo e carico tutto in un ArrayList di stringhe
//		List<String> rows = new ArrayList<String>();
//		while (bufferedReader.ready()) {
//			rows.add(bufferedReader.readLine());
//		}
//		System.out.println("rows : " + rows.size());
//		System.out.println(rows);

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
		
		String firstRow ="\"COGNOME\"\t\"NOME\"\t\"TELEFONO\"\n";// "COGNOME"	"NOME"	"TELEFONO"
		bufferedWriter.write(firstRow);
		
		for (String[] cols : rows) {
			StringBuilder row = new StringBuilder("\"");
			row.append(cols[1]).append('"');
			row.append('\t').append('"');
			row.append(cols[0]).append('"');
			row.append('\t').append('"');
			row.append(cols[2]).append('"').append('\n');
			
			bufferedWriter.write(row.toString());
		}
		
		bufferedWriter.close();

	}

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\prova_java_io\\prova.txt");
		System.out.println("il file è presente ? " + f.exists());
		//leggo tutte le righe e le carico in un arraylist di stringhe
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List<String> rowns = new ArrayList<String>();

		List<Contatto> rows = new ArrayList<Contatto>();
		StringTokenizer tokenizer = null;
		Contatto contatto = null;
		while (bufferedReader.ready()) {
			rowns.add(bufferedReader.readLine());
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
			contatto = new Contatto();
			contatto.setNome(tokenizer.nextToken());
			contatto.setCognome(tokenizer.nextToken());
			contatto.setTelefono(tokenizer.nextToken());
			contatto.setEmail(tokenizer.nextToken());
			
			System.out.println(contatto);
			rows.add(contatto);
		}
		
		System.out.println("rowns : " + rowns.size());
		System.out.println(rowns);
		
		//leggo e carico tutto in un Arraylist di array di stringhe
		File f1 = new File("C:\\prova_java_io\\prova.txt");
		FileReader fileReader1 = new FileReader(f1);
		BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
		List<String[]> rows1 = new ArrayList<String[]>();
		while (bufferedReader1.ready()) {
			String row = bufferedReader1.readLine();
			String[] cols = row.split(",");
			System.out.println(Arrays.toString(cols));
			rows1.add(cols);
		}
			fileReader1.close();
			System.out.println("rows : " + rows.size());
			System.out.println();
		System.out.println("rows : " + rows.size());
		bufferedReader.close();
		
//		FileWriter fileWriter = new FileWriter("C:\\temp\\new_rubrica.txt");//C:\temp\new_rubrica.txt
//		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//		
//		String firstRow ="\"COGNOME\"\t\"NOME\"\t\"TELEFONO\"\n";// "COGNOME"	"NOME"	"TELEFONO"
//		bufferedWriter.write(firstRow);
//		
//		for (String[] cols : rows) {
//			StringBuilder row = new StringBuilder("\"");
//			row.append(cols[1]).append('"');
//			row.append('\t').append('"');
//			row.append(cols[0]).append('"');
//			row.append('\t').append('"');
//			row.append(cols[2]).append('"').append('\n');
//			
//			bufferedWriter.write(row.toString());
//		}
//		
//		bufferedWriter.close();
//
	}

}