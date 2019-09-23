package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EsCsvJoin {

	public static void main(String[] args) throws IOException{
		ArrayList<File>files=new ArrayList<>();
		files.add(new File("C:\\prova\\copia.csv"));
		files.add(new File("C:\\prova\\copiaes2.csv"));
		File output=new File("C:\\prova\\copiafiles.csv");
		if (!output.exists())
			output.createNewFile();
		FileWriter filewriter=new FileWriter(output);
		BufferedWriter writer=new BufferedWriter(filewriter);
		for (File file:files) {
			FileReader fileReader=new FileReader(file);
			BufferedReader reader=new BufferedReader(fileReader);
			while(reader.ready()) {
				writer.write(reader.readLine());
				writer.newLine();
			}
			reader.close();
		}
		writer.close();
	}

}
