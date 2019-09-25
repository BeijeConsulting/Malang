package it.beije.malang.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InversioneFile {

	public static void main(String[] args) throws IOException {
		File f2 = new File("C:\\temp\\testo5.txt");
		
		FileReader fileReader = new FileReader(f2);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		FileWriter fileWriter = new FileWriter("C:\\temp\\testo6.txt");
		
		List<String> rows = new ArrayList<String>();
		while (bufferedReader.ready()) {
		rows.add(bufferedReader.readLine());
		}
		
		for (int i=rows.size();i>0;i--)
		{
				String appoggio=rows.get(i-1).substring(0);
				StringBuilder appoggio2 = new StringBuilder(appoggio);
				appoggio2.reverse();
				fileWriter.write(appoggio2.toString() + " \n");
		}
		
		bufferedReader.close();
		fileWriter.close();


	}

}
