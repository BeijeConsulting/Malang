package it.beije.malang.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.beije.malang.Contatto;

public class InsertInDBFromCSV {

	public static void main(String[] args) {
		List<Contatto> contatti = new ArrayList<Contatto>();
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije14");
			conn = ConnectionFactory.getConnection();
			System.out.println("connection ? " + !conn.isClosed());

			Statement stmt = conn.createStatement();
		
//			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO rubrica (cognome, nome, email, telefono) VALUES (?,?,?,?)");
//			preparedStatement.setString(1, args[0]);
//			preparedStatement.setInt(2, Integer.parseInt(args[1]));

//			int r = preparedStatement.executeUpdate();
//			System.out.println("rows affected : " + r);

				stmt.close();

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
