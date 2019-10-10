package it.beije.malang.xml;

import java.io.File;

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


public class CreaRubrica {

	public static void main(String argv[]) {

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
			Attr attr = doc.createAttribute("id");
			attr.setValue("1");
			contatto.setAttributeNode(attr);

			// shorten way
			// staff.setAttribute("id", "1");

			// firstname elements
			Element nome = doc.createElement("nome");
			nome.appendChild(doc.createTextNode("Pippo"));
			contatto.appendChild(nome);

			// lastname elements
			Element cognome = doc.createElement("cognome");
			cognome.appendChild(doc.createTextNode("Gialli"));
			contatto.appendChild(cognome);

			// email elements
			Element email = doc.createElement("email");
			email.appendChild(doc.createTextNode("pippo.gialli@beije.it"));
			contatto.appendChild(email);

			// telefono elements
			Element telefono = doc.createElement("telefono");
			telefono.appendChild(doc.createTextNode("3435466675"));
			contatto.appendChild(telefono);
			
			

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("C:\\temp\\contatti.xml"));

			// Output to console for testing
			//StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}
}