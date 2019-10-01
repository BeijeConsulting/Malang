package it.beije.malang.database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class Export_csv {
	
	public static void main(String[] args) throws Exception{
		
		
		String filename = "C:\\temp\\export_lazio.txt";
	
        FileWriter fw = new FileWriter("C:\\temp\\export_lazio.txt");
		BufferedWriter = new BufferedReader(file);


		// connessione
			Connection conn = null;
			try {
				conn = ConnectionFactory.getConnection();
				System.out.println("connection ? " + !conn.isClosed());
					
				Statement stmt = conn.createStatement();
				
				
				String query = "select* from lazio";
				PreparedStatement preparedStatement = conn.prepareStatement(query);
	            ResultSet rs = stmt.executeQuery(query);

				int r = preparedStatement.executeUpdate();
				
				while (rs.next()) {
					fw.append(rs.getString(1));
				}
				
			} catch (Exception e) {
	            e.printStackTrace();
	        }

	}
					
	
	}
	

