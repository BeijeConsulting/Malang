package it.beije.malang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class provaFile {

	public static void main(String[] args) throws IOException{
		File file=new File("C:\\prova\\prova.csv");
		FileReader filereader=new FileReader(file);
		BufferedReader reader=new BufferedReader(filereader);
		ArrayList<Contatto> contatti=new ArrayList<>();
		while(reader.ready()) {
			String line=reader.readLine();
			String [] arr=line.split(";");
			contatti.add(new Contatto(arr));
		}
	}

}
