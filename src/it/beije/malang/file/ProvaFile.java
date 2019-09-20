package it.beije.malang.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;


public class ProvaFile {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\temp\\testo.txt");
		
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		List<Contatto> rows = new ArrayList<Contatto>();
		StringTokenizer tokenizer = null;
		Contatto contatto = null;
		while (bufferedReader.ready()) {
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
			contatto = new Contatto();
			contatto.setNome(tokenizer.nextToken());
			contatto.setCognome(tokenizer.nextToken());
			contatto.setNumero(tokenizer.nextToken());
			contatto.setIndirizzo(tokenizer.nextToken());
			contatto.setCognomeNome();
			
			System.out.println(contatto);
			rows.add(contatto);
		}
		bufferedReader.close();
		
		System.out.println("---------------------------------------------");
		
		List<Contatto> rows2 = new ArrayList<Contatto>();
		for (int i=0; i<rows.size()-1;i++)
		{
				contatto = new Contatto();
				contatto.setNome(rows.get(i).getNome());
				contatto.setCognome(rows.get(i+1).getCognome());
				contatto.setCognomeNome(rows.get(i).getNome(), rows.get(i).getCognome());
				contatto.setNumero(rows.get(i).getNumero());
				contatto.setIndirizzo(rows.get(i).getNome(), rows.get(i+1).getCognome());
				
			rows2.add(contatto);
			System.out.println(contatto);
		}
		
		contatto = new Contatto();
		contatto.setNome(rows.get(rows.size()-1).getNome());
		contatto.setCognome(rows.get(0).getCognome());
		contatto.setCognomeNome(rows.get(rows.size()-1).getNome(), rows.get(rows.size()-1).getCognome());
		contatto.setNumero(rows.get(rows.size()-1).getNumero());
		contatto.setIndirizzo(rows.get(rows.size()-1).getNome(), rows.get(rows.size()-1).getCognome());
		
		rows2.add(contatto);
		System.out.println(contatto);
		
		
	}

}
