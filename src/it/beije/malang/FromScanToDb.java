package it.beije.malang;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class FromScanToDb {
		
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String cognome =sc.nextLine();
			String nome =sc.nextLine();
			String email =sc.nextLine();
			String telefono =sc.nextLine();
			// TODO Auto-generated method stub
			ArrayList<Contatto> contatti = new ArrayList<Contatto>();
			
			FromCsvToDb leggi = new FromCsvToDb();
			Connection conn = null;
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "vittorio.123");
				System.out.println("connection ? " + !conn.isClosed());
				
				Statement stmt = conn.createStatement();
//				String insert = "INSERT INTO rubrica ('', 'nome', 'email', 'telefono') VALUES ('Rossi', 'Marco', 'marco@rossi.it', '3471234567')";
				
				String insert = "INSERT INTO rubrica VALUES (null,'"+cognome+"','"+nome+"', '"+email+"','"+telefono+"')";
				int r = stmt.executeUpdate(insert);
				System.out.println("rows affected : " + r);
				stmt.close();
				
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
}

