package it.beije.malang;

import java.util.Scanner;

public class FirstClass2 {
	public static void main(String[] args) {
	
		
			    Scanner myObj1= new Scanner(System.in);   //0 number 1
			    
			    Scanner myObj2 = new Scanner(System.in);  //1 number 2
			    Scanner myObj3 = new Scanner(System.in);
			    String userName3;
			 
			    System.out.println("scegli l'operazione da fare"); 
			    
			    System.out.println("+: somma");
			    System.out.println("-: sottrazione");
			    System.out.println("*: moltiplicazione");
			    System.out.println("/: divisione");
			   
			
			    int c = 0;
			    
			    System.out.println("operazione");  //1
			    userName3 = myObj3.nextLine();   
			  
			    
			    System.out.println("primo numero");  //2
			    int number1 = myObj1.nextInt();  
			    
			    System.out.println("secondo numero"); 
			    int number2 = myObj2.nextInt(); 
			    
			    System.out.println(number1);
			    System.out.println(number2);
			    System.out.println(userName3);
			    
			    
			 
			      
			    if ( userName3.equals("+") ) {
			    	c = (number1 + number2);
			    	System.out.println(c);
			     
			     
			    } else if (userName3.equals("-")) {
			    	 c = (number1- number2);
			    	System.out.println(c);
			    	
			    	
			    } else if (userName3.equals("*")) {
			    	
			       c = (number1* number2);
			       System.out.println(c);
			       
			       
			   }  else {
			    c =number1 /number2;
			      System.out.println(c);
			
			     
			      }  
			    
			    
			 
			    	
						    
			  
			    }			    
	

			   
}
