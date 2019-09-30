package it.beije.malang;

import java.io.IOException;

public class CSVMain {

	public static void main(String[] args) throws IOException {
		CSVGenerator gen=new CSVGenerator("C:\\temp\\generato.csv");
		
		gen.generateRandomCSV("C:\\temp\\CSV-generato.csv", 100000);

	}

}