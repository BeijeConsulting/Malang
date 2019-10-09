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

	
	public static void main(String args[]) {

		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("Contatti");
			doc.appendChild(rootElement);
			
			// staff elements
			Element staff = doc.createElement("Contatto");
			rootElement.appendChild(staff);

			// set attribute to staff element
			Attr attr = doc.createAttribute("id");
			attr.setValue("1");
			staff.setAttributeNode(attr);

			// shorten way
			// staff.setAttribute("id", "1");

			// firstname elements
			Element firstname = doc.createElement("nome");
			firstname.appendChild(doc.createTextNode("Letizia"));
			staff.appendChild(firstname);

			// lastname elements
			Element lastname = doc.createElement("cognome");
			lastname.appendChild(doc.createTextNode("Mangano"));
			staff.appendChild(lastname);

			// nickname elements
			Element nickname = doc.createElement("telefono");
			nickname.appendChild(doc.createTextNode("3404263555"));
			staff.appendChild(nickname);

			// salary elements
			Element salary = doc.createElement("email");
			salary.appendChild(doc.createTextNode("letiziamangano1@icloud.com"));
			staff.appendChild(salary);
			
			

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("C:\\temp\\filetest.xml"));

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