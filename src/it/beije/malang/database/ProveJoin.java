package it.beije.malang.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import it.beije.malang.CreaMailDaFile;
import it.beije.malang.database.entities.Contatto;
import it.beije.malang.database.entities.Indirizzo;
import it.beije.malang.database.entities.Utente;


public class ProveJoin {
	
	public static void main(String argv[]) throws Exception {
		
		// PROVA A USARE IL METODO CHE FA LE DUE COSE SEPARATAMENTE E NON QUESTO
		//importareFile("C:\\temp\\casuali.txt");
		DaArrayADb();
	}
	
public static void importareFile(String percorso) {
		
		Connection conn = null;
		
		File f = new File(percorso);
		System.out.println(f.exists());
		
		
			try {
				conn = ConnectionFactory.getConnection();
		
				FileReader fileReader = new FileReader(f);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				
				Utente utente = null;
				
				StringTokenizer tokenizer = null;
				
				while (bufferedReader.ready()) {
					tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
					utente = new Utente();
					utente.setCognome(tokenizer.nextToken());
					utente.setNome(tokenizer.nextToken()) ;
					utente.setEmail(tokenizer.nextToken()) ;

					
					System.out.println(utente);
				
				
					// i dati da inserire li sostituisco con i punti di domanda
					PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO rubrica (cognome, email , nome) values (?,?,?)");
					preparedStatement.setString(1, utente.getCognome());
					preparedStatement.setString(2, utente.getEmail());
					preparedStatement.setString(3, utente.getNome());
					

					//int r = preparedStatement.executeUpdate();
				}
				
				bufferedReader.close();	
				fileReader.close();	
				conn.close();
				
			}catch (FileNotFoundException FnFdExc){
				System.out.println("file non trovato");
			}catch (IOException IOExc) {
				System.out.println("IOException");
			}catch (SQLException SQLExc) {
				System.out.println("sqlexception");
			}catch (ClassNotFoundException CnFdExc) {
				System.out.println("CnFdExc");
			}
			

	}
}

