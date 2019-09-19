package it.beije.malang;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\temp\\prova.txt");
		System.out.println("il file è presente ? " + f.exists());
		
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List<String> rows = new ArrayList<String>();
		while (bufferedReader.ready()) {
			rows.add(bufferedReader.readLine());
		}
		
		System.out.println("rows : " + rows.size());
		System.out.println(rows);
		
	}

}
