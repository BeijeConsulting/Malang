package it.beije.malang.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class GeneratoreRandomDue {
	
	
	public static void main(String[] args) throws IOException {
		HashMap<String,Record> mappa = new HashMap<String,Record>();
		
		

		File f = new File ("C:\\temp\\Generato2.csv");
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while (bufferedReader.ready()) {
			String arr[]=bufferedReader.readLine().split(";");
			if (!mappa.containsKey(arr[3]))
			{
			Record r = new Record();
			r.cognome=arr[1];
			r.nome=arr[0];
			r.addEmail(arr[2]);
			mappa.put(arr[3], r);
			}
			else
			{
			mappa.get(arr[3]).addEmail(arr[2]);
			mappa.get(arr[3]).nome=arr[0];
			mappa.get(arr[3]).cognome=arr[1];
			}
		}
		
		
		bufferedReader.close();

		File f2 = new File("C:\\temp\\Generato3.csv");
		FileWriter fileWriter = new FileWriter(f2);
		final String FIRST_ROW= "TELEFONO;COGNOME;NOME;EMAIL \n";
		fileWriter.write(FIRST_ROW);
		
		
		for(HashMap.Entry<String, Record> entry : mappa.entrySet()) {
		    String key = entry.getKey();
		    Record value = entry.getValue();
		    
		    fileWriter.write(key + ";" + value.nome + ";" + value.cognome + ";" + value.allMail() + "\n \n");

		
		}
		
		fileWriter.close();

	}

}