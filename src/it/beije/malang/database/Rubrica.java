package it.beije.malang.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.beije.malang.database.entities.Contatto;

public class Rubrica {

	public static void main(String[] args) {
		List<Contatto> contatti = new ArrayList<Contatto>();
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "vittorio.123");

			conn = ConnectionFactory.getConnection();
			System.out.println("connection ? " + !conn.isClosed());
			
			Statement stmt = conn.createStatement();

//			String insert = "INSERT INTO rubrica ('cognome', 'nome', 'email', 'telefono') VALUES ('Rossi', 'Marco', 'marco@rossi.it', '3471234567')";
//			String insert = "INSERT INTO rubrica VALUES (null, 'Rossi', 'Marco', 'marco@rossi.it', '3471234567')";

//			String insert = "INSERT INTO rubrica (cognome, nome, email, telefono) VALUES ('" + args[0] + "', '" + args[1] + "', '" + args[2] + "', '" + args[3] + "')";

//			int r = stmt.executeUpdate(insert);
			
/*			PreparedStatement preparedStatement2 = conn.prepareStatement("delete from malang.rubrica where id =?;");
			PreparedStatement preparedStatement3 = conn.prepareStatement("delete from malang.rubrica where id =?;");
	//		PreparedStatement preparedStatement4 = conn.prepareStatement("delete from malang.rubrica where id =?;");
			System.out.println("inserisci Id da cancellare");
			int id2 =Integer.parseInt(sc.nextLine());
			int id3 =Integer.parseInt(sc.nextLine());
	//		int id4 =Integer.parseInt(sc.nextLine());
			preparedStatement2.setInt(1, id2 );
			preparedStatement3.setInt(1, id3 );
	//		preparedStatement4.setInt(1, id4 );
			int a = preparedStatement2.executeUpdate();
			int b = preparedStatement3.executeUpdate();
	//		int c = preparedStatement4.executeUpdate();

			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO rubrica (cognome, nome, email, telefono) VALUES (?,?,?,?)");
			preparedStatement.setString(1, args[0]);
			preparedStatement.setString(2, args[1]);
			preparedStatement.setString(3, args[2]);
			preparedStatement.setString(4, args[3]);
			int r = preparedStatement.executeUpdate();
*/			
			PreparedStatement preparedStatement1 = conn.prepareStatement("UPDATE rubrica SET nome = ?, email= ?, telefono =? WHERE id = ?");
			System.out.println("sei sicuro che il nome sia giusto? Prova a cambiarlo");
			String nome =sc.nextLine();
			String email =sc.nextLine();
			String telefono =sc.nextLine();
			int id =Integer.parseInt(sc.nextLine());
			preparedStatement1.setString(1, nome);
			preparedStatement1.setString(2, email);
			preparedStatement1.setString(3, telefono);
			preparedStatement1.setInt(4, id );
			
			int s = preparedStatement1.executeUpdate();
			System.out.println("rows affected : " + s);
			
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
