package it.beije.malang.database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


//importo il csv su mysql
public class Import_csv {
	
	
	public static void main(String[] args) throws Exception {
		
		
		// connessione
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			System.out.println("connection ? " + !conn.isClosed());
			
			Statement stmt = conn.createStatement();
			
			
			//carico il file
			FileReader file = new FileReader("C:\\temp\\rosa_squadra.txt");
			BufferedReader reader = new BufferedReader(file);
			
			String text = "";
			String line = reader.readLine();
			
					
			while (line != null) {
				text = line;
				line = reader.readLine();
				System.out.println(text.replace(";", " ") +"\t"  + "\n");
				String nomi[] = text.split(";");
	 
				//PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO rubrica (id, cognome, nome, email, telefono) VALUES (?,?,?,?,?)");
				PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO lazio ( nome, cognome, squadra, ruolo, numero) VALUES (?,?,?,?,?)");

				
				preparedStatement.setString(1, nomi[0]);
				preparedStatement.setString(2, nomi[1]);
				preparedStatement.setString(3, nomi[2]);
				preparedStatement.setString(4, nomi[3]);
				preparedStatement.setString(5, nomi[4]);
			
			int r = preparedStatement.executeUpdate();
			System.out.println("rows affected : " + r);
			

			stmt.close();
			
			}
		}
		catch (ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
			} catch (SQLException ce) {
				ce.printStackTrace();
			}
		}

//		System.out.println("numero contatti : " + contatti.size());
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
