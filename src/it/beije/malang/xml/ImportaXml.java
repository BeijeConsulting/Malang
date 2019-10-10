package it.beije.malang.xml;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import it.beije.malang.Contatto;
import it.beije.malang.database.ConnectionFactory;
import it.beije.malang.xml.ParserContatto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImportaXml extends ParserContatto {

	public static void main(String[] args) {
		Connection conn = null;
		
		
		
		try {
			conn = ConnectionFactory.getConnection();
			System.out.println("connection ? " + !conn.isClosed());
			Statement stmt = conn.createStatement();
			
			//conn.createStatement()
			 
//		    stmt.execute("CREATE TABLE xml(\n" +
//		         "  id integer primary key auto_increment,\n" +
//		         "  contatto_id varchar(25) not null unique,\n" +
//		         "  cognome varchar(50) not null,\n" +
//		         "  nome varchar(25) not null,\n" +
//		         " telefono varchar(25) not null,\n" +
//		         " email varchar(25) not null,\n" +
//		         ")");
			
			String tabella = "CREATE TABLE IF NOT EXISTS xml (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nome varchar(25), cognome varchar(25), telefono varchar(25), email varchar(25))";
			 int rs = 0;
			System.out.println( "rs= " + (rs = stmt.executeUpdate(tabella)));
			File file = new File("C:\\temp\\contatti.xml");
//			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder builder = factory.newDocumentBuilder();
//			Document xmlDoc = builder.parse(file);
			
			 List<Contatto> ricevuto = new ArrayList<Contatto>(); 
			 ricevuto =  readFile("C:\\temp\\contatti.xml");
			 
			//String query = "SELECT * FROM rubrica";
			//ResultSet rs = stmt.executeQuery(stmt);
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
		//System.out.println("numero contatti : " + contatti.size());
	


	}

}
