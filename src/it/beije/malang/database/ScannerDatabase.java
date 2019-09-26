package it.beije.malang.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import it.beije.malang.Contatto;

public class ScannerDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn=ConnectionFactory.getConnection();
		
		Statement stmt=conn.createStatement();
		
		ArrayList<Contatto> contatti=new ArrayList<Contatto>();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Quanti record vuoi inserire?");
		int d=Integer.valueOf(scanner.nextLine());
		for (int i=0;i<d;i++)
		{
			Contatto contatto=new Contatto();
			System.out.println("Inserisci il nome:");
			contatto.setNome(scanner.nextLine());
			System.out.println("Inserisci il Cognome:");
			contatto.setCognome(scanner.nextLine());
			System.out.println("Inserisci il telefono:");
			contatto.setTelefono(scanner.nextLine());
			System.out.println("Inserisci l'email:");
			contatto.setEmail(scanner.nextLine());
			contatti.add(contatto);
		}
		scanner.close();
		
		for (Contatto contatto:contatti) {
			String query = contatto.getInsertQuery();
			System.out.println(query);
			stmt.execute(query);
		}
		
		conn.close();
		stmt.close();
	}
}
