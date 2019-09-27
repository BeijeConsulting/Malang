package it.beije.malang.database;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import it.beije.malang.Contatto;


public class ImportExp{
		
	public static void main(String... args) {
		Connection conn = null;
		File f = new File("C:\\temp\\rubrica.txt");
		System.out.println(f.exists());
		try {
			conn = ConnectionFactory.getConnection();
			Statement stmt = conn.createStatement();
			FileReader fileReader = new FileReader(f);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			
			List<Contatto> rows = new ArrayList<Contatto>();
			StringTokenizer tokenizer = null;
			Contatto contatto = null;
			while (bufferedReader.ready()) {
				tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
				contatto = new Contatto();
				contatto.setNome(tokenizer.nextToken());
				contatto.setCognome(tokenizer.nextToken());
				contatto.setTelefono(tokenizer.nextToken());
				contatto.setEmail(tokenizer.nextToken());
				
				System.out.println(contatto);
				rows.add(contatto);
				
				
				// i dati da inserire li sostituisco con i punti di domanda
				PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO rubrica (cognome, nome , email, telefono) values (?,?,?,?)");
				preparedStatement.setString(1, contatto.getCognome());
				preparedStatement.setString(2, contatto.getNome());
				preparedStatement.setString(3, contatto.getEmail());
				preparedStatement.setString(4, contatto.getTelefono());
				int r = preparedStatement.executeUpdate();
				
				
	
			}
			System.out.println("rows : " + rows.size());
			bufferedReader.close();	
			fileReader.close();	
			conn.close();
			
			
		}catch (FileNotFoundException FnFdExc){
			System.out.println("file non trovato");
		}catch (IOException IOExc) {
			System.out.println("IOException");
		}catch (SQLException SQLExc) {
			System.out.println("sqlexception");
		}catch (ClassNotFoundException CnFdExc) {
			System.out.println("CnFdExc");
		}
		
		
	
	}
}	