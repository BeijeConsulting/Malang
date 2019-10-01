package it.beije.malang.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class GeneratoreRandomDue {
	
	
	public static void main(String[] args) throws IOException {
		
		ArrayList <String> nome = new ArrayList<>();
		ArrayList <String> cognome = new ArrayList<>();
		ArrayList <String> telefono = new ArrayList<>();
		ArrayList <String> indirizzo = new ArrayList<>();
		
		File f = new File ("C:\\temp\\Generato2.csv");
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringTokenizer tokenizer = null;
		while (bufferedReader.ready()) {
			
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
			cognome.add(tokenizer.nextToken());
			nome.add(tokenizer.nextToken());
			telefono.add(tokenizer.nextToken());
			indirizzo.add(tokenizer.nextToken());
			
		}
		
		
		bufferedReader.close();

		for (int i=0;i<telefono.size();i++)
		{
			for (int j=i+1;j<telefono.size();j++)
			{
			if (telefono.get(i).equals(telefono.get(j)))
			{
				indirizzo.set(i,indirizzo.get(i).concat("|").concat(indirizzo.get(j)));
				nome.set(i, nome.get(j));
				cognome.set(i, cognome.get(j));
				 
				nome.remove(j);
				cognome.remove(j);
				 
				telefono.remove(j);
			}
			else
			{
				telefono.set(j, telefono.get(j));
				indirizzo.set(j,indirizzo.get(j));
				nome.set(j, nome.get(j));
				cognome.set(j, cognome.get(j));
				 
			}
			}
		}
		
		File f2 = new File("C:\\temp\\Generato3.csv");
		FileWriter fileWriter = new FileWriter(f2);
		final String FIRST_ROW= "TELEFONO;COGNOME;NOME;EMAIL;RANDOM \n";
		fileWriter.write(FIRST_ROW);
		
		
		for (int i=0;i<telefono.size();i++) {
		
		fileWriter.write(telefono.get(i).toString()+";");
		fileWriter.write(cognome.get(i).toString()+";");
		fileWriter.write(nome.get(i).toString()+";");
		fileWriter.write(indirizzo.get(i)+"\n");
		 

		
		}
		
		fileWriter.close();

	}

}