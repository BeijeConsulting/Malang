package it.beije.malang;
import java.io.*;
import java.util.ArrayList;

public class MalangBatteOracle {

	public static void main(String[] args)throws IOException {
		
		File f = new File("C:\\Users\\Fulginiti\\Desktop\\malang2.txt");
		FileReader reader  = new FileReader(f);
		BufferedReader Breader = new BufferedReader(reader);
		
		FileWriter write = new FileWriter("C:\\Users\\Fulginiti\\Desktop\\malang1.txt");
		BufferedWriter writer = new BufferedWriter(write);
		String firstRow = "\"COGNOME\"\t\"NOME\"\t\"TELEFONO\"\t\"E-MAIL\"\n";
		writer.write(firstRow);
		
		
		
		ArrayList<String[]> list = new ArrayList<String[]>();
		
		while(Breader.ready()) {
			//list.add(Breader.readLine().split(";"));
			writer.write(Breader.readLine());
			
		}
		
		reader.close();
		writer.close();
		
		
		
		

	}

}
