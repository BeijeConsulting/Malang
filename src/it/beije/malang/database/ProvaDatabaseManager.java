package it.beije.malang.database;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProvaDatabaseManager {
	
	public static void main(String... args) throws ClassNotFoundException, SQLException, IOException {
		File f= new File("C:\\temp\\DatabaseManager.txt");
		try {
		DatabaseManager.getConnection();
		ArrayList <String[]> list= new ArrayList<>();
		list=DatabaseManager.letturaFile(f);
		DatabaseManager.importDati(list);
		DatabaseManager.exportDati();
		
		} catch (ClassNotFoundException cnfEx) {
		cnfEx.printStackTrace();
		} catch (SQLException sqlEx) {
		sqlEx.printStackTrace();
		} 
		
	}

}
