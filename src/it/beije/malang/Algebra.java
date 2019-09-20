package it.beije.malang;

import java.util.ArrayList;
public class Algebra {
	
	     public static void main(String[] args) {
	   
	    int somma= 0; //
	    
	    int [] numeri ={1, 2, 3, 10 };//ARRAY ADDIZIONE
	    int [] number = {10,2,4,2};//ARRAY MOLTIPLICAZIONE
	    int [] number1 ={10, 15,};//ARRAY SOTTRAZIONE
	    int [] number2 = {30,10, 3};//DIVISIONE
	    
	    /*int x = number[0];//numero molt
	    int y = number[1];//numero molt
	    int z = x*y;// moltiplicazione*/
	    
	    int z=number[0]; // moltiplicazione
	    for (int i=1;i<number.length;i++)
	        z=z*number[i];
	        
	    int x =number1[0];// sottrazione
	    for (int a=1; a<number1.length; a++)
	        x=x-number1[a];
	        
	    int y =number2[0];//divisione
	    for (int c=1; c<number2.length; c++)
	        y =y/number2[c];
	    
	    
	    
	   // int num1 = number1[0];//numero SOTT
	    //int num2 = number1[1];//numero SOTT
	    //int num3 = num1-num2;//SOTTRAZIONE
	    
	    //int num4 =number2[0];//numero div
	    //int num5 =number2[1];//numero div
	    //int num6 =num4 / num5;//DIVISIONE
	    
	    
	    
	    //for (int i = 0; i< numeri.length; i++) {
	    for (int d : numeri) { //
	    somma= somma +d;//
	   
	   }
	    System.out.println("SOMMA: "+ somma); //
	    somma=0;//
	    //for (int e : number) {
	       
	        //no:   int c = a*b;
	        //no:   moltiplicazione = 
	       
	       
	         System.out.println("MOLTIPLICAZIONE:" + z);
	         System.out.println("SOTTRAZIONE:" + x);
	         System.out.println("DIVISIONE:" +y);
	    }
	    }
	      
	    
	   // }
	   
	     
	  //public static void main(String[] args) {
	    //int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    //int x = myNumbers[1][0];
	    //System.out.println(x);  
	 	
	
	  

