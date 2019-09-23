package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EsReverse {

	public static void main(String[] args) throws IOException{
		File file=new File("C:\\prova\\prova.txt");
		File reversefile=new File("C:\\prova\\reverse.txt");
		if (!reversefile.exists()) {
			reversefile.createNewFile();
		}
		FileWriter filewriter=new FileWriter(reversefile);
		BufferedWriter writer=new BufferedWriter(filewriter);
		ArrayList<String> rows=new ArrayList<>();
		FileReader fileReader=new FileReader(file);
		BufferedReader reader=new BufferedReader(fileReader);
		while(reader.ready()) {
			rows.add(reader.readLine());
		}
		reader.close();
		for (int i=rows.size()-1;i>-1;i--) {
			writer.write(rows.get(i));
			writer.newLine();
		}
		writer.close();
		
		reversefile=new File("C:\\prova\\reversechars.txt");
		if (!reversefile.exists()) {
			reversefile.createNewFile();
		}
		fileReader=new FileReader(file);
		reader=new BufferedReader(fileReader);
		filewriter=new FileWriter(reversefile);
		writer=new BufferedWriter(filewriter);
		
		while(reader.ready()) {
			writer.write(new StringBuilder(reader.readLine()).reverse().toString());
			writer.newLine();
		}
		writer.close();
		reader.close();
		
	}

}
