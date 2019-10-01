package it.beije.malang.database;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import it.beije.malang.Contatto;
import it.beije.malang.CreaMailDaFile;




public class ImportExp{

	
//	
//	IMPORTARE UN FILE CSV NELLA TABELLA
//	

	
	public static void importareFile(String percorso) {
		
		Connection conn = null;
		
		File f = new File(percorso);
		System.out.println(f.exists());
		
		
			try {
				conn = ConnectionFactory.getConnection();
		
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
					contatto.setEtà(tokenizer.nextToken());
	
					
					System.out.println(contatto);
				
				
					// i dati da inserire li sostituisco con i punti di domanda
					PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO rubrica (cognome, nome , email, telefono, età) values (?,?,?,?,?)");
					preparedStatement.setString(1, contatto.getCognome());
					preparedStatement.setString(2, contatto.getNome());
					preparedStatement.setString(3, CreaMailDaFile.CreaMail());
					preparedStatement.setString(4, contatto.getTelefono());
					preparedStatement.setString(5, contatto.getEtà());
					int r = preparedStatement.executeUpdate();
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
	
//
//	PER SCRIVERE UNA RIGA NELLA TABELLA
//	
	
	
	public static void importareRiga(String...args ) {
		Connection conn = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			
			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO rubrica (cognome, nome , email, telefono, età) values (?,?,?,?,?)");
			preparedStatement.setString(1, args[0]);
			preparedStatement.setString(2, args[1]);
			preparedStatement.setString(3, args[2]);
			preparedStatement.setString(4, args[3]);
			preparedStatement.setString(5, args[4]);

			int r = preparedStatement.executeUpdate();
			
			System.out.println("righe inserit: " +r);
			
			
		}catch(ClassNotFoundException ClNtFndExc) {
			System.out.println("ClNtFndExc");
		}catch(SQLException SQLExc) {
			System.out.println("SQLExc");
		}
	}
	
	
	
//
//	PER ESPORTARE DA DATABASE IN CSV
//	
	public static void export(String percorso) {
		Connection conn = null;

		try {
			conn = ConnectionFactory.getConnection();
			String query = "SELECT * FROM rubrica";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			FileWriter fileWriter = new FileWriter(percorso);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
		while (rs.next()) {
			
			Contatto contatto = new Contatto();
			
			contatto.setId(rs.getInt("id"));
			contatto.setCognome(rs.getString("cognome"));
			contatto.setNome(rs.getString("nome"));
			contatto.setEmail(rs.getString("email"));
			contatto.setTelefono(rs.getString("telefono"));
			contatto.setEtà(rs.getString("età"));
			
//			System.out.println("id : " + contatto.getId());
//			System.out.println("cognome : " + contatto.getCognome());
//			System.out.println("nome : " + contatto.getNome());
//			System.out.println("email : " + contatto.getEmail());
//			System.out.println("telefono : " + contatto.getTelefono());
//			System.out.println("età : " + contatto.getEtà());
		
					
					
					
						StringBuilder row = new StringBuilder("\"");
						
						row.append(contatto.getId()).append("; ");
						row.append(contatto.getCognome()).append("; ");
						row.append(contatto.getNome()).append("; ");
						row.append(contatto.getEmail()).append("; ");
						row.append(contatto.getTelefono()).append("; ");
						row.append(contatto.getEtà()).append("\n");
						
						bufferedWriter.write(row.toString());
						
		}
		bufferedWriter.close();
		
	} catch(ClassNotFoundException CNFEXc) {
		System.err.println("cnfex");
	}catch(SQLException SQLExc) {
		System.out.println("sqlexc");
	}catch(IOException IOe){
		System.out.println("IOe");
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String... args) {
		
	//	ImportExp.importare();

	//	ImportExp.importareRiga("ferulli", "gabriele", "g@f.it", "3452165895", "24" );
		
		ImportExp.export("C:\\temp\\proviamo.txt");
	}	
	
}