package it.beije.malang.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DatabaseManager {
	
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
	
	
	public static void importDati(ArrayList <String[]> dati) throws ClassNotFoundException, SQLException
	{
		String updateDati[]=null;
		Connection conn=DatabaseManager.getConnection();
		PreparedStatement preparedStatement= conn.prepareStatement("INSERT INTO rubrica (cognome,nome,email,telefono) VALUES (?,?,?,?)");
		
		for (int i=0;i<dati.size();i++)
		{
			int k=1;
			updateDati=new String[4];
			updateDati=dati.get(i);
			for (int j=0;j<updateDati.length;j++)
			{
				preparedStatement.setString(k, updateDati[j]);
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
		
		File f = new File ("C://temp//DatabaseManager2.txt");
		FileWriter fileWriter = new FileWriter(f);
		Connection conn = null;
		try {
			conn = DatabaseManager.getConnection();
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

