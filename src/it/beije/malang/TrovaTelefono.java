package it.beije.malang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TrovaTelefono {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\prova_java_io\\corbosiero1.csv");
		System.out.println("il file è presente ? " + f.exists());
		
		ArrayList<Contatto> rows = new ArrayList<Contatto>();
		
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		FileReader fileReader1 = new FileReader(f);
		BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

		StringTokenizer tokenizer = null;
		Contatto contatto = null;
		
		StringTokenizer tokenizer1 = null;
		Contatto contatto1 = null;
		while (bufferedReader.ready()) {
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
			contatto = new Contatto();
			contatto.setNome(tokenizer.nextToken());
			contatto.setCognome(tokenizer.nextToken());
			contatto.setTelefono(tokenizer.nextToken());
			contatto.setEmail(tokenizer.nextToken());
			
			while (bufferedReader1.ready()) {
				tokenizer1 = new StringTokenizer(bufferedReader.readLine(), ";");
				contatto1 = new Contatto();
				contatto1.setNome(tokenizer1.nextToken());
				contatto1.setCognome(tokenizer1.nextToken());
				contatto1.setTelefono(tokenizer1.nextToken());
				contatto1.setEmail(tokenizer1.nextToken());
					
				if(contatto.getTelefono()==contatto1.getTelefono()) {
					rows.add(contatto1);
				}
				
			}
			
		}
		System.out.println("rows : " + rows.size());
		bufferedReader.close();
		
	}

}
