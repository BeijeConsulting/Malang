package it.beije.malang.database;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import it.beije.malang.Contatto;

public class ImportExportCsv {

	public static void main(String[] args) {
		List<Contatto> contatti = new ArrayList<Contatto>();

		Connection conn = null; //bisogna dichiarare e inizializzare conn
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			conn = ConnectionFactory.getConnection(); //accede alla classe ConnectionFactory e poi carica la classe del driver JDBC, così non ci serve più la riga successiva
			//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije007");
			System.out.println("connection ? " + !conn.isClosed());
			Statement stmt = conn.createStatement();
			
			/*******************Chiamata a inserisce()**************************/
//			int r = stmt.executeUpdate(inserisce()); //Passo il metodo inserisce a executeUpdate
//			System.out.println("rows affected : " + r);
			
			/*******************Inizio chiamata a seleziona()**************************/
//			ResultSet rs = stmt.executeQuery(query());//Passo il metodo seleziona a executeQuery, gli indici partono da 1 con ResultSet 
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
			
/*******************Chiamata al metodo importCsv()**************************/
			
				
//			 
//				String tabella = "CREATE TABLE IF NOT EXISTS prova (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nome varchar(25), cognome varchar(25), telefono varchar(25), email varchar(25))"; 
//				 stmt.executeUpdate(tabella);
				 
				/////////////////
				 
				 	
					////////
			String tabella = "CREATE TABLE IF NOT EXISTS prova (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nome varchar(25), cognome varchar(25), telefono varchar(25), email varchar(25))"; 
			ResultSet rs = stmt.executeQuery(tabella);
					File f = new File("C:\\temp\\prova.txt");
					//System.out.println("il file è presente ? " + f.exists());
					try {
						
						
						FileReader fileReader = new FileReader(f);
						BufferedReader bufferedReader = new BufferedReader(fileReader);
						List<String[]> rows = new ArrayList<String[]>();
						while (bufferedReader.ready()&& rs.next()) {
							rows.add(bufferedReader.readLine());
							
							String[] cols = row.split(";"); // spezza la riga del file .txt in colonne
							rows.add(cols);
							
						}
						
//						System.out.println("rows : " + rows.size());
//						System.out.println(rows);
						bufferedReader.close();
						
						/***********************/
//						String tabella = "CREATE TABLE IF NOT EXISTS prova (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nome varchar(25), cognome varchar(25), telefono varchar(25), email varchar(25))"; 
//						 //stmt.executeUpdate(tabella);
//						ResultSet rs = stmt.executeQuery(tabella);
//						while (rs.next()) {
//							
//							(rs.getInt("id"));
//							(rs.getString("cognome"));
//							rows.setNome(rs.getString("nome"));
//							rows.setEmail(rs.getString("email"));
//							rows.setTelefono(rs.getString("telefono"));
//
//							
//
//							contatti.add(contatto);
//						}
						// Con la PreparedStatement bisogna sostituire i valori da mettere nella db con punti di domanda "?"
//					
						PreparedStatement preparedStatement = conn.prepareStatement("UPDATE prova SET nome = ? WHERE id = ?");
						preparedStatement.setString(1, args[0]);
						preparedStatement.setInt(2, Integer.parseInt(args[1]));

						int r = preparedStatement.executeUpdate();
						System.out.println("rows affected : " + r);

						rs.close();
						stmt.close();
						
					} catch (IOException ioException) {
						System.out.println("Il file specificato non esiste");
					}
				// stmt.executeUpdate(importTxt(tabella));
					
					
	              
	
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

		//System.out.println("numero contatti : " + contatti.size());
	}
	
	/*******Metodo per l'inserimento nel DB*******/
	public static String inserisce() {
		String insert = "INSERT INTO rubrica (cognome, nome, email, telefono) VALUES ('bianchi', 'paolo', 'paolo@bianchi.it', '3471564518')";

		return insert;
	}
	
	/*******Metodo per la selezione dal DB*******/
	public static String seleziona() {
		String query = "SELECT * FROM rubrica";
		
		return query;
	}
	
	
	
//	 public static String importTxt()
//	 
//	    {
//		 String insertCsv = "INSERT INTO rubrica (cognome, nome, email, telefono) VALUES ('bianchi', 'paolo', 'paolo@bianchi.it', '3471564518')";
//	                
//	    }  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/******************************Es. Stackoverflow**************************/
	/*
	  String sql = " INSERT INTO TABLE_(name,email,phone,id) VALUES(?,?,?,?) ";


try { 
        BufferedReader bReader = new BufferedReader(new FileReader("C:\\temp\\prova.txt"));
        String line = ""; 
        while ((line = bReader.readLine()) != null) {
            try {

                if (line != null) 
                {
                    String[] array = line.split(";");
                    for(String result:array)
                    {
                        System.out.println(result);
 //Create preparedStatement here and set them and excute them
                PreparedStatement ps = yourConnecionObject.createPreparedStatement(sql);
                 ps.setString(1,str[0]);
                 ps.setString(2,str[1]);
                 ps.setString(3,str[2]);
                 ps.setString(4,strp[3])
                 ps.excuteUpdate();
                 ps. close()
   //Assuming that your line from file after split will folllow that sequence

                    }
                } 
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            finally
            {
               if (bReader == null) 
                {
                    bReader.close();
                }
            }
        }
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    }

	 */
	
}
