package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class RubricaDue {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\temp\\prova.txt");
		if(!f.exists()) {
			f.createNewFile();
		}

		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		List<String[]> rows = new ArrayList<String[]>();
		
		while (bufferedReader.ready()) {
			String row = bufferedReader.readLine();
			String[] cols = row.split(";");
			rows.add(cols);
		}
		bufferedReader.close();
		
		FileWriter fileWriter = new FileWriter("C:\\temp\\new_rubrica_due.txt");//C:\temp\new_rubrica.txt
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		String firstRow ="\"COGNOME\"\t\"NOME\"\t\"EMAIL\"\t\"TELEFONO\"\n";
		bufferedWriter.write(firstRow);
		
		
		int j = 0;
		
		for(int i = 0; i < rows.size(); i++)
		{
			StringBuilder row = new StringBuilder("\"");
			String[] switchName; 
			String[] content = rows.get(i);
			
			if(i == rows.size()-1) {
				switchName = rows.get(0);
				row.append(switchName[1]).append('"');
			}
			else if(i == 0) {
				switchName = rows.get(rows.size()-1);
				row.append(switchName[1]).append('"');
			}
			
			
			else {
			switchName = rows.get(j-1);
			row.append(switchName[1]).append('"');
			}	
				row.append('\t').append('"');
				row.append(content[0]).append('"');
				row.append('\t').append('"');
				row.append(content[2]).append('"').append('\n');
				System.out.println(row);
			
				j = i+1;
				bufferedWriter.write(row.toString());

			
			
		}
	
		bufferedWriter.close();

	}
}
