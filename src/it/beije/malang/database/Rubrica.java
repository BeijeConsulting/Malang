package it.beije.malang.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.beije.malang.database.entities.Contatto;

public class Rubrica {

	public static void main(String[] args) {
		List<Contatto> contatti = new ArrayList<Contatto>();
		
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			System.out.println("connection ? " + !conn.isClosed());
			
			Statement stmt = conn.createStatement();
//			String insert = "INSERT INTO rubrica (cognome, nome, email, telefono) VALUES (?,?,?,?)"; // syntax exc near ?,?,?,?
//			int r = stmt.executeUpdate(insert);
			
//			String str1 = "INSERT INTO rubrica (cognome, nome, email, telefono) VALUES (?,?,?,?)";
//			PreparedStatement prStmt = conn.prepareStatement(str1);
//			prStmt.setString(1, args[0]);
//			prStmt.setString(2, args[1]);
//			prStmt.setString(3, args[2]);
//			prStmt.setString(4, args[3]);
//			int r = prStmt.executeUpdate();
			
			
//			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO rubrica (cognome, nome, email, telefono) VALUES (?,?,?,?)");
//			preparedStatement.setString(1, args[0]);
//			preparedStatement.setString(2, args[1]);
//			preparedStatement.setString(3, args[2]);
//			preparedStatement.setString(4, args[3]);
//			PreparedStatement preparedStatement = conn.prepareStatement("UPDATE rubrica SET nome = ? WHERE id = ?");
//			preparedStatement.setString(1, args[0]);
//			preparedStatement.setInt(2, Integer.parseInt(args[1]));
			
//			int r = preparedStatement.executeUpdate();
//			System.out.println("rows affected : " + r);
			
//			String query = "SELECT * FROM rubrica";
//			ResultSet rs = stmt.executeQuery(query);
//			while (rs.next()) {
//				Contatto contatto = new Contatto();
//				
//				contatto.setId(rs.getInt("id"));
//				contatto.setCognome(rs.getString("cognome"));
//				contatto.setNome(rs.getString("nome"));
//				contatto.setEmail(rs.getString("email"));
//				contatto.setTelefono(rs.getString("telefono"));
//				
//				System.out.println("id : " + contatto.getId());
//				System.out.println("cognome : " + contatto.getCognome());
//				System.out.println("nome : " + contatto.getNome());
//				System.out.println("email : " + contatto.getEmail());
//				System.out.println("telefono : " + contatto.getTelefono());
//				
//				contatti.add(contatto);
//			}
//			
//			rs.close();
			
			String rowDelete = "DELETE FROM rubrica WHERE id = ?";
			PreparedStatement prRowDel = conn.prepareStatement(rowDelete);
			prRowDel.setInt(1, Integer.parseInt(args[0]));
			int r = prRowDel.executeUpdate();
			
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

		System.out.println("numero contatti : " + contatti.size());
	}

}
