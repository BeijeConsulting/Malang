package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class ContactShake {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\temp\\new_generate_uno.csv");
		
		FileReader fReader = new FileReader(f);
		BufferedReader bReader = new BufferedReader(fReader);
		
		
		List<String> telefoni = new ArrayList<String>();
		List<String> mail = new ArrayList<String>();
		
		List<String[]> rows = new ArrayList<String[]>();
		
		
		while (bReader.ready()) {
			String row = bReader.readLine();
			String[] cols = row.split(";");
			rows.add(cols);
		}
		bReader.close();

		for(String[] cols : rows) {
			telefoni.add(cols[2]);
			mail.add(cols[3]);
		}
		
		
		File fW = new File("C:\\temp\\fileShake.csv");
		FileWriter fileWriter = new FileWriter(fW);
		BufferedWriter bWriter = new BufferedWriter(fileWriter);
		
		
	}

}
