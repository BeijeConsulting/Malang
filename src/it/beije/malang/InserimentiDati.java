package it.beije.malang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.beije.malang.*;

public class InserimentiDati {
	
	public static void insertContact() {
		ArrayList<Contatto> contatti = new ArrayList<Contatto>();
	try	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","Marcomattia1");
			Statement stmt = conn.createStatement();
			System.out.println("inserisci Cognome,nome,e-mail e telefono del tuo contatto");
			
			Scanner scan = new Scanner(System.in);
			
			String cognome = scan.nextLine();
			String nome = scan.nextLine();
			String email = scan.nextLine();
			String telefono = scan.nextLine();
			
			String insert = "INSERT INTO rubrica VALUES (null,'"+cognome+"','"+nome+"','"+email+"','"+telefono+"');";
			String query = "SELECT * FROM rubrica";
			System.out.println(insert);
		
			int uno = stmt.executeUpdate(insert);
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				Contatto contattiUno = new Contatto();
				
				contattiUno.setId(rs.getInt("id"));//metodo per settare nome,id,ecc....con poi un altro get di intero
				contattiUno.setCognome(rs.getString("cognome"));//vanno tra virgolette perchè sono i nomi delle colonne
				contattiUno.setNome(rs.getString("nome"));
				contattiUno.setEmail(rs.getString("email"));
				contattiUno.setTelefono(rs.getString("telefono"));
				
				System.out.println("id : " + contattiUno.getId());
				System.out.println("cognome : " + contattiUno.getCognome());
				System.out.println("nome : " + contattiUno.getNome());
				System.out.println("email : " + contattiUno.getEmail());
				System.out.println("telefono : " + contattiUno.getTelefono());
				
				contatti.add(contattiUno);
			}
			
			rs.close();
			stmt.close();
			
		}catch(ClassNotFoundException cnfex){
			cnfex.printStackTrace();
		}catch(SQLException sqlEX) {
			sqlEX.printStackTrace();
			
		}
			
//			ArrayList<String> contatti = new ArrayList<String>();
//			contatti.add(cognome);
//			contatti.add(nome);
//			contatti.add(email);
//			contatti.add(telefono);
			
	}
		
	
	public static void main(String[] args) {
		
		insertContact();
	
		
	}		
}
