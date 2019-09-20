package it.beije.malang.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddContact {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\temp\\Rubrica.txt");
		if(f.exists()) {}
		else
		{
		FileWriter fileWriter = new FileWriter("C:\\temp\\Rubrica.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		final String firstROW="COGNOME \t NOME \t TELEFONO \t EMAIL \t";
		bufferedWriter.write(firstROW);
		}
		
		FileReader filereader = new FileReader(f);
		PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));
		BufferedWriter bufferedWriter = new BufferedWriter(pw);
		System.out.print("Inserisci il cognome: ");
		bufferedWriter.newLine();
		bufferedWriter.write(sc.nextLine()+"\t \t ");
		System.out.print("Inserisci il nome: ");
		bufferedWriter.write(sc.nextLine()+"\t ");
		System.out.print("Inserisci il numero: ");
		bufferedWriter.write(sc.nextLine()+"\t ");
		System.out.print("Inserisci l'email: ");
		bufferedWriter.write(sc.nextLine()+"\t");
		
		System.out.println("Contatto aggiunto in rubrica!");
		bufferedWriter.close();
		
	}
}
