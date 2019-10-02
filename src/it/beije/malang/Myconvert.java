package it.beije.malang;

public class Myconvert {
	public static double parseDouble(String num) {
	   double val = 0;
	   int val1 =   0;
	   String tra = ".";
	   double numero = 2.4;
	   double somma = 0;
	   
		for (int  i = 0; i < num.length(); i++) {//primo parte
			 char  c = num.charAt(i);
			 //if () {
				 
			 //}
				if (c >= '0' &&  c <= '9' )  {
			     val1 = (val1*10) + (c - 48);
			     
			     
			     }
      		       System.out.println(val1);
      		  
      		       
      		       
      		       
      		       
      		    
			
		
		     throw new IllegalArgumentException("il valore inserito non è numerico");
		     
		
				
				
				
				
				
			}
			
			
			for (int a = 0; a <num.length(); a++) {// seconda parte
			  char d = num.charAt(a);
		    if (a >= '0' && a <= '9') {
		    	val =(val/10)+(d - 46);
		    	System.out.println(val);
		    	
		   
		    	
		    	
		    }
		    	
		   
		    	
			}	
		    	
		    	
		    		
			
			}
	
		

		  
			//double.parseDouble(String s)
			
			public static void main(String[] args) {
	
			
		
		

		System.out.println(parseDouble("56"));
		//System.out.println(parseDouble("5.6"));
		//System.out.println(parseDouble("53.76"));
		
	
			}
	
	
	

}
