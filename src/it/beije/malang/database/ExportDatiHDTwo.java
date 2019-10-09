package it.beije.malang.database;

import java.io.File;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import it.beije.malang.Contatto;


public class ExportDatiHDTwo {
	
	public static void main(String argv[]) throws Exception {
		try {
		
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		System.out.println("is open?" + factory.isOpen());
		
		Session session = factory.openSession();
		
        CriteriaQuery<Contatto> cq = session.getCriteriaBuilder().createQuery(Contatto.class);
        cq.from(Contatto.class);
        List<Contatto> contatti = session.createQuery(cq).getResultList();
        
		String strPath = "C:\\temp\\File3.xml";

		DocumentBuilderFactory documentFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder documentBuilder = documentFactory
				.newDocumentBuilder();

		// define root elements
		Document doc = documentBuilder.newDocument();
		

		Element ele = doc.createElement("rubrica");
		doc.appendChild(ele);
		int iRows = 0;
		while(iRows<contatti.size()-1)
        {   
			
			
			
			// Row
			Element sRows = doc.createElement("Contatto");
			ele.appendChild(sRows);
			
			// Attributes
			Attr sAttrID = doc.createAttribute("id");
			sAttrID.setValue(String.valueOf(iRows));
			sRows.setAttributeNode(sAttrID);


			// CustomerID
			Element sCustomerID = doc.createElement("ID");
			sCustomerID.appendChild(doc.createTextNode(String.valueOf(contatti.get(iRows).getId())));
			sRows.appendChild(sCustomerID);
			
			// Cognome
			Element sCognome = doc.createElement("Cognome");
			sCognome.appendChild(doc.createTextNode(contatti.get(iRows).getCognome()));
			sRows.appendChild(sCognome);
			
			// Email
			Element sNome = doc.createElement("Nome");
			sNome.appendChild(doc.createTextNode(contatti.get(iRows).getNome()));
			sRows.appendChild(sNome);
			
			Element sIndirizzo = doc.createElement("Email");
			sIndirizzo.appendChild(doc.createTextNode(contatti.get(iRows).getEmail()));
			sRows.appendChild(sIndirizzo);
			
			Element sNumero = doc.createElement("Telefono");
			sNumero.appendChild(doc.createTextNode(contatti.get(iRows).getTelefono()));
			sRows.appendChild(sNumero);

			iRows++;
        }	


		// creating and writing to xml file
		TransformerFactory tff = TransformerFactory
				.newInstance();
		Transformer tf = tff.newTransformer();
		DOMSource domSource = new DOMSource(doc);
		StreamResult streamResult = new StreamResult(new File(strPath));

		tf.setOutputProperty(
				"{http://xml.apache.org/xslt}indent-amount", "2");
		tf.setOutputProperty(OutputKeys.INDENT, "yes");

		tf.transform(domSource, streamResult);

		System.out.println("XML file created!");
		session.close();
		factory.close();
		System.out.println("is open?" + factory.isOpen());
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}