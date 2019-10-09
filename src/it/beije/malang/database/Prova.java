package it.beije.malang.database;
public class Prova {
     
	 public static void main(String[] args) {
	 String[][] string = new String[][] { {"maria", "lodi", "321045789", "maria@libero.it"} ,{"zeudy", "palumbo", "3207894561" , "zeudy@gmail.com"}};
	 String s = "";
  // System.out.println(string[0][0]);	
   
   for (int i=0 ; i<string.length; i++) {
	   for (int j=0;j<string[i].length;j++)
		   s+=string[i][j];
	   System.out.println(s);
	   s="";
	   
	   
	   
   }
	   

   }
	
	 }
			

