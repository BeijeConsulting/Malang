package it.beije.malang.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import it.beije.malang.Contatto;

public class daCsvAdb {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		
		File f = new File("C:\\temp\\fileToDB.txt");
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Connection conn = null; 
		conn = ConnectionToDb.getConnection();
		Statement stmt = conn.createStatement();
		StringTokenizer tokenizer = null;
		Contatto contatto = null;
		int r = 0;
		while (bufferedReader.ready()) {
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
			
			contatto = new Contatto();
			
			contatto.setCognome(tokenizer.nextToken());
			contatto.setNome(tokenizer.nextToken());
			contatto.setEmail(tokenizer.nextToken());
			contatto.setTelefono(tokenizer.nextToken());
		
			
			String query = "INSERT INTO rubrica VALUES (null, '"+ contatto.getCognome() +"', '"+contatto.getNome() +"', ' "+ contatto.getEmail()+"', '"+ contatto.getTelefono() +"')";
			
			
			r = stmt.executeUpdate(query);
			
		}
		
		bufferedReader.close();
		conn.close();
		
	
		
		
		
	}
}
