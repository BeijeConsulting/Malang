package it.beije.malang.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//carica la classe del driver JDBC
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije007");//crea una connessione, passando l'url, user e la PW
		} catch (ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
			throw cnfEx;
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
			throw sqlEx;
		}
		
		return conn;
	}
	
}
