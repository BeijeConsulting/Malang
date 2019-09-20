package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Es1Contatto {
	public static void main(String [] args) throws IOException{
		File file=new File("C:\\prova\\prova.csv");
		FileReader fileReader=new FileReader(file);
		BufferedReader reader=new BufferedReader(fileReader);
		ArrayList<Contatto> contatti=new ArrayList<>();
		while (reader.ready()) {
			contatti.add(new Contatto(reader.readLine().split(";")));
		}
		reader.close();
		
		File copia=new File("C:\\prova\\copia.csv");
		if (!copia.exists())
			copia.createNewFile();
		FileWriter fileWriter=new FileWriter(copia);
		BufferedWriter writer=new BufferedWriter(fileWriter);
		for (Contatto contatto:contatti)
		{
			writer.write(contatto.toString(1));
			writer.newLine();
		}
		writer.close();
	}
}
