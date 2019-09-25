package it.beije.malang.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FusioneFile {
	

	public static void main(String[] args) throws IOException {
		File f2 = new File("C:\\temp\\testo2.txt");
		File f3 = new File("C:\\temp\\testo3.txt");
		
		FileReader fileReader = new FileReader(f2);
		FileReader fileReader2 = new FileReader(f3);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
		FileWriter fileWriter = new FileWriter("C:\\temp\\testo4.txt");
		fileWriter.write(bufferedReader.readLine() + " ");
		fileWriter.write(bufferedReader2.readLine());
		
		
		bufferedReader.close();
		bufferedReader2.close();
		fileWriter.close();

}
}
