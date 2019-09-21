package it.beije.malang;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class EseContatti {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\temp\\prova.txt");
		FileReader fileReader = new FileReader(f);
		/*while(fileReader.ready()) {
			System.out.print((char)fileReader.read());
		}*/ //serve per leggere dentro il file
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		while(bufferedReader.ready()) {
		/*	System.out.println(bufferedReader.readLine());
		}*/
		
		ArrayList<String[]> rows = new ArrayList<String[]>();
		while(bufferedReader.ready()) {
			String row = bufferedReader.readLine();
			String[] cols = row.split(";");
			//System.out.println(Arrays.toString(cols));
			rows.add(cols);
		}
		bufferedReader.close();
		
		FileWriter fileWriter = new FileWriter("C:\\temp\\prova2.txt");
		String firstRow = "\"COGNOME\"\t\"NOME\"\t\"TELEFONO\"\t\"E-MAIL\"\n";
		BufferedWriter writer = new BufferedWriter(fileWriter);
		writer.write(firstRow);
		for(String[] row : rows) {
			
			StringBuilder sb = new StringBuilder("\"");
			sb.append(row[1]).append('"');
			sb.append('\t').append('"');
			sb.append(row[0]).append('"');
			sb.append('\t').append('"');
			sb.append(row[2]).append('"');
			sb.append('\t').append('"').append('\n');
			writer.write(sb.toString());
		
		}
		writer.close();
		
		
		
	}
}
