package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Es2Contatto {

	public static void main(String[] args) throws IOException{
		File file=new File("C:\\prova\\prova.csv");
		FileReader fileReader=new FileReader(file);
		BufferedReader reader=new BufferedReader(fileReader);
		ArrayList<Contatto> contatti=new ArrayList<>();
		while (reader.ready()) {
			contatti.add(new Contatto(reader.readLine().split(";")));
		}
		reader.close();
		
		File copia=new File("C:\\prova\\copiaes2.csv");
		if (!copia.exists())
			copia.createNewFile();
		FileWriter fileWriter=new FileWriter(copia);
		BufferedWriter writer=new BufferedWriter(fileWriter);
		String temp;
		ArrayList<Contatto> copy=new ArrayList<>();
		for (Contatto cont:contatti)
		{
			copy.add(new Contatto(cont));
		}
		for (int i=0;i<copy.size();i++)
		{
			if (i==0)
				copy.get(i).setCognome(contatti.get(contatti.size()-1).getCognome());
			else
				copy.get(i).setCognome(contatti.get(i-1).getCognome());
			writer.write(copy.get(i).toString(2));
			writer.newLine();
		}
		writer.close();
		
	}

}
