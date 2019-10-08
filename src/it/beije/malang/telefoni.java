package it.beije.malang;

import java.io.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import com.sun.xml.internal.ws.api.pipe.NextAction;

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

			
			List<String> appoggio = new ArrayList<String>();
			
			for(int i = 0; i < f.length(); i++) {
				String line = bufferedReader.readLine();
			String [] riga = line.split(";");
			String numero = riga[3];
			
//				if() {
//					
//				}
			 }
			
				
				
			
			
			bufferedReader.close();
			bufferedWriter.close();


			}
			
	
	}	

