package it.beije.malang.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GeneratoreRandom {
	
	final static String [] domini = {".it",".com",".net"};
	
	public static void main(String[] args) throws IOException {
		
		ArrayList <String> nome = new ArrayList<>();
		ArrayList <String> cognome = new ArrayList<>();
		ArrayList <String> telefono = new ArrayList<>();
		
		File f = new File ("C:\\temp\\generato.txt");
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringTokenizer tokenizer = null;
		while (bufferedReader.ready()) {
			
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
			nome.add(tokenizer.nextToken());
			cognome.add(tokenizer.nextToken());
			telefono.add(tokenizer.nextToken());			
		}
		
		bufferedReader.close();
		
		for (int i=0;i<=10;i++) {
			nome.add("");
			cognome.add("");
			telefono.add("");
		}
		
		File f2 = new File("C:\\temp\\Generato2.txt");
		FileWriter fileWriter = new FileWriter(f2);
		final String FIRST_ROW= "COGNOME;NOME;TELEFONO;EMAIL \n";
		fileWriter.write(FIRST_ROW);
		
		int casuale=0;
		
		
		for (int i=0;i<1000;i++) {
		casuale = (int)(Math.random()*310);
		
		if  (cognome.get(casuale)=="") 
		cognome.set(casuale, "Beije");
		
		fileWriter.write(cognome.get(casuale).toString()+";");
		String cognome1 = cognome.get(casuale);
		
		casuale = (int)(Math.random()*310);
		if (nome.get(casuale)=="")
		nome.set(casuale,cognome1);
		
		fileWriter.write(nome.get(casuale).toString()+";");
		String nome1 = nome.get(casuale);
		
		casuale = (int)(Math.random()*310);
		fileWriter.write(telefono.get(casuale).toString()+";");
		String email=GeneratoreRandom.getEmail(nome1, cognome1);
		fileWriter.write(email+"\n");
		}
		
		fileWriter.close();

	}

	
	public static String getEmail(String nome, String cognome) {
		String email = new String();
		int casuale = (int)(Math.random()*2);
		email = nome + "@" + cognome + domini[casuale];
		return email;
	}

}
