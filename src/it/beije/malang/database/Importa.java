package it.beije.malang.database;
import java.io.BufferedReader;
import it.beije.malang.database.ConnectionFactory;
import java.io.File;
import java.io.FileNotFoundException;
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

public class Importa {
	public static void main(String[] args) {
	String sql = " INSERT INTO prova_(name,email,phone,id) VALUES(?,?,?,?) ";
	Connection conn = null; //bisogna dichiarare e inizializzare conn

	try { 
	       
		conn = ConnectionFactory.getConnection(); //accede alla classe ConnectionFactory e poi carica la classe del driver JDBC, così non ci serve più la riga successiva
		
		System.out.println("connection ? " + !conn.isClosed());
		Statement stmt = conn.createStatement();
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
	                PreparedStatement ps = conn.prepareStatement(sql);
	                 ps.setString(1,args[0]);
	                 ps.setString(2,args[1]);
	                 ps.setString(3,args[2]);
	                 ps.setString(4,args[3]);
	                 ps.executeUpdate();
	                 ResultSet rs = stmt.executeQuery(sql);
	                 ps. close();
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

	
}
}
