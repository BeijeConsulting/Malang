package it.beije.malang.database;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DownloadDatabase {

	public static void main(String[] args) throws IOException {
	File f = new File("C:\\temp\\database2.txt");
	FileWriter fileWriter = new FileWriter(f);
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			Statement stmt = conn.createStatement();
			String query="SELECT * FROM rubrica";
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("connection ? " + !conn.isClosed());
			
			while (rs.next()) {
				
				fileWriter.write(rs.getInt("id")+";");
				fileWriter.write(rs.getString("cognome")+";");
				fileWriter.write(rs.getString("nome")+";");
				fileWriter.write(rs.getString("email")+";");
				fileWriter.write(rs.getString("telefono") + "\n");


			}
			
			fileWriter.close();
			rs.close();
			
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

	}

}