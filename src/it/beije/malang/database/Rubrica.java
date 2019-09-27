package it.beije.malang.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.beije.malang.Contatto;

public class Rubrica {

	public static void main(String[] args) {
		List<Contatto> contatti = new ArrayList<Contatto>();
		
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
//			Class.forName("com.mysql.cj.jdbc.Driver"); //carica la classe del driver JDBC
//			
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije007"); //crea una connessione, passando l'url, user e la PW
			System.out.println("connection ? " + !conn.isClosed());
			
			Statement stmt = conn.createStatement();//Una volta stabilita la connessione, occorre passare una istruzione.
			String insert = "INSERT INTO rubrica (cognome, nome, email, telefono) VALUES ('Rossi', 'Marco', 'marco@rossi.it', '3471234567')";
			//String insert = "INSERT INTO rubrica VALUES (null, 'Rossi', 'Marco', 'marco@rossi.it', '3471234567')";//I dati vengono prelevati dal database col classico meccanismo delle query.
			int r = stmt.executeUpdate(insert);// executeUpdate esecuta la querry sql passata nello statement
			System.out.println("rows affected : " + r);
			
			// Con la preparedStatement bisogna sostituire i valori da mettere nella db con punti di domanda "?"
			
			/***query per la selezione. executeQuery() legge una riga alla volta come per il BufferWriter dei file quindi bisogna ciclare su di esso per la stampa di tu***/
			//String query = "SELECT * FROM rubrica";
//			ResultSet rs = stmt.executeQuery(query);// Per la ResultSet gli indici partono da 1
//			while (rs.next()) {
//				Contatto contatto = new Contatto();
//				
//				contatto.setId(rs.getInt("id"));
//				contatto.setCognome(rs.getString("cognome"));
//				contatto.setNome(rs.getString("nome"));
//				contatto.setEmail(rs.getString("email"));
//				contatto.setTelefono(rs.getString("telefono"));
//				
//				System.out.println("id : " + contatto.getId());
//				System.out.println("cognome : " + contatto.getCognome());
//				System.out.println("nome : " + contatto.getNome());
//				System.out.println("email : " + contatto.getEmail());
//				System.out.println("telefono : " + contatto.getTelefono());
//				
//				contatti.add(contatto);
//			}
//			
//			rs.close();
//			stmt.close();
			
		} catch (ClassNotFoundException cnfEx) {
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

		//System.out.println("numero contatti : " + contatti.size());
	}

}
