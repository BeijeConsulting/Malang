package it.beije.malang.database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//crea un oggetto per tenere dentro un singolo numero di telefono e tutte le occorrenze
public class CSVSorter {
	
	public static void main(String [] args) throws IOException {
		
		ArrayList<NumberList> numberlist =new ArrayList<>();
		ArrayList<String> indexList=new ArrayList<>();
		
		BufferedReader reader=new BufferedReader(new FileReader("C:\\prova\\corbosiero1.csv"));
		
		File output=new File("C:\\prova\\sortednums.csv");
		
		if (!output.exists()) {
			System.out.println("Creating File");
			output.createNewFile();
		}
		System.out.println("File Ready");
		
		BufferedWriter writer=new BufferedWriter(new FileWriter(output));
		//consumo la riga indice
		reader.readLine();
		
		while(reader.ready()) {
			String arr[]=reader.readLine().split(";");
			int index;
			if ((index=indexList.indexOf(arr[2]))!=-1) {
				numberlist.get(index).addEmail(arr[3]);
				numberlist.get(index).setName(arr[0]);
				numberlist.get(index).setSurname(arr[1]);
			}
			else
			{
				numberlist.add(new NumberList(arr));
				indexList.add(arr[2]);
			}
		}
		reader.close();
		writer.write("telefono;emails;cognome;nome");
		writer.newLine();
		
		for (NumberList str: numberlist) {
			writer.write(str.toString());
			writer.newLine();
		}
		writer.close();
		
	}
	
}
