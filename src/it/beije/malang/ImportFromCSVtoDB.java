package it.beije.malang;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ImportFromCSVtoDB {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malang?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","Marcomattia1");
			Statement stmt = conn.createStatement();
			
			File f = new File("C:\\Users\\Fulginiti\\Desktop\\dbtocsv.txt");
			FileReader fileReader = new FileReader(f);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String[] cols = null;
			int x = 0;
			
			while(bufferedReader.ready()) {
				String row = bufferedReader.readLine();
				if(x>0) {
					cols = row.split("\t");
					String id = cols[0];
					String nome = cols[1];
					String cognome = cols[2];
					String email = cols[3];
					String telefono = cols[4];
					String insert = "INSERT INTO rubrica VALUES (null,'"+nome+"','"+cognome+"','"+email+"','"+telefono+"');";
					int uno = stmt.executeUpdate(insert);
				
				}
				x++;
			}
			
			bufferedReader.close();
			conn.close();
			
			
			
			//System.out.println(conn.isValid(0));//serve per vedere se si connette al database
			
			
			
//			String query = "SELECT * FROM rubrica";
//			ResultSet fetch = stmt.executeQuery(query);
//			
//			FileWriter fileWriter = new FileWriter("C:\\Users\\Fulginiti\\Desktop\\DB to CSV.txt");
//			String firstRow = "ID\"\t\"NOME\"\t\"COGNOME\"\t\"E-MAIL\"\t\"TELEFONO\"\n";
//			BufferedWriter writer = new BufferedWriter(fileWriter);
//			writer.write(firstRow);
//			
//			while(fetch.next()) {
//				int id = fetch.getInt("id");
//				String nome = fetch.getString("nome");
//				String cognome = fetch.getString("cognome");
//				String email = fetch.getString("email");
//				String telefono = fetch.getString("telefono");
//				String result = id + "\t" + nome + "\t" + cognome + "\t" + email + "\t" + telefono + "\n";
//				
//				writer.write(result);
//			}
//			writer.close();
//			
		}catch(Exception e){
			System.out.println();
			e.printStackTrace();
		}
	}

}
