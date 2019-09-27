package it.beije.malang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FromCsvToDb {
	
ArrayList<Contatto> rows = new ArrayList<Contatto>();

	public ArrayList<Contatto> fromCsvToDb() throws IOException {
		File f = new File("C:\\prova_java_io\\prova.txt");
		System.out.println("il file è presente ? " + f.exists());
		
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		StringTokenizer tokenizer = null;
		Contatto contatto = null;
		while (bufferedReader.ready()) {
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ",");
			contatto = new Contatto();
			contatto.setNome(tokenizer.nextToken());
			contatto.setCognome(tokenizer.nextToken());
			contatto.setTelefono(tokenizer.nextToken());
			contatto.setEmail(tokenizer.nextToken());
			
			//System.out.println(contatto);
			rows.add(contatto);
		}
		System.out.println("rows : " + rows.size());
		bufferedReader.close();
		return rows;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Contatto> contatti = new ArrayList<Contatto>();
		
		FromCsvToDb leggi = new FromCsvToDb();
		Connection conn = null;
		
		try {
			contatti = leggi.fromCsvToDb();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "vittorio.123");
			System.out.println("connection ? " + !conn.isClosed());
			
			Statement stmt = conn.createStatement();
//			String insert = "INSERT INTO rubrica ('', 'nome', 'email', 'telefono') VALUES ('Rossi', 'Marco', 'marco@rossi.it', '3471234567')";
			for (Contatto cols : contatti) {
				String insert = "INSERT INTO rubrica VALUES (null,'"+cols.getCognome()+"','"+cols.getNome()+"', '"+cols.getEmail()+"','"+cols.getTelefono()+"')";
				int r = stmt.executeUpdate(insert);
				System.out.println("rows affected : " + r);
			
			}			
			stmt.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();	
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
	
