package it.beije.malang.database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.beije.malang.Contatto;


public class DatabaseToCsv {
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException, IOException {
		Connection conn=ConnectionFactory.getConnection();
		
		Statement stmt=conn.createStatement();
		
		String query="SELECT * FROM rubrica";
		
		ArrayList<Contatto> contatti=new ArrayList<Contatto>();
		
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			contatti.add(new Contatto(rs.getInt("id"),rs.getString("cognome"),rs.getString("nome"),rs.getString("email"),rs.getString("telefono")));
		}
		stmt.close();
		conn.close();
		File file =new File("C:\\prova\\sqlcsv.csv");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		BufferedWriter writer=new BufferedWriter(new FileWriter(file));
		
		for (Contatto contatto:contatti)
		{
			writer.write(contatto.toString(5));
			writer.newLine();
		}
		writer.close();
		
	}

}
