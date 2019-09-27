package it.beije.malang;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ImportExportCSVDB {
public static void main(String[] args) {
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","beije12");
		System.out.println(connessione.isValid(0));
		Statement stmt = connessione.createStatement();
		
		
	File a = new File("C:\\Users\\Padawan12\\Desktop\\dbtocsv.txt");
	FileReader r = new FileReader(a);
	BufferedReader buffer = new BufferedReader(r);
	String[] cols = null;
	int x=0;
	while(buffer.ready()) {	
		String row = buffer.readLine();
		if(x>0) {
		 cols = row.split("\t");
		 String id = cols[0];
		 String nome = cols[1];
		 String cognome = cols[2];
		 String email = cols[3];
		 String cellulare = cols[4];
		 
			String query = "INSERT INTO rubrica VALUES (null,'"+cognome+"','"+nome+"','"+email+"','"+cellulare+"')";
			stmt.executeUpdate(query);
		 
		 //System.out.println(cols[0]);
		}
		x++;
}
	buffer.close();
	connessione.close();
	}catch(Exception e) {
		
	}
	
	/*
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","beije12");
		Statement stmt = connessione.createStatement();
		//System.out.println(connessione.isValid(0));
		String sql = "SELECT * FROM rubrica";
		ResultSet fetch = stmt.executeQuery(sql);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\Padawan12\\Desktop\\dbtocsv.txt");
		String firstRow = "ID\tNOME\tCOGNOME\tEMAIL\tTELEFONO\n";
		BufferedWriter writer = new BufferedWriter(fileWriter);
		writer.write(firstRow);
		
		while(fetch.next()) {
			int id = fetch.getInt("id");
			String nome = fetch.getString("nome");
			String cognome = fetch.getString("cognome");
			String email = fetch.getString("email");
			String telefono = fetch.getString("telefono");
			String result = id+"\t"+nome+"\t"+cognome+"\t"+email+"\t"+telefono+"\n";
			writer.write(result);

			System.out.println(result);
		}
		writer.close();
		
	}catch(Exception e) {
	System.out.println(e.getMessage());	
	}*/
}
}
