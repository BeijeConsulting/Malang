package it.beije.malang.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.StringTokenizer;


public class UpdateDatabase {

	public static void main(String[] args) throws IOException {
	File f = new File("C:\\temp\\database.txt");
	FileReader fileReader = new FileReader(f);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			System.out.println("connection ? " + !conn.isClosed());

			StringTokenizer tokenizer = null;

			PreparedStatement preparedStatement= conn.prepareStatement("INSERT INTO rubrica (cognome,nome,email,telefono) VALUES (?,?,?,?)");
			
			while (bufferedReader.ready()) {
				tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
				
				
				 preparedStatement.setString(1, tokenizer.nextToken());
				 preparedStatement.setString(2, tokenizer.nextToken());
				 preparedStatement.setString(3, tokenizer.nextToken());
				 preparedStatement.setString(4, tokenizer.nextToken());
				 
				 preparedStatement.executeUpdate();

			}
			
			preparedStatement.close();
			bufferedReader.close();
			
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
