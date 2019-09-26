package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class JoinCsvAndFix {

	public static void main(String[] args) throws IOException{

		File file1=new File("C:\\prova\\file1.csv");
		FileReader filereader=new FileReader(file1);
		BufferedReader reader=new BufferedReader(filereader);

		ArrayList<Contatto> contatti = new ArrayList<>();

		while(reader.ready()) {
			String []arr=reader.readLine().split(";");
			contatti.add( new Contatto(arr[0],arr[1],arr[3],arr[2]));
		}

		reader.close();

		File file2=new File("C:\\prova\\file2.csv");
		FileReader filereader2 = new FileReader(file2);
		reader=new BufferedReader(filereader2);
		
		while(reader.ready()) {
			String []arr=reader.readLine().split(";");
			contatti.add(new Contatto(arr[2],arr[1],arr[3],arr[0]));
		}

		reader.close();

		File output=new File("C:\\prova\\outputes4.csv");
		if (!output.exists())
		{
			output.createNewFile();
		}
		FileWriter filewriter=new FileWriter(output);
		BufferedWriter writer=new BufferedWriter(filewriter);

		Collections.sort(contatti);

		for (Contatto contatto:contatti) {
			writer.write(contatto.toString());
			writer.newLine();
		}
		writer.close();

	}

}