package it.beije.malang.xml;

import it.beije.malang.xml.Contatto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLManager {
	static File file;
	static int count;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		final Connection conn;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije10");
		} catch (ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
			throw cnfEx;
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
			throw sqlEx;
		}
		
		return conn;
	}
	
	
	public static void importDati(List<Contatto> dati) throws ClassNotFoundException, SQLException
	{
		Connection conn=XMLManager.getConnection();
		PreparedStatement preparedStatement= conn.prepareStatement("INSERT INTO rubrica (cognome,nome,email,telefono) VALUES (?,?,?,?)");
		
		
		for (int i=0;i<dati.size();i++)
		{
			String[] array = new String[4];
			array[0] = dati.get(i).getCognome();
			array[1] = dati.get(i).getNome();
			array[2] = dati.get(i).getEmail();
			array[3] = dati.get(i).getTelefono();
			int k=1;
			for (int j=0;j<array.length;j++)
			{
				preparedStatement.setString(k,array[j]);
				k++;
			}
			preparedStatement.executeUpdate();
		}
		preparedStatement.close();
		conn.close();
	}
	
	public static ArrayList<String[]> letturaFile(File f) throws IOException
	{
		ArrayList <String[]> list = new ArrayList<>();
		String array[] = null;
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringTokenizer tokenizer = null;

		while (bufferedReader.ready())
		{
			tokenizer = new StringTokenizer(bufferedReader.readLine(), ";");
			count=tokenizer.countTokens();
			array=new String[4];
			for(int i=0; i<count; i++)
			{
				array[i]=tokenizer.nextToken();
			}
			list.add(array);
		}
		bufferedReader.close();
		return list;
	}
	
	public static void exportDati() throws IOException {
		
		try {
		 	   
    	    // Connect Database 
	   		Connection connect = null;
	   		Statement s = null;

			Class.forName("com.mysql.cj.jdbc.Driver");
			connect =  DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije10");
			
			s = connect.createStatement();
			
			String sql = "SELECT * FROM rubrica";
			
			ResultSet rec = s.executeQuery(sql);
			

			String strPath = "C:\\temp\\File.xml";

			DocumentBuilderFactory documentFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder documentBuilder = documentFactory
					.newDocumentBuilder();

			// define root elements
			Document doc = documentBuilder.newDocument();
			

			Element ele = doc.createElement("rubrica");
			doc.appendChild(ele);

			int iRows = 0;
			while((rec!=null) && (rec.next()))
            {   
				
				++iRows;
				
				// Row
				Element sRows = doc.createElement("Contatto");
				ele.appendChild(sRows);
				
				// Attributes
				Attr sAttrID = doc.createAttribute("id");
				sAttrID.setValue(String.valueOf(iRows));
				sRows.setAttributeNode(sAttrID);


				// CustomerID
				Element sCustomerID = doc.createElement("ID");
				sCustomerID.appendChild(doc.createTextNode(rec.getString("id")));
				sRows.appendChild(sCustomerID);
				
				// Cognome
				Element sCognome = doc.createElement("Cognome");
				sCognome.appendChild(doc.createTextNode(rec.getString("cognome")));
				sRows.appendChild(sCognome);
				
				// Email
				Element sNome = doc.createElement("Nome");
				sNome.appendChild(doc.createTextNode(rec.getString("nome")));
				sRows.appendChild(sNome);
				
				Element sIndirizzo = doc.createElement("Email");
				sIndirizzo.appendChild(doc.createTextNode(rec.getString("email")));
				sRows.appendChild(sIndirizzo);
				
				Element sNumero = doc.createElement("Telefono");
				sNumero.appendChild(doc.createTextNode(rec.getString("telefono")));
				sRows.appendChild(sNumero);
	
				
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

