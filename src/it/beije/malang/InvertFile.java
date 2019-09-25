package it.beije.malang;
//- leggere un file di testo normale e creare un nuovo file con il contenuto del primo invertito sia per righe 
//(l’ultima riga sarà la prima etc) sia per caratteri di ciascuna riga (l’ultimo carattere della riga sarà il primo etc)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class InvertFile {
	
	public static void main(String[] args) throws IOException{
	
	File f = new File("C:\\temp\\fileTestuale.txt");
	System.out.println("il file è presente ? " + f.exists());
	
	FileReader fileReader = new FileReader(f);
	BufferedReader bufferedReader = new BufferedReader(fileReader);


	List<StringBuilder> elementi = new ArrayList<StringBuilder>();
	while(bufferedReader.ready()) {
		StringBuilder row = new StringBuilder(bufferedReader.readLine());
		row.reverse();
		elementi.add(row);
	}
	bufferedReader.close();
	
	FileWriter fileWriter = new FileWriter("C:\\temp\\fileInvertito.txt");//C:\temp\new_rubrica.txt
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

	for(int i = elementi.size()-1; i >= 0; i--) 
		bufferedWriter.write(elementi.get(i).toString()+"\n");
	
	bufferedWriter.close();
		
}
	
}
