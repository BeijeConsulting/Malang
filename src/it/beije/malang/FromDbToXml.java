package it.beije.malang;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class FromDbToXml {
	public void writeXml(List<Contatto> cont) {

		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("contatti");
			doc.appendChild(rootElement);
			
		

			// staff elements
			Element contatto = doc.createElement("contatto");
			rootElement.appendChild(contatto);

			// set attribute to staff element

			// shorten way
			// staff.setAttribute("id", "1");

			// firstname elements
			Element nome = doc.createElement("nome");
			nome.appendChild(doc.createTextNode(cont.get(0).getNome()));
			
			contatto.appendChild(nome);
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<questo è:"+contatto);
			//lastname elements
			Element cognome = doc.createElement("cognome");
			cognome.appendChild(doc.createTextNode(cont.get(0).getCognome()));
			contatto.appendChild(cognome);

			// nickname elements
			Element email = doc.createElement("email");
			email.appendChild(doc.createTextNode(cont.get(0).getEmail()));
			contatto.appendChild(email);

			// salary elements
			Element telefono = doc.createElement("telefono");
			telefono.appendChild(doc.createTextNode(cont.get(0).getTelefono()));
			contatto.appendChild(telefono);



			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			//StreamResult result = new StreamResult(new File("C:\\prova_java_io\\rubrica3.xml"));

			//Output to console for testing
			StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		List<Contatto> x= new ArrayList<>();
		Contatto contatto = new Contatto();
		
		contatto.setNome("roberto");
		contatto.setCognome("joseph");
		contatto.setEmail("roberto@joseph.it");
		contatto.setTelefono("3355453");
		
		x.add(contatto);
		
		FromDbToXml gg= new FromDbToXml();
		gg.writeXml(x);
	}
}
