package it.beije.malang.xml;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import it.beije.malang.Contatto;
import it.beije.malang.database.ConnectionFactory;

import java.sql.PreparedStatement;



public class ParserContatto {

	public static List<Contatto> readFile(String pathFile) {
		List<Contatto> contatti = new ArrayList<Contatto>();
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder builder = factory.newDocumentBuilder();

	        // Load the input XML document, parse it and return an instance of the
	        // Document class.
	        Document document = builder.parse(new File(pathFile));
	        Element element = document.getDocumentElement();	        
	        //System.out.println(element.getTagName());     
	        	        
			NodeList nodeList = element.getElementsByTagName("contatto");
			System.out.println("contatto num : " + nodeList.getLength());

			
			Element e = null;
	        for (int i = 0; i < nodeList.getLength(); i++) {
	        	e = (Element)nodeList.item(i);
	        	//System.out.println(e.getTagName());
	        	//System.out.println(e);

	        	Contatto c = new Contatto();
	        	NodeList nomi = e.getElementsByTagName("nome");
	        	String nome = nomi.item(0).getTextContent();
	        	c.setNome(nome);
	        	
	        	NodeList cognomi = e.getElementsByTagName("cognome");
	        	String cognome = cognomi.item(0).getTextContent();
	        	c.setCognome(cognome);
	        	
	        	NodeList emails = e.getElementsByTagName("email");
	        	String email = emails.item(0).getTextContent();
	        	c.setEmail(email);
	        	
	        	NodeList telefoni = e.getElementsByTagName("telefono");
	        	String telefono = telefoni.item(0).getTextContent();
	        	c.setTelefono(telefono);

	        	contatti.add(c);
	        	
	        	
	        	
	        }
	        
	        System.out.println(contatti);
        	System.out.println(contatti.size());			
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(contatti);
		return contatti;
	}


	public static void main(String[] args) throws Exception {
		
		List<Contatto> contatti = readFile("C:\\temp\\contatti.xml");
		
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			System.out.println("connection ? " + !conn.isClosed());
			
			Statement stmt = conn.createStatement();
			
			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO rubrica ( cognome, nome, email, telefono) VALUES (?,?,?,?)");

		
			for(int i = 0; i<contatti.size(); i++) {
				
				preparedStatement.setString(1, contatti.get(i).getCognome());
				preparedStatement.setString(2, contatti.get(i).getNome());
				preparedStatement.setString(3, contatti.get(i).getEmail());
				preparedStatement.setString(4, contatti.get(i).getTelefono());
				
				System.out.println("AA "+ contatti.get(i).getCognome());
				System.out.println(i);
				
				int r = preparedStatement.executeUpdate();
				System.out.println("rows affected : " + r);
				

				stmt.close();	
			}
			
			

			
		}
		catch (ClassNotFoundException cnfEx) {
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

}
