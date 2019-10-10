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

public class LetturaCSV {
	
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
///////////////////////////
	public static List<String[]> taglia() throws IOException {
		File f = new File("C:\\temp\\prova.txt");
		File f1 = new File("C:\\temp\\prova1.txt");
		FileReader fileReader = new FileReader(f);
		FileWriter fileWriter = new FileWriter(f1);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		//BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		//leggo e carico tutto in un ArrayList di array di stringhe
				List<String[]> rows = new ArrayList<String[]>();
				while (bufferedReader.ready()) {
					String row = bufferedReader.readLine();
					String[] cols = row.split(","); // spezza la riga del file .txt in colonne
					System.out.println(Arrays.toString(cols));//converte array in stringa
					rows.add(cols);
					
				}
				
//				String firstRow ="\"COGNOME\"\t\"NOME\"\t\"TELEFONO\"\n";// "COGNOME"	"NOME"	"TELEFONO"
//				bufferedWriter.write(firstRow);
//				
//				for (String[] cols : rows) {
//					System.out.println(cols[0]);
//					StringBuilder row = new StringBuilder("\"");
//					row.append(cols[1]).append('"');
//					row.append('\t').append('"');
//					row.append(cols[0]).append('"');
//					row.append('\t').append('"');
//					row.append(cols[2]).append('"').append('\n');
//					
//					bufferedWriter.write(row.toString());
//				}
				
				System.out.println("rows : " + rows.size());
				String[] riga = {};
				//riga = Arrays.deepToString(rows);
				System.out.println("riga : " + riga);
				bufferedReader.close();
				return rows;
	}
//////////////////////////	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\temp\\prova.txt");
		File f1 = new File("C:\\temp\\prova1.txt");
		System.out.println("il file è presente ? " + f.exists());
		
		taglia();
		
		
		
	}

}
