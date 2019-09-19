package it.beije.malang;

import java.io.File;
import java.io.FileReader;

public class FileManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\prova_java_io\\prova.txt");

		System.out.println("il file è presente? " + f.exists());
		System.out.println("il file è può essere letto? " + f.canRead());
		try {
		FileReader reader = new FileReader(f);
		System.out.println(reader.read());
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
