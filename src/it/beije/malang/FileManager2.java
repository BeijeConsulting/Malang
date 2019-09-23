package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.Scanner;

import java.util.StringTokenizer;

public class FileManager2 {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\prova_java_io\\rubrica.txt"));
		bufferedWriter.write("Rubrica dei contatti\n");
		
		//List<String> rows = new ArrayList<String>();
		StringTokenizer tokenizer = null;
		Contatto contatto = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Vuoi inserire un contatto?");
			String inserisci = scanner.nextLine();
			if(!inserisci.equals("exit")) {
				System.out.println("Inerisci il contatto: nome, cognome, telefono, email");
				String prossimoContatto = scanner.nextLine();
				tokenizer = new StringTokenizer(prossimoContatto, ",");
				contatto = new Contatto();
				contatto.setNome(tokenizer.nextToken());
				contatto.setCognome(tokenizer.nextToken());
				contatto.setTelefono(tokenizer.nextToken());
				contatto.setEmail(tokenizer.nextToken());
				System.out.println(contatto);
				
				bufferedWriter.write(contatto.toString());
			}
			else {
				System.out.println("non è più possibile inserire contatti");
				break;
			}
	
		}
	bufferedWriter.close();
	}
}
