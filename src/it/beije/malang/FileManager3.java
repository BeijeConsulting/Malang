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
import java.util.Scanner;

import java.util.StringTokenizer;

public class FileManager3 {
	
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\prova_java_io\\prova.txt");
		System.out.println("il file è presente ? " + f.exists());
		//leggo tutte le righe e le carico in un arraylist di stringhe
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\prova_java_io\\rubrica1.txt"));
		bufferedWriter.write("Rubrica dei contatti\n");
		
		List<Contatto> rows = new ArrayList<Contatto>();
		StringTokenizer tokenizer = null;
		Contatto contatto = null;
		while (bufferedReader.ready()) {
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ",");
			contatto = new Contatto();
			contatto.setNome(tokenizer.nextToken());
			contatto.setCognome(tokenizer.nextToken());
			contatto.setTelefono(tokenizer.nextToken());
			contatto.setEmail(tokenizer.nextToken());
			
			//System.out.println(contatto);
			rows.add(contatto);
		}
		List<Contatto> rows1 = new ArrayList<Contatto>();
		Contatto contatto1;
		Contatto.counter=0;
		for(int i =0; i<rows.size(); i++) {
			contatto1 = new Contatto();
			if(i < rows.size()-1) {
				contatto1.setNome(rows.get(i+1).getNome().toString());
				contatto1.setCognome(rows.get(i).getCognome().toString());
				contatto1.setTelefono(rows.get(i).getTelefono().toString());
				contatto1.setEmail(rows.get(i).getEmail().toString());
			}
			else {
				contatto1.setNome(rows.get(0).getNome().toString());
				contatto1.setCognome(rows.get(i).getCognome().toString());
				contatto1.setTelefono(rows.get(i).getTelefono().toString());
				contatto1.setEmail(rows.get(i).getEmail().toString());	
			}
		bufferedWriter.write(contatto1.toString());
		rows1.add(contatto1);
		System.out.println(rows1.toString());
		}
	bufferedWriter.close();
	
	System.out.println(rows1.get(0).getClass());
	
	BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("C:\\prova_java_io\\rubrica2.txt"));
	bufferedWriter1.write("Rubrica dei contatti\n");
	
	String firstRow ="\"COGNOME\"\t\"NOME\"\t\"COGNOME NOME\"\t\"EMAIL\"\t\"TELEFONO\"\n";// "COGNOME"	"NOME"	"TELEFONO"
	bufferedWriter1.write(firstRow);
	
	for (Contatto cols : rows1) {
		StringBuilder row = new StringBuilder("\"");
		row.append(cols.getCognome()).append('"');
		row.append('\t').append('"');
		row.append(cols.getNome()).append('"');
		row.append('\t').append('"');
		row.append(cols.getCognome()+ " " +cols.getNome()).append('"');
		row.append('\t').append('"');
		row.append(cols.getEmail()).append('"');
		row.append('\t').append('"');
		row.append(cols.getTelefono()).append('"').append('\n');
		
		bufferedWriter1.write(row.toString());
	}

	bufferedWriter1.close();
	
	}
}


