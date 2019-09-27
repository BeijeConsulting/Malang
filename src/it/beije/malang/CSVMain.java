package it.beije.malang;

import java.io.IOException;

public class CSVMain {

	public static void main(String[] args) throws IOException {
		CSVGenerator gen=new CSVGenerator("C:\\prova\\generato.csv");
		
		gen.generateRandomCSV("C:\\prova\\GeneratedCSV.csv", 100000);

	}

}
