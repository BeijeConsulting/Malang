package it.beije.malang;
import java.io.PrintWriter;
import java.util.*;
import java.io.*;

public class ContattiSovrascritti {

  public static void main(String[] args) throws IOException {

    File file = new File ("C:\\temp\\prova8.txt");
    PrintWriter printWriter = new PrintWriter (file);
    String firstRow = "\"NOME\"\t\"COGNOME\"\t\"TELEFONO\"\t\"E-MAIL\"\n";
    printWriter.println (firstRow);
    Scanner scan = new Scanner(System.in);
    System.out.println("quani contatti vuoi inserire?");
    int num_contatti = scan.nextInt();
    while(num_contatti > 0) {
    	Scanner scan_due = new Scanner(System.in);
    	System.out.println("inserisci il Nome del contatto");
    	String nome = scan_due.nextLine();
    	
    	System.out.println("inserisci il Cognome del contatto");
    	String cognome = scan_due.nextLine();
    	
    	System.out.println("inserisci il Numero del contatto");
    	String numero = scan_due.nextLine();
    	
    	System.out.println("inserisci il E-Mail del contatto");
    	String e_mail = scan_due.nextLine();
    	printWriter.println (nome + "\t" + cognome + "\t" + numero + "\t" + e_mail); 
        num_contatti -= 1;
    }
    printWriter.close ();
  }
}