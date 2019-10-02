package it.beije.malang.database;


	

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.ByteArrayInputStream;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
import java.util.Random;
import java.util.Scanner;

	public class CsvContatti {
		
		public static void main(String[] args) throws Exception {
			File f = new File("C:\\temp\\generato.csv");
			File f1 = new File("C:\\temp\\generatoNome.csv");
			/************Chiamate ai metodi******************/
			//elencoNome(); 
//			elencoCognome();
//			elencoTelefono();
			//casuale();
		}
		
		/*********************Metodo per l'elenco dei nomi**********************************/
		public static void elencoNome() throws IOException {
			
			File f = new File("C:\\temp\\generato.csv");
			File f1 = new File("C:\\temp\\generatoNome.csv");
			FileReader fileReader = new FileReader(f);
			FileWriter fileWriter = new FileWriter(f1);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			//legge e carica tutto in un ArrayList di array di stringhe
					List<String[]> rows = new ArrayList<String[]>();
					while (bufferedReader.ready()) {
						String row = bufferedReader.readLine();
						String[] cols = row.split(";"); // spezza la riga del file .txt in colonne
						rows.add(cols);
						
					}
					// scrive sul file generatoNome.csv i valori della prima colonna del file generato.csv
					for (String[] cols : rows) {
						StringBuilder row = new StringBuilder("\"");// crea gli apici
						row.append(cols[0]).append('"').append('\n');//append('\n') per andare a capo
						
						bufferedWriter.write(row.toString());
					}
					//aggiunge 10 nuove righe vuote
					for (int i = 0; i<10; i++) {
						bufferedWriter.write("\"\t");
						bufferedWriter.write("\"\t");
						bufferedWriter.newLine();
					}
					bufferedWriter.close();
		}
		/*************************Metodo per l'elenco dei cognomi *****************************/
		public static void elencoCognome() throws IOException {
			
			File f = new File("C:\\temp\\generato.csv");
			File f1 = new File("C:\\temp\\generatoCognome.csv");
			FileReader fileReader = new FileReader(f);
			FileWriter fileWriter = new FileWriter(f1);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			//legge e carice tutto in un ArrayList di array di stringhe
					List<String[]> rows = new ArrayList<String[]>();
					while (bufferedReader.ready()) {
						String row = bufferedReader.readLine();
						String[] cols = row.split(";"); // spezza la riga del file .txt in colonne
						rows.add(cols);
					}
					// scrive sul file generatoCognome.csv i valori della seconda colonna del file generato.csv
					for (String[] cols : rows) {
						StringBuilder row = new StringBuilder("\"");// crea gli apici
						row.append(cols[1]).append('"').append('\n');//append('\n') per andare a capo
						bufferedWriter.write(row.toString());
						
					}
					//aggiunge 10 nuove righe vuote
					for (int i = 0; i<10; i++) {
						bufferedWriter.write("\"\t");
						bufferedWriter.write("\"\t");
						bufferedWriter.newLine();
					}
					bufferedWriter.close();
		}
		/*************************Elenco dei numeri di telefono***********************************/
		public static void elencoTelefono() throws IOException {
			
			File f = new File("C:\\temp\\generato.csv");
			File f1 = new File("C:\\temp\\generatoTelefono.csv");
			FileReader fileReader = new FileReader(f);
			FileWriter fileWriter = new FileWriter(f1);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			//legge e carice tutto in un ArrayList di array di stringhe
					List<String[]> rows = new ArrayList<String[]>();
					while (bufferedReader.ready()) {
						String row = bufferedReader.readLine();
						String[] cols = row.split(";"); // spezza la riga del file .txt in colonne
						rows.add(cols);
						
					}
					// scrive sul file generatoTelefono.csv i valori della terza colonna del file generato.csv
					for (String[] cols : rows) {
						StringBuilder row = new StringBuilder("\""); // crea gli apici
						row.append(cols[2]).append('"').append('\n'); //append('\n') per andare a capo
						bufferedWriter.write(row.toString());
						
					}
					//aggiunge 10 nuove righe vuote
					for (int i = 0; i<10; i++) {
						bufferedWriter.write("\"\t");
						bufferedWriter.write("\"\t");
						bufferedWriter.newLine();
					}
					
					bufferedWriter.close();
		}
		
		
		/***********************Metodo per la generazione casuale**********************************/
		
		String[] domini = new String[] {"it","com", "net"};
		
		public static void casuale () throws IOException {
			RandomAccessFile file = new RandomAccessFile("C:\\temp\\generato.csv", "r");
			String str;
			while((str = file.readLine())!= null){
				System.out.println(str);
			}file.close();
				
			}
		
		///////////esempio internet
		
		public void casuale1() {
//			File f = new File("C:\\temp\\generato.csv");
//			File f1 = new File("C:\\temp\\generatoTelefono.csv");
//			FileReader fileReader = new FileReader(f);
//			FileWriter fileWriter = new FileWriter(f1);
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			 int c=0;
//			//legge e carice tutto in un ArrayList di array di stringhe
//					List<String[]> rows = new ArrayList<String[]>();
//					while (bufferedReader.ready()) {
//						String row = ((Scanner) bufferedReader).nextLine();
//						String[] cols = row.split(";"); // spezza la riga del file .txt in colonne
//						rows.add(cols);
//						
//					}
			File files = new File("C:\\temp\\generato.csv");
	       
	            Scanner scanner = new Scanner(files);
	            while (scanner.hasNextLine()) {
	                String l = scanner.nextLine();
	                c++;
	        Random random = new Random();
	        int r = random.nextInt(c);
	        System.out.println(c);
		}
		
		/**********new RandomFileContentGenerator("
		 * large.txt", 10000000).generate(); ---> genera un nuovo file casuale**********/
		/*private static File root = new File("./data");
		private final String fileName;
		private final int lines;
		RandomFileContentGenerator(String fileName, int lineCount) {
			this.fileName = fileName;
			this.lines = lineCount;
		}
		void generate() throws IOException {
			Path fullPath = new File(root, fileName).toPath();
			// make sure file exists
			Files.createDirectories(fullPath.getParent());
			RandomNameGenerator rng = new RandomNameGenerator(0);
			try (BufferedWriter bw = Files.newBufferedWriter(fullPath)) {
				for (int i = 0; i < lines; ++i) {
					String line = String.format("%s %s%n", rng.next(), rng.next());
					bw.write(line);
				}
			}
			}*/
		
		
	
}
