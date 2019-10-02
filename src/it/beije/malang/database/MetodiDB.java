package it.beije.malang.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.beije.malang.Contatto;

public class MetodiDB {

	public static void main(String[] args) {
		List<Contatto> contatti = new ArrayList<Contatto>();

		Connection conn = null; //bisogna dichiarare e inizializzare conn
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			conn = ConnectionFactory.getConnection(); //accede alla classe ConnectionFactory e poi carica la classe del driver JDBC, così non ci serve più la riga successiva
			//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije007");
			System.out.println("connection ? " + !conn.isClosed());
			Statement stmt = conn.createStatement();
			
			/*******************Chiamata a inserisce()**************************/
//			int r = stmt.executeUpdate(inserisce()); //Passo il metodo inserisce a executeUpdate
//			System.out.println("rows affected : " + r);
			
			/*******************Inizio chiamata a seleziona()**************************/
//			ResultSet rs = stmt.executeQuery(query());//Passo il metodo seleziona a executeQuery, gli indici partono da 1 con ResultSet 
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
			
/*******************Fine chiamata a seleziona()**************************/
			
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

		System.out.println("numero contatti : " + contatti.size());
	}
	
	/*******Metodo per l'inserimento nel DB*******/
	public static String inserisce() {
		String insert = "INSERT INTO rubrica (cognome, nome, email, telefono) VALUES ('bianchi', 'paolo', 'paolo@bianchi.it', '3471564518')";

		return insert;
	}
	
	/*******Metodo per la selezione dal DB*******/
	public static String seleziona() {
		String query = "SELECT * FROM rubrica";
		
		return query;
	}
	
}