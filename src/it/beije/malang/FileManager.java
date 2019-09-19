package it.beije.malang;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*
;public class FileManager {
	
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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\prova_java_io\\prova.txt");
		System.out.println("il file è presente ? " + f.exists());
		//leggo tutte le righe e le carico in un arraylist di stringhe
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List<String> rowns = new ArrayList<String>();
		while (bufferedReader.ready()) {
			rowns.add(bufferedReader.readLine());
		}
		
		System.out.println("rowns : " + rowns.size());
		System.out.println(rowns);
		
		//leggo e carico tutto in un Arraylist di array di stringhe
		File f1 = new File("C:\\prova_java_io\\prova.txt");
		FileReader fileReader1 = new FileReader(f1);
		BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
		List<String[]> rows = new ArrayList<String[]>();
		while (bufferedReader1.ready()) {
			String row = bufferedReader1.readLine();
			String[] cols = row.split(",");
			System.out.println(Arrays.toString(cols));
			rows.add(cols);
		}
			fileReader1.close();
			System.out.println("rows : " + rows.size());
			System.out.println();
		
	}

}