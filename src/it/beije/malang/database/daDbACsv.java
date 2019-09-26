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
import java.util.List;

import it.beije.malang.Contatto;

public class daDbACsv {
	

	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
	
	
		
		List<Contatto> contatti = new ArrayList<Contatto>();
		Connection conn = null; 
		conn = ConnectionToDb.getConnection();
		Statement stmt = conn.createStatement();
		String query = "SELECT * FROM rubrica";
		
		File f = new File("C:\\temp\\file_CSV.txt");
		FileWriter fileWriter = new FileWriter(f);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		ResultSet rs = stmt.executeQuery(query);
		String primaRiga = "\"ID\"\t\"COGNOME\"\t\"NOME\"\t\"EMAIL\"\t\"TELEFONO\"\t\n";
		bufferedWriter.write(primaRiga);
		
		while(rs.next()) {
			StringBuilder con =  new StringBuilder();
			con.append("\"").append(rs.getInt("id")).append("\"").append("\t");
			con.append("\"").append(rs.getString("cognome")).append("\"").append("\t");
			con.append("\"").append(rs.getString("nome")).append("\"").append("\t");
			con.append("\"").append(rs.getString("email")).append("\"").append("\t");
			con.append("\"").append(rs.getString("telefono")).append("\"").append("\t").append("\n");
			
			bufferedWriter.write(con.toString());
		}
		
		bufferedWriter.close();
		rs.close();
		stmt.close();
		conn.close();
		
		
		
		
	
	

	}

}
