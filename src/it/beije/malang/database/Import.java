package it.beije.malang.database;


import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
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


	public class Import {


	  

	  public static void main(String[] args)throws Exception {
		  //Connection conn = null;
	    String id = "1";
	    String fileName = "C:\\temp\\prova.txt";
	    
	    FileInputStream fis = null;
	    PreparedStatement pstmt = null;
	    Connection conn = null;
	    try {
	    	conn = ConnectionFactory.getConnection(); //accede alla classe ConnectionFactory e poi carica la classe del driver JDBC, così non ci serve più la riga successiva
			
			System.out.println("connection ? " + !conn.isClosed());
			Statement stmt = conn.createStatement();
	      File file = new File(fileName);
	      fis = new FileInputStream(file);
	      pstmt = conn.prepareStatement("insert into prova(cognome, nome, telefono) values (?, ?, ?)");
	      pstmt.setString(1, id);
	      pstmt.setString(2, fileName);
	      pstmt.setAsciiStream(3, fis, (long) file.length());
	      pstmt.executeUpdate();
	      conn.commit();
	    } catch (Exception e) {
	      System.err.println("Error: " + e.getMessage());
	      e.printStackTrace();
	    } finally {
	      pstmt.close();
	      fis.close();
	      conn.close();
	    }
	  }
	

	           

}
