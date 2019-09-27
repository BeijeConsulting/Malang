package it.beije.malang.database;
import java.util.*;
import java.sql.*;

import it.beije.malang.Contatto;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class daScanneraDb {

	static Scanner t = new Scanner(System.in);
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		Connection conn = null;
		conn = ConnectionToDb.getConnection();
		Statement stmt = conn.createStatement();
		int r = 0;
		boolean continua = true;
		do {
			Contatto contatto = new Contatto();
			System.out.print("Inserisci il cognome: ");
			contatto.setCognome(t.nextLine());
			System.out.print("Inserisci il nome: ");
			contatto.setNome(t.nextLine());
			System.out.print("Inserisci l'email: ");
			contatto.setEmail(t.nextLine());
			System.out.print("Inserisci il numero di telefono: ");
			contatto.setTelefono(t.nextLine());
			
			String query = "INSERT INTO rubrica VALUES (null, '"+ contatto.getCognome() +"', '"+contatto.getNome() +"', ' "+ contatto.getEmail()+"', '"+ contatto.getTelefono() +"')";
			r = stmt.executeUpdate(query);
			
			System.out.print("Inserire un altro contatto? ");
			String risposta = t.nextLine();
			if(risposta.equalsIgnoreCase("no"));
				continua = false;
				
		}while(continua);
		conn.close();
	}
}
