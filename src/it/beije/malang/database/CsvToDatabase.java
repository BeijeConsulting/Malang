package it.beije.malang.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import it.beije.malang.Contatto;

public class CsvToDatabase {
	public static void main(String [] args) throws IOException{
		
		
		ArrayList<Contatto> contatti=new ArrayList<>();
		BufferedReader reader=new BufferedReader(new FileReader("C:\\prova\\csvsql.csv"));
		
		while(reader.ready()) {
			contatti.add(new Contatto(reader.readLine().split(";")));
		}
		reader.close();
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije08");
			System.out.println("connection ? " + !conn.isClosed());
			
			Statement stmt = conn.createStatement();
			
			for (Contatto contatto:contatti) {
				String query = "INSERT INTO rubrica (nome,cognome,telefono,email) VALUES ('"
						+contatto.getNome()+"','"
						+contatto.getCognome()+"','"
						+contatto.getTelefono()+"','"
						+contatto.getEmail()+"')";
				System.out.println(query);
				stmt.execute(query);
			}
			conn.close();
			stmt.close();
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
}
