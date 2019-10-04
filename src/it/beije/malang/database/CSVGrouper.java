package it.beije.malang.database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class CSVGrouper {
	
	public static class GroupRecord {
		
		private String phone;
		private StringBuilder emails = new StringBuilder();
		private String name;
		private String surname;
		
		public GroupRecord(String phone, String name, String surname, String email) {
			this.phone = phone;
			this.name = name;
			this.surname = surname;
			emails.append(email + ",");
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			if(name.equals("") || name == null)
				this.name = "";
			else
				this.name = name;
		}
		
		public String getSurname() {
			return surname;
		}
		
		public void setSurname(String surname) {
			if(surname.equals("") || surname == null)
				this.surname = "";
			else
				this.surname = surname;
		}
		
		public void addMail(String email) throws Exception {
			if(email == null || email.equals(""))
				throw new Exception();
			else
				emails.append(email + ",");
		}
		
		public String emailsToString() {
			return emails.length() == 0 ? "" : emails.deleteCharAt(emails.length() - 1).toString();
		}
		
	}

	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = null;
        BufferedWriter writer = null;
        Map<String, GroupRecord> rubrica = new HashMap<>();

        try{

            reader = new BufferedReader(new FileReader("C:\\Esercizi\\corbosiero1.csv"));
            writer = new BufferedWriter(new FileWriter("C:\\Esercizi\\corbosiero3.csv"));

            while(reader.ready()){
            	String[] row = reader.readLine().split(";");
                String phone = row[2];
                
                if(phone.equals(""))
                	continue;
  
                if(!rubrica.containsKey(phone)) { 
                    rubrica.put(phone, new GroupRecord(row[2], row[0], row[1], row[3]));
                }
                else {
                    rubrica.get(phone).addMail(row[3]);
                    rubrica.get(phone).name = row[0];
                    rubrica.get(phone).surname = row[1];
                }
            }
            
            for (Map.Entry<String, GroupRecord> entry : rubrica.entrySet()) {
            	GroupRecord record = entry.getValue();
                writer.write(entry.getKey() + ";" + record.emailsToString() + ";" +
                		record.name + ";" + record.surname + "\n\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
            	reader.close();
                writer.close();
            }
            catch(IOException ex) {
            	ex.printStackTrace();
            	throw ex;
            }
        }

	}

}
