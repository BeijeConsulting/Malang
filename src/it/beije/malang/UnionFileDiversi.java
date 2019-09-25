package it.beije.malang;
import java.util.*;
import java.io.*;

public class UnionFileDiversi {
	
	public static void main(String[] args) throws IOException {
	File f = new File("C:\\temp\\prova.txt");
	FileReader fReader = new FileReader(f);
	BufferedReader bReader = new BufferedReader(fReader);
	
	
	Contatto contatto = new Contatto();
	StringTokenizer tokenizer = null;
	
	
	FileWriter fileWriter = new FileWriter("C:\\temp\\FileDiversiUniti.txt");
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	String firstRow ="\"COGNOME\"\t\"NOME\"\t\"NOME COMPLETO\"\t\"EMAIL\"\t\"TELEFONO\"\n";
	
	ArrayList<String[]> rows = new ArrayList<String[]>();
	
	bufferedWriter.write(firstRow);
	while(bReader.ready()) {
		String row = bReader.readLine();
		String[] cols = row.split(";");
		
		rows.add(cols);
	}
	
	bReader.close();
	
	ArrayList<String> finale = new ArrayList<String>();
	
	for(String[] cols: rows) {
		StringBuilder nuovaRiga = new StringBuilder();
		nuovaRiga.append('\"');
		nuovaRiga.append(cols[1]).append("\"").append("\t").append("\"");
		nuovaRiga.append(cols[0]).append("\"").append("\t").append("\"");
		nuovaRiga.append(cols[0]).append(" ").append(cols[1]).append("\"").append("\t").append("\"");
		nuovaRiga.append(cols[3]).append("\"").append("\t").append("\"");
		nuovaRiga.append(cols[2]).append("\"").append("\n");
		finale.add(nuovaRiga.toString());
		
	}
	
	f = new File("C:\\temp\\fileDue.txt");
	fReader = new FileReader(f);
	bReader = new BufferedReader(fReader);
	rows.clear();
	while(bReader.ready()) {
		String row = bReader.readLine();
		String[] cols = row.split(";");
		
		rows.add(cols);
	}
	
	bReader.close();

	for(String[] cols: rows) {
		StringBuilder nuovaRiga = new StringBuilder();
		nuovaRiga.append('\"');
		nuovaRiga.append(cols[1]).append("\"").append("\t").append("\"");
		nuovaRiga.append(cols[2]).append("\"").append("\t").append("\"");
		nuovaRiga.append(cols[1]).append(" ").append(cols[0]).append("\"").append("\t").append("\"");
		nuovaRiga.append(cols[0]).append("\"").append("\t").append("\"");
		nuovaRiga.append(cols[3]).append("\"").append("\n");
		
		
		finale.add(nuovaRiga.toString());
	}
	
	String[] stringArray =finale.toArray(new String[0]); 
	Arrays.sort(stringArray);
	
	for(String a: stringArray) {
		System.out.println(a);
		bufferedWriter.write(a);
	}
	
	bufferedWriter.close();
		
	
	
	
		
		
		
		
}
}


