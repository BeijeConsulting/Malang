package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Random;

public class LavoroSuCsv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\prova_java_io\\generato.txt");
		System.out.println("il file è presente ? " + f.exists());
		
		Random r = new Random();
		
		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<String> cognome = new ArrayList<String>();
		ArrayList<String> telefono = new ArrayList<String>();
		
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		StringTokenizer tokenizer = null;
		while (bufferedReader.ready()) {
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
			nome.add(tokenizer.nextToken());
			cognome.add(tokenizer.nextToken());
			telefono.add(tokenizer.nextToken());
		}
		
		nome.remove(0);
		cognome.remove(0);
		telefono.remove(0);
		for(int i=0;i<10;i++) {
			nome.add("");
			cognome.add("");
			telefono.add("");
		}
		
		BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("C:\\prova_java_io\\vittorio3.csv"));
		
		String firstRow ="COGNOME;NOME;EMAIL;TELEFONO;RANDOM\n";// "COGNOME"	"NOME"	"TELEFONO"
		bufferedWriter1.write(firstRow);
		
		String[] estensioni=  {".it",".com",".net"};
		
		for(int i=0;i<5000000;i++) {
			
			
			int a = r.nextInt(nome.size());
			int b = r.nextInt(nome.size());
			int c = r.nextInt(nome.size());
			int d = r.nextInt(estensioni.length);
			String nome1=null;
			String cognome1=null;
			String telefono1=null;
			
			int l = r.nextInt(15);
			
			char[] array= new char[l];
			
			for(int n=0;n<l;n++) {
				array[n]=(char)(r.nextInt(25)+97);
			}
			
			nome1=nome.get(a);
			cognome1=cognome.get(b);
			telefono1=telefono.get(c);
			
			StringBuilder row = new StringBuilder("\"");
			row.append(cognome1).append('"');
			row.append(';').append('"');
			row.append(nome1).append('"');
			row.append(';').append('"');

			if  (cognome.get(b)!="") {cognome1=cognome.get(b);}
			else {cognome1="beije";}
			
			if  (nome.get(a)!="") {nome1=nome.get(a);}
			else {nome1=cognome1;}
			
			row.append(nome1+ "@" +cognome1+estensioni[d]).append('"');
			row.append(';').append('"');
			row.append(telefono1).append('"').append(';');
			row.append('"').append(array).append('"').append('\n');
			
			
			bufferedWriter1.write(row.toString());
		}
		String nome1="frenklin";
		String cognome1="ronaldinho";
		String telefono1="3434343434";
		StringBuilder row = new StringBuilder("\"");
		row.append(cognome1).append('"');
		row.append(';').append('"');
		row.append(nome1).append('"');
		row.append(';').append('"');
		row.append(nome1+ "@" +cognome1+".org").append('"');
		row.append(';').append('"');
		row.append(telefono1).append('"').append('\n');
		
		bufferedWriter1.write(row.toString());
		bufferedWriter1.close();	
		System.out.println("ho finito");
			
	
	}

}
