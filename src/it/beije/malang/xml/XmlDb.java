package it.beije.malang.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;

import it.beije.malang.Contatto;
import it.beije.malang.database.ConnectionFactory;

public class XmlDb{
	public static void main(String[] args) {
		daArrayADb("C:\\temp\\rubrica.txt");
//		salvaInArray("C:\\temp\\rubrica.txt");
//		System.out.println(utente);
	}

//sono proveee
	
	


public static ArrayList<Contatto> salvaInArray(String pathFile) {
		
		File f = new File(pathFile);
		System.out.println(f.exists());
		 ArrayList<Contatto> utente = new ArrayList<Contatto>();
		
			try {
		
				FileReader fileReader = new FileReader(f);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				Contatto contatto = null;
				
				StringTokenizer tokenizer = null;
				
				while (bufferedReader.ready()) {
					tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
					contatto = new Contatto();
					contatto.setNome(tokenizer.nextToken());
					contatto.setCognome(tokenizer.nextToken());
					contatto.setTelefono(tokenizer.nextToken());
					contatto.setEmail(tokenizer.nextToken());
	
					utente.add(contatto);
					
				}
				
			bufferedReader.close();	
			fileReader.close();	
			
			
			
			}catch (FileNotFoundException FnFdExc){
				System.out.println("file non trovato");
			}catch (IOException IOExc) {
				System.out.println("IOException");
			}
			
			return utente;		
}	
	
public static void daArrayADb(String pathFile) {

	Connection conn = null;
	
	try {
		
		conn = ConnectionFactory.getConnection();
		
		
		Statement stmt = conn.createStatement();
		
		for (Contatto cols : XmlDb.salvaInArray(pathFile)) {
			
			System.out.println(cols.getCognome());
			System.out.println(cols.getEmail());
			System.out.println(cols.getNome());
		String insert =  "INSERT INTO rubrica VALUES (null,'"+cols.getCognome()+"','"+cols.getNome()+"', '"+cols.getEmail()+"','"+cols.getTelefono()+"', null)";

		int r = stmt.executeUpdate(insert);
		
		System.out.println("rows affected : " + r);
		
		}
		conn.close();
	}catch(ClassNotFoundException CNFExc) {
		
		System.out.println("classe non trovata");
	}catch(SQLException SQLExc) {
		
		System.out.println("SQLExc");
	}


}








}
