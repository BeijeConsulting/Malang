package it.beije.malang.CORBOSIERO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import it.beije.malang.database.entities.Contatto;

public class XMLManager {
	
	public static List<Contatto> readFile(String pathFile) {
		List<Contatto> contatti = new ArrayList<Contatto>();
		
		try {
	        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(pathFile));
	        Element element = document.getDocumentElement();	        
	        //System.out.println(element.getTagName());     
	        	        
			NodeList nodeList = element.getElementsByTagName("contatto");
			System.out.println("contatto num : " + nodeList.getLength());
			
			Element e = null;
	        for (int i = 0; i < nodeList.getLength(); i++) {
	        	e = (Element)nodeList.item(i);
	        	//System.out.println(e.getTagName());

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
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return contatti;
	}

	//TODO: firebase, Bean analyzer
}
