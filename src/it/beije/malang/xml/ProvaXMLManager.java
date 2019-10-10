package it.beije.malang.xml;
import it.beije.malang.database.entities.Contatto;
//import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ProvaXMLManager {
	
	public static void main(String... args) throws ClassNotFoundException, SQLException, IOException {
		//File f= new File("C:\\temp\\DatabaseManager.txt");
		try {
		XMLManager.getConnection();
		List <Contatto> list= new ArrayList<>();
		//list=XMLManager.letturaFile(f);
		list=ParserContatto.readFile("C://temp//contatti.xml");
		XMLManager.importDati(list);
		XMLManager.exportDati();
		
		} catch (ClassNotFoundException cnfEx) {
		cnfEx.printStackTrace();
		} catch (SQLException sqlEx) {
		sqlEx.printStackTrace();
		} 	
	}

}
