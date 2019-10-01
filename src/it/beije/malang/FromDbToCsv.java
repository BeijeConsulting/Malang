package it.beije.malang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

public class FromDbToCsv {
	public  void fromDbToCsv() {
		ArrayList<Contatto> contatti = new ArrayList<Contatto>();
		Connection conn = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "vittorio.123");
			System.out.println("connection ? " + !conn.isClosed());
			
			Statement stmt = conn.createStatement();
			
			String query = "SELECT * FROM rubrica";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Contatto contatto = new Contatto();
				contatto.setId(rs.getInt("id"));
				contatto.setCognome(rs.getString("cognome"));
				contatto.setNome(rs.getString("nome"));
				contatto.setEmail(rs.getString("email"));
				contatto.setTelefono(rs.getString("telefono"));
				
				contatti.add(contatto);
			}
			
			BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("C:\\prova_java_io\\rubrica2.txt"));
			bufferedWriter1.write("Rubrica dei contatti\n");
				
			String firstRow ="COGNOME;NOME;COGNOME NOME;EMAIL;TELEFONO\n";// "COGNOME"	"NOME"	"TELEFONO"
			bufferedWriter1.write(firstRow);
				
				for (Contatto cols : contatti) {
					StringBuilder row = new StringBuilder("\"");
					row.append(cols.getCognome()).append('"');
					row.append(';').append('"');
					row.append(cols.getNome()).append('"');
					row.append(';').append('"');
					row.append(cols.getCognome()+ " " +cols.getNome()).append('"');
					row.append(';').append('"');
					row.append(cols.getEmail()).append('"');
					row.append(';').append('"');
					row.append(cols.getTelefono()).append('"').append('\n');
					
					bufferedWriter1.write(row.toString());
				}

				bufferedWriter1.close();	
			
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
	}
	public static void main(String[] args) {
		FromDbToCsv esporta = new FromDbToCsv();
		esporta.fromDbToCsv();
	}

}
