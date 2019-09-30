package it.beije.malang;

import java.io.*;
import java.util.*;

public class GeneratorSimone {
	

	static Random random = new Random();
	
	/*
	 * Metodo getEmail() prende in input nome, cognome e dominio e manda in output la giusta formattazione con '@'
	 */
	static String getEmail(String nome, String cognome, String dominio) {
		return nome + "@" + cognome + "." + dominio;}
	
		public static void main(String[] args) throws IOException {
		String[] dom = {"it", "com", "net"};
		
		String[] randomize= {"a","b","c","d","e","f","g","h","i","l","m","n","o","p","q","r","s","t","u","v","z","1","2","3","4","5","6","7","8","9"};
		
		List<String> nome = new ArrayList<String>();
		List<String> cognome = new ArrayList<String>();
		List<String> telefono = new ArrayList<String>();
		
		/*
		 * Creazione oggetto tipo File per il percorso, oggetto FileReader per ricevere in input il file
		 * e oggetto BufferedReader per manipolarlo.
		 */
		File file1=new File("C:/temp/generato.csv");	
		
		FileReader fileReader = new FileReader(file1);
		BufferedReader bReader = new BufferedReader(fileReader);
		
		/*
		 * Oggetto di tipo FileWriter per scrivere in output e BufferedWriter per come scriverlo.
		 */
		FileWriter fileWriter = new FileWriter("C:/temp/5milioni.csv");
		BufferedWriter bWriter = new BufferedWriter(fileWriter);
		

		
		
		String PRIMARIGA ="COGNOME;NOME;TELEFONO;EMAIL;RANDOMICO\n"; // Prima stringa del CSV per migliorare la leggibilità
		bWriter.write(PRIMARIGA); // scrivi PRIMARIGA
		
		StringTokenizer tokenizer = null; // I token sarebbe una porzione di testo alfanumerico
		
		/*
		 * Siamo in lettura del file 'generato.csv'
		 */
		while (bReader.ready()) { // ready() per verificare che ci sia qualcosa da leggere nell'oggetto
			tokenizer = new StringTokenizer(bReader.readLine(), ";"); // Il metodo StringTokenizer permette di delimitare da un punto di una stringa fino al delimitatore
			nome.add(tokenizer.nextToken()); 
			cognome.add(tokenizer.nextToken());
			telefono.add(tokenizer.nextToken());
		}
		
		/*
		 * Aggiungi all'ArrayList dieci stringhe vuote alla fine per ogni campo.
		 */
		for(int i = 0; i < 10; i++) {
			nome.add("");
			cognome.add("");
			telefono.add("");
		}	
		
		bReader.close();


		for(int i = 0; i < 100; i++) {
			StringBuilder riga = new StringBuilder("");
			
			/*
			 * Assegna valori pseudocasuali a variabili di interi con il metodo 'nextInt' che corrisponde ad un indice di lunghezza massima 'array.size()'
			 */
			int nomeRandom = random.nextInt(nome.size());
			int cognomeRandom = random.nextInt(cognome.size());
			int telefonoRandom = random.nextInt(telefono.size());
			int dominio = random.nextInt(3);
			
			
			
			
			String cog;
			String nom;

			
			
			if(!cognome.get(cognomeRandom).equals(""))	// se il campo non è vuoto prende un cognome random
				cog=cognome.get(cognomeRandom);
			
			else 
				cog= "beije"; // altrimenti il cognome sarà 'beije'
			
			if(!nome.get(nomeRandom).equals("")) { // stessa situazione ma con il nome
				nom = nome.get(nomeRandom);
			}else {
				nom = cog; // altrimenti prende il nome sarà uguale al cognome
			}
			
			/*
			 * Usa il metodo append() per concatenare i vari campi iniziando dal cognome
			 */
			riga.append(cognome.get(cognomeRandom));
			riga.append(";").append(nome.get(nomeRandom)); // usa il punto e virgola come splitter
			riga.append(";").append(telefono.get(telefonoRandom)).append(";");
			riga.append(getEmail(nom,cog, dom[dominio])).append(";"); // la mail viene generata utilizzando questa codifica: 'nome@cognome.dominio'
			
			/*
			 * Crea un identificatore 'RANDOMICO' con sequenze alfanumeriche casuali
			 */
			for(int j=0;j<10;j++) {
			riga.append(randomize[random.nextInt(30)]);
			}
			riga.append("\n");
			
			bWriter.write(riga.toString());
		}
			
				
		bWriter.close();
		}

	}
	

