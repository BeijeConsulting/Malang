package it.beije.malang.database;
import java.io.File;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

import java.util.List;
import java.util.StringTokenizer;
import java.util.Random;

	public class RandomName {
		
	
		
		public static void main(String[] args) throws IOException {
			
			
			
			File f = new File("C:\\temp\\generato.csv");
			System.out.println("il file è presente ? " + f.exists());
			
			FileReader fileReader = new FileReader(f);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			StringTokenizer tokenizer = null;
	
			List<String> dominio = new ArrayList<String>();
			dominio.add(".it");
			dominio.add(".com");
			dominio.add(".net");
			
				
			List<String> nomi = new ArrayList<String>();
			List<String> cognomi = new ArrayList<String>();
			List<String> telefoni = new ArrayList<String>();
			
			//leggo e carico tutto in un ArrayList di array di stringhe
			
			
//			System.out.println("size : " + nomi.size());
			
			while (bufferedReader.ready()) {
				
				tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
				
				String nome = (tokenizer.nextToken());
				String cognome = (tokenizer.nextToken());
				String telefono = (tokenizer.nextToken());
				
				nomi.add(nome);
				cognomi.add(cognome);
				telefoni.add(telefono);
				
			}
			

//			System.out.println(nomi);
//			System.out.println(cognomi);
//			System.out.println(telefoni);
			bufferedReader.close();
			

//			
//			String rnome = nomi.get(d);
//			String rcognome = cognomi.get(d);
//			String rtelefono = telefoni.get(d);
//			String rdominio = dominio.get(a);
////			System.out.println("dim dominio :" + dimensionedom);
//			String mail = rnome + "@" + rcognome + rdominio;
			
 
			for(int i = 0; i < 10; i++ ) {
				nomi.add("");
				cognomi.add("");
				telefoni.add("");
			}
			
			Random generator = new Random();
			int dimensione = nomi.size();
			int dimensionedom = dominio.size();
//			int d = generator.nextInt(dimensione);
//			int a = generator.nextInt(dimensionedom);
			
			
			
			
//			System.out.println("size arraylist con spazzi: " + nomi.size());
			
			
			
//			System.out.println(rnome);
//			System.out.println(rcognome);
//			System.out.println(rtelefono);
//			System.out.println(mail);
//			System.out.println("size arraylist: " + nomi.size());
		     
			FileWriter fileWriter = new FileWriter("C:\\temp\\casuali.csv"); //C:\temp\new_rubrica.txt
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			String firstRow ="\"COGNOME\"\t\"NOME\"\t\"MAIL\"\t\"TELEFONO\"\t\"STRINGA CASUALE\"\n";// "COGNOME"	"NOME"	"TELEFONO"
			bufferedWriter.write(firstRow);
			
			
			StringBuilder stringa = null;
			StringBuilder caratteri = null;
			
			for(int index=0 ; index < 1_000 ; index++ ) {
				
				stringa = new StringBuilder();
				caratteri = new StringBuilder();
				
				for(int i = 0; i < 10; i++ ) {
					char carat = (char) ((int)(Math.random() * 255000 + 1) % 255);
					//System.out.println(carat);
					caratteri.append(carat);
				}
				//System.out.println(caratteri);
				
				int d = generator.nextInt(dimensione);
				int a = generator.nextInt(dimensionedom);
				int n = generator.nextInt(dimensione);
				int s = generator.nextInt(dimensione);
				
				String rnome = nomi.get(n);
				String rcognome = cognomi.get(d);
				String rtelefono = telefoni.get(s);
				String rdominio = dominio.get(a);
//				System.out.println("dim dominio :" + dimensionedom);
				
				stringa.append(rcognome).append(";").append(rnome).append(";");

				
				if(rcognome.equals("")) {
					rcognome = "beije";
					
//					System.out.println("senza cognome");
				}
				if(rnome.equals("")) {
					rnome = rcognome;
//					System.out.println("senza nome");
				}
				
				String mail = rnome + "@" + rcognome + rdominio;
				stringa.append(mail).append(";").append(rtelefono).append(";").append(caratteri).append("\n");
				
//				System.out.println("culo " + rcognome.contains("beije"));
				bufferedWriter.write(stringa.toString());
//				System.out.println(stringa.toString());
			}
			
			bufferedWriter.close();
			
		}
	}		
	
		

