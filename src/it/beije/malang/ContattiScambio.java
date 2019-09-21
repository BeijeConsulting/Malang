package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ContattiScambio {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\temp\\prova7.txt");
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		ArrayList<String[]> rows = new ArrayList<String[]>();
		while(bufferedReader.ready()) {
			String row = bufferedReader.readLine();
			String[] cols = row.split(";");
			rows.add(cols);
		}
		
		bufferedReader.close();
		
		FileWriter fileWriter = new FileWriter("C:\\temp\\prova6.txt");
		String firstRow = "\"COGNOME\"\t\"NOME\"\t\"TELEFONO\"\t\"E-MAIL\"\n";
		BufferedWriter writer = new BufferedWriter(fileWriter);
		writer.write(firstRow);
		
		for(int i = 0; i < rows.size(); i+=2) {
			StringBuilder sb = new StringBuilder();
			String[] row = rows.get(i);
			String[] row2 = rows.get(i + 1);
			
			sb.append("\"" + row[0] + "\" \t");
			sb.append("\"" + row2[1] + "\" \t");
			sb.append("\"" + row[2] + "\" \t");
			sb.append("\"" + row[0] + "@" + row2[1] + "\" \t").append("\n");
			
			sb.append("\"" + row2[0] + "\" \t");
			sb.append("\"" + row[1] + "\" \t");
			sb.append("\"" + row2[2] + "\" \t");
			sb.append("\"" + row2[0] + "@" + row[1] + "\" \t").append("\n");
			
			writer.write(sb.toString());
			
		}
		
		writer.close();
		
		
		
	}
}



