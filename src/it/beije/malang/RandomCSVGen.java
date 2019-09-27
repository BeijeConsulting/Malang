package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class RandomCSVGen {

	public static void main(String[] args) throws IOException {
		File file1=new File("C:\\prova\\generato.csv");
		FileReader filereader=new FileReader(file1);
		BufferedReader reader=new BufferedReader(filereader);

		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<String> cognome = new ArrayList<String>();
		ArrayList<String> telefono = new ArrayList<String>();

		while(reader.ready()) {
			String []arr=reader.readLine().split(";");
			nome.add(arr[0]);
			cognome.add(arr[1]);
			telefono.add(arr[2]);
		}

		for(int i = 0; i <= 10; i++) {
			nome.add("");
			cognome.add("");
			telefono.add("");
		}
		nome.remove("nome");
		cognome.remove("cognome");
		telefono.remove("telefono");
		reader.close();

		File output=new File("C:\\prova\\millemila.csv");
		if (!output.exists())
		{
			output.createNewFile();
		}
		FileWriter filewriter=new FileWriter(output);
		BufferedWriter writer=new BufferedWriter(filewriter);
		writer.write("cognome;nome;email;telefono");
		writer.newLine();
		for (long i=0; i <= 100000; i++) {
			Contatto contattoRandom = new Contatto();
			Random rand = new Random();
			contattoRandom.setCognome(cognome.get(rand.nextInt(cognome.size() - 1)));
			contattoRandom.setNome(nome.get(rand.nextInt(nome.size() - 1)));
			contattoRandom.setTelefono(telefono.get(rand.nextInt(telefono.size() - 1)));
			contattoRandom.setEmail(createMail(contattoRandom.getNome(), contattoRandom.getCognome()));
//			System.out.println(contattoRandom.toString());
			writer.write(contattoRandom.toString());
			writer.newLine();
		}
		writer.close();
	}
	public static String createMail(String nome, String cognome) {
		//StringBuilder email = new StringBuilder();
		Random rand = new Random();
		String[] domain = {".it", ".com", ".net"};
		
		if (nome.equals(""))
			nome=cognome;
		if (cognome.equals(""))
			cognome="beije";
		return nome+"@"+cognome+domain[rand.nextInt(2)];
	}
}
