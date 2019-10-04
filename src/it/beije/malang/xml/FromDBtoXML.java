package it.beije.malang.xml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import it.beije.malang.Contatto;

public class FromDBtoXML {
	public static void main(String[] args) throws IOException {

		List<Contatto> contatti = new ArrayList<Contatto>();
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije14");
			System.out.println("connection ? " + !conn.isClosed());
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM rubrica";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Contatto contatto = new Contatto();

				contatto.setId(rs.getInt("id"));
				contatto.setCognome(rs.getString("cognome"));
				contatto.setNome(rs.getString("nome"));
				contatto.setEmail(rs.getString("email"));
				contatto.setTelefono(rs.getString("telefono"));
				contatti.add(contatto);
			}

			rs.close();
			stmt.close();

			File output=new File("C:\\prova\\outputesDB.csv");
			if (!output.exists())
			{
				output.createNewFile();
			}
			FileWriter filewriter=new FileWriter(output);
			BufferedWriter writer=new BufferedWriter(filewriter);

			Collections.sort(contatti);

			for (Contatto contatto:contatti) {
				writer.write(contatto.toString());
				writer.newLine();
			}
			writer.close();


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


		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("contatti");
			doc.appendChild(rootElement);

			for (Contatto contattoAL:contatti) {
				Element contatto = doc.createElement("contatto");
				rootElement.appendChild(contatto);

				Element nome = doc.createElement("nome");
				nome.appendChild(doc.createTextNode(contattoAL.getNome()));
				contatto.appendChild(nome);

				// lastname elements
				Element cognome = doc.createElement("cognome");
				cognome.appendChild(doc.createTextNode(contattoAL.getCognome()));
				contatto.appendChild(cognome);

				// nickname elements
				Element email = doc.createElement("email");
				email.appendChild(doc.createTextNode(contattoAL.getEmail()));
				contatto.appendChild(email);

				// salary elements
				Element telefono = doc.createElement("telefono");
				telefono.appendChild(doc.createTextNode(contattoAL.getTelefono()));
				contatto.appendChild(telefono);
			}


			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("C:\\prova\\test1.xml"));

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

