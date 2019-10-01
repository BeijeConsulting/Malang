package it.beije.malang;


import java.io.File;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Random;

	public class telefoni {
		
	
		
		public static void main(String[] args) throws IOException {
			
			telefoni.telefono("C:\\temp\\telef.csv");
			
		}
		
		public static void telefono(String percorso) throws IOException{

			FileWriter fileWriter = new FileWriter(percorso); //C:\temp\new_rubrica.txt
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


			File f = new File("C:\\temp\\Donatellis2.csv");
			System.out.println("il file è presente ? " + f.exists());

			FileReader fileReader = new FileReader(f);
			BufferedReader bufferedReader = new BufferedReader(fileReader);


			//leggo e carico tutto in un ArrayList di array di stringhe
			List<String[]> rows = new ArrayList<String[]>();
			while (bufferedReader.ready()) {
				String row = bufferedReader.readLine();
				String[] cols = row.split(";");
				//System.out.println(Arrays.toString(cols));
				rows.add(cols);
			}
			//System.out.println("rows : " + rows.size());
			bufferedReader.close();



			for (String[] cols : rows) {
				StringBuilder row = new StringBuilder("\"");
				row.append(cols[2]).append('"').append("\n");
				
				bufferedWriter.write(row.toString());
			}
			bufferedWriter.close();
			}
	}		
	
		

