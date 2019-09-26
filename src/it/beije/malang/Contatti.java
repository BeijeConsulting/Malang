package it.beije.malang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Contatti {
public static void main(String[] args) {
	String nome;
	String cognome;
	String email;
	String cellulare;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","beije12");
		System.out.println(connessione.isValid(0));
		
		Statement stmt = connessione.createStatement();
		/*String insert = "INSERT INTO rubrica VALUES (null,'ciccio','pasticcio','marco@rossi.it','3478798345');";
		int esito = stmt.executeUpdate(insert);
		if(esito == 1) {
			System.out.println("Query Eseguita!");
		}else {
			System.out.println("Query Non Eseguita!");
		}*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ora ti chiederò di inserire alcuni valori.. :");
		System.out.println("Inserisci Il Nome :");
		nome = s.next();
		System.out.println("Inserisci Il Cognome :");
		cognome = s.next();
		System.out.println("Inserisci Il Email :");
		email = s.next();
		System.out.println("Inserisci Il Cellulare :");
		cellulare = s.next();
		
		String query = "INSERT INTO rubrica VALUES (null,'"+cognome+"','"+nome+"','"+email+"','"+cellulare+"')";
		int esito = stmt.executeUpdate(query);
		
		
		if(esito == 1) {
			System.out.println("Contatto Inserito!");
		}

		
		/*
		String sql = "SELECT * FROM rubrica";
		ResultSet fetch = stmt.executeQuery(sql);
		
		while(fetch.next()) {
			System.out.println(fetch.getInt("id")+" - "+fetch.getString("nome"));
		}
		*/
		connessione.close();
	}catch(Exception e) {
		System.out.println("Si è verificata un'eccezione : " +e.getMessage());
	}
	
}
}
