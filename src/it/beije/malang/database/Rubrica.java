package it.beije.malang.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

import it.beije.malang.database.*;

public class Rubrica {

	public static void main(String[] args) {
		
		SQLManager conn = null;
		
		try {
			conn = new SQLManager("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije09");
			
			File f = new File("C:\\Esercizi\\rubrica.txt");
			conn.importCSV(f);
			
		}
		catch (ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		} 
		catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} 
		catch (FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		} 
		catch (IOException ioEx) {
			ioEx.printStackTrace();
		} 
		finally {
			try {
				if (conn.getConnection() != null) conn.close();
			} 
			catch (SQLException ce) {
				ce.printStackTrace();
			}
		}
		
//		List<Contact> contatti = new ArrayList<Contact>();
//		SQLManager conn = null;
//		
//		try {
//			
//			conn = new SQLManager("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije09");
//			
//			String query = "SELECT * FROM rubrica";
//			ResultSet rs = conn.query(query);
//			
//			while (rs.next()) {
//				Contact contact = new Contact(rs.getString("nome"), rs.getString("cognome"));
//				
//				contact.setId(rs.getInt("id"));
//				contact.setEmail(rs.getString("email"));
//				contact.setPhone(rs.getString("telefono"));
//				
//				contatti.add(contact);
//				
//				System.out.println(contact.toString());
//			}
//			
//			conn.close();
//			
//		} 
//		catch (ClassNotFoundException cnfEx) {
//			cnfEx.printStackTrace();
//		} 
//		catch (SQLException sqlEx) {
//			sqlEx.printStackTrace();
//		} 
//		finally {
//			try {
//				if (conn.getConnection() != null) conn.close();
//			} 
//			catch (SQLException ce) {
//				ce.printStackTrace();
//			}
//		}
//
//		System.out.println("numero contatti : " + contatti.size());
	}

}
