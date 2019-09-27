package it.beije.malang.database;

import java.io.*;

import java.sql.*;

public class SQLManager {
	
	//("jdbc:mysql://localhost:3306/malang?serverTimezone=CET", "root", "Beije09")
	
	private Connection conn;
	private Statement stmt;
	
	public SQLManager(String...creds) throws ClassNotFoundException, SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(creds[0], creds[1], creds[2]);
			stmt = conn.createStatement();
		}
		catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
			throw cnfEx;
		}
		catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
			throw sqlEx;
		}
		
	}
	
	public SQLManager(Connection conn) throws ClassNotFoundException, SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = conn;
			stmt = conn.createStatement();
		}
		catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
			throw cnfEx;
		}
		catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
			throw sqlEx;
		}
	}
	
	public void setConnection(Connection conn) {
		this.conn = conn;
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public ResultSet query(String query) throws SQLException {
		return stmt.executeQuery(query);
	}
	
	public void close() throws SQLException {
		conn.close();
		stmt.close();
	}
	
	public void importCSV(File csv) throws FileNotFoundException, IOException, SQLException {
		
		BufferedReader reader = null;
		
		try {
			
			String table = csv.getName().replace(".txt", "");
			
			//TODO: check table existance
			//stmt.executeQuery("SELECT * FROM " + table + ";");
			
			reader = new BufferedReader(new FileReader(csv));
	        while(reader.ready()){
	            String[] row = reader.readLine().split(";");
	            if(row.length == 4) {
	                
//	            	StringBuilder queryBuilder = new StringBuilder();
//	            	queryBuilder.append("INSERT INTO ").append(table)
//	            	 	.append(" VALUES(null,").append(row[0]).append(",")
//	            	 	.append(row[1]).append(",")
//	            	 	.append(row[2]).append(",")
//	            	 	.append(row[3]).append(");");
//	            	
//	            	System.out.println(queryBuilder.toString());
//	            	
//	            	stmt.executeUpdate(queryBuilder.toString());
	            	
	            	PreparedStatement ps = conn.prepareStatement("INSERT INTO " + table + " VALUES(null,?,?,?,?);");
	            	ps.setString(1, row[0]);
	            	ps.setString(2, row[1]);
	            	ps.setString(3, row[2]);
	            	ps.setString(4, row[3]);
	            	
	            	System.out.println(ps.toString());
	            	
	            	ps.executeUpdate();
	            	
	            }
	            else
	                throw new IOException();
	        }
		}
		catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
			throw fnfEx;
		}
		catch(IOException ioEx) {
			ioEx.printStackTrace();
			throw ioEx;
		}
		finally {
			reader.close();
		}
		
	}
}
