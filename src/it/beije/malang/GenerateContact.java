package it.beije.malang;
import java.io.*;
import java.util.*;

//Partendo dai dati nel csv allegato, caricare 3 elenchi distinti per NOME, COGNOME e TELEFONO.
//Aggiungete in questi elenchi 10 stringhe vuote ("").
//Fatevi un array di DOMINI {"it", "com", "net"}
//
//A questo punto procedete con il generare alcune migliaia di combinazioni casuali di cognome-nome-email-telefono con le seguenti regole:
//
//- pescate a caso un elemento dall'elenco COGNOME
//- pescate a caso un elemento dall'elenco NOME
//- pescate a caso un elemento dall'elenco TELEFONO
//- generate la mail con la formula NOME@COGNOME.{dominio random}
//  nel caso COGNOME == "" sostituitelo con "beije" 
//  nel caso NOME == "" sostituitelo con COGNOME
//Scrivete queste combinazioni in un file CSV con ordine delle colonne deciso da voi, l'importante è che sia specificato nella prima riga.

public class GenerateContact {
	
	static Random random = new Random();
	static String getEmail(String nome, String cognome, String dominio) {
		return nome + "@" + cognome + "." + dominio;
	}
	public static void main(String[] args) throws IOException {
		
		List<String> nomi = new ArrayList<String>();
		List<String> cognomi = new ArrayList<String>();
		List<String> telefono = new ArrayList<String>();
		String[] domini = {"it", "com", "net"};		
		
		File f = new File("C:\\temp\\generato.csv");
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		FileWriter fileWriter = new FileWriter("C:\\temp\\new_generate.csv");//C:\temp\new_rubrica.txt
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		String firstRow ="\"COGNOME\"\t\"NOME\"\t\"TELEFONO\"\t\"EMAIL\"\n";
		bufferedWriter.write(firstRow);
		StringTokenizer tokenizer = null;
		
		while (bufferedReader.ready()) {
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
			//nomecognometelefono
			
			nomi.add(tokenizer.nextToken());
			cognomi.add(tokenizer.nextToken());
			telefono.add(tokenizer.nextToken());
		}
		
		bufferedReader.close();
		
		for(int i = 0; i < 10; i++) {
			nomi.add("");
			cognomi.add("");
			telefono.add("");
		}
		
		
		
		for(int i = 0; i < 1000; i++) {
			StringBuilder rows = new StringBuilder("");
			int nameRandom = random.nextInt(nomi.size());
			int surnameRandom = random.nextInt(cognomi.size());
			int telephonRandom = random.nextInt(telefono.size());
			int dominio = random.nextInt(3);
		
			rows.append(cognomi.get(surnameRandom)).append(";").append(nomi.get(nameRandom)).append(";").append(telefono.get(telephonRandom)).append(";");
			rows.append(getEmail(nomi.get(nameRandom),cognomi.get(surnameRandom), domini[dominio])).append(";\n");
			bufferedWriter.write(rows.toString());
			
		}
		
		bufferedWriter.close();
		
		
		
	}

}
