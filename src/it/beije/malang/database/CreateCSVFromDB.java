package it.beije.malang.database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import it.beije.malang.Contatto;

public class CreateCSVFromDB {

	public static void main(String[] args) throws IOException { 
		
		List<Contatto> contatti = new ArrayList<Contatto>();
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije14");
			System.out.println("connection ? " + !conn.isClosed());
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM rubrica";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Contatto contatto = new Contatto();
				
				contatto.setId(rs.getInt("id"));
				contatto.setCognome(rs.getString("cognome"));
				contatto.setNome(rs.getString("nome"));
				contatto.setEmail(rs.getString("email"));
				contatto.setTelefono(rs.getString("telefono"));
				contatti.add(contatto);
			}
			
			rs.close();
			stmt.close();
			
			File output=new File("C:\\prova\\outputesDB.csv");
			if (!output.exists())
			{
				output.createNewFile();
			}
			FileWriter filewriter=new FileWriter(output);
			BufferedWriter writer=new BufferedWriter(filewriter);

			Collections.sort(contatti);

			for (Contatto contatto:contatti) {
				writer.write(contatto.toString());
				writer.newLine();
			}
			writer.close();
			

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
	}
}