package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class rubrica {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?serverTimezone=CET","root","Beije06");
		System.out.println("conenction ?"+ !conn.isClosed());
		Statement stmt =conn.createStatement();
		
//		String insert="INSERT INTO rubrica VALUES('9','Rossi','luca','asd@libero.it','340123456');";
//		int r=stmt.executeUpdate(insert);		
		
		String query="select * from rubrica";
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
		System.out.println("ID :"+rs.getInt("id"));//rs.getInt(0);
		System.out.println("cognome :"+rs.getString("cognome"));//rs.getString(1);
		System.out.println("nome :"+rs.getString("nome"));//rs.getString(2);
		System.out.println("email :"+rs.getString("email"));//rs.getString(3);
		System.out.println("telefono :"+rs.getString("telefono"));//rs.getString(4);
			
		}

		}catch(ClassNotFoundException cnfex) {
			cnfex.printStackTrace();
		}catch(SQLException sqlex){
			sqlex.printStackTrace();
		}
		
		

	}

}
