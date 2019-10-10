package it.beije.malang.xml;




import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import it.beije.malang.database.ConnectionFactory;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class xmlImport {

	public static void main(String[] args) {
		Connection conn = null;
		try {
 	   
			conn = ConnectionFactory.getConnection();
			System.out.println("connection ? " + !conn.isClosed());
    	   
	   		Connection connect = null;
	   		Statement s = null;

//			Class.forName("com.mysql.jdbc.Driver");
//			connect =  DriverManager.getConnection("jdbc:mysql://localhost/mydatabase" +
//					"?user=root&password=root");
			
			s = conn.createStatement();
			
			String sql = "SELECT * FROM rubrica";
			
			ResultSet rec = s.executeQuery(sql);
			

			String strPath = "C:\\temp\\contatti.xml";

			DocumentBuilderFactory documentFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder documentBuilder = documentFactory
					.newDocumentBuilder();

			// define root elements
			Document rubrica = documentBuilder.newDocument();
			

			Element contatto = rubrica.createElement("contatto");
			rubrica.appendChild(contatto);

			int iRows = 0;
			while((rec!=null) && (rec.next()))
            {   
				
				++iRows;
				
				// Row
				Element sRows = doc.createElement("Rows");
				contatto.appendChild(sRows);
				
				// Attributes
				Attr sAttrID = doc.createAttribute("id");
				sAttrID.setValue(String.valueOf(iRows));
				sRows.setAttributeNode(sAttrID);

				// CustomerID
				Element sCustomerID = doc.createElement("CustomerID");
				sCustomerID.appendChild(doc.createTextNode(rec.getString("CustomerID")));
				sRows.appendChild(sCustomerID);
				
				// Name
				Element sName = doc.createElement("Name");
				sName.appendChild(doc.createTextNode(rec.getString("Name")));
				sRows.appendChild(sName);
				
				// Email
				Element sEmail = doc.createElement("Email");
				sEmail.appendChild(doc.createTextNode(rec.getString("Email")));
				sRows.appendChild(sEmail);
				
				// CountryCode
				Element sCountryCode = doc.createElement("CountryCode");
				sCountryCode.appendChild(doc.createTextNode(rec.getString("CountryCode")));
				sRows.appendChild(sCountryCode);
				
				// Budget
				Element sBudget = doc.createElement("Budget");
				sBudget.appendChild(doc.createTextNode(rec.getString("Budget")));
				sRows.appendChild(sBudget);
				
				// Used
				Element sUsed = doc.createElement("Used");
				sUsed.appendChild(doc.createTextNode(rec.getString("Used")));
				sRows.appendChild(sUsed);
				
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

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}