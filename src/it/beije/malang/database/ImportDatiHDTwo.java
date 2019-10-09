package it.beije.malang.database;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import it.beije.malang.Contatto;


public class ImportDatiHDTwo {
	
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
	        	        
			NodeList nodeList = element.getElementsByTagName("Contatto");
			System.out.println("Contatto num : " + nodeList.getLength());
			
			Element e = null;
	        for (int i = 0; i < nodeList.getLength(); i++) {
	        	e = (Element)nodeList.item(i);
	        	//System.out.println(e.getTagName());

	        	Contatto c = new Contatto();
	        	NodeList nomi = e.getElementsByTagName("Nome");
	        	String nome = nomi.item(0).getTextContent();
	        	c.setNome(nome);
	        	NodeList cognomi = e.getElementsByTagName("Cognome");
	        	String cognome = cognomi.item(0).getTextContent();
	        	c.setCognome(cognome);
	        	NodeList emails = e.getElementsByTagName("Email");
	        	String email = emails.item(0).getTextContent();
	        	c.setEmail(email);
	        	NodeList telefoni = e.getElementsByTagName("Telefono");
	        	String telefono = telefoni.item(0).getTextContent();
	        	c.setTelefono(telefono);

	        	contatti.add(c);
	        }
	        
        	System.out.println(contatti.size());			
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contatti;
	}
	
	public static void main(String argv[]) throws Exception {
		List <Contatto> rubrica = new ArrayList<>();
		rubrica=readFile("C:\\temp\\file2.xml");
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		System.out.println("is open?" + factory.isOpen());
		
		Session session = factory.openSession();
		
		CriteriaQuery<Contatto> cq = session.getCriteriaBuilder().createQuery(Contatto.class);
        cq.from(Contatto.class);
		
		for (int i=0; i<rubrica.size();i++)
		{
			Contatto appoggio = new Contatto();
			Transaction transaction = session.beginTransaction();
			appoggio.setCognome(rubrica.get(i).getCognome());
			appoggio.setNome(rubrica.get(i).getNome());
			appoggio.setEmail(rubrica.get(i).getEmail());
			appoggio.setTelefono(rubrica.get(i).getTelefono());
			transaction.commit();
			session.save(appoggio);
			
		}
		
		
		session.close();
		factory.close();
		System.out.println("is open?" + factory.isOpen());
	}
}