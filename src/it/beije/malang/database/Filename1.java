package it.beije.malang.database;


	
	import java.io.FileWriter;
	import java.io.IOException;
	public class Filename1 {
		
	public class Filename {   
	}
	  public static void main(String[] args) {  
		
				 String[][] string = new String[][] { {"maria", "lodi", "321045789", "maria@libero.it"} ,{"zeudy", "palumbo", "3207894561" , "zeudy@gmail.com"}};
				 String s = "";
			
			   for (int i=0 ; i<string.length; i++) { //prima dimensione  array
				   for (int j=0;j<string[i].length;j++)// seconda dimensione array
					   s+=string[i][j];
				   System.out.println(s);
				   s=""; // resetta
				   
				   
				   
				   
				   
				   
				   
				   
				   
			   }
			   
			   
			   
		  
		  
		 
	    try {  
	      FileWriter myWriter = new FileWriter("C:\\NEW\\filename.txt");
	      myWriter.write("nome" + ";"+  "\t" + "cognome" + ";"  +"\t" + "telefono" + ";"+ "\t"+ "e-mail");
	  
	      
	      myWriter.close();
	      
	      
	      
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    } 
	  }  
	} 
	

