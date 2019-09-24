package it.beije.malang;

//fare una classe che dati 2 valori del gioco della MORRA (carta, forbice, sasso) risponda chi vince (giocatore 1 o 2)

import java.lang.Math.*;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class Morra {
	
	public int segno;
	
	
	// definisco il metodo che mi restituisce un numero random intero
	public static int randInt(int min, int max) {
		  Random rand = new Random();
		  int randomNum = rand.nextInt((max - min) + 1) + min;
		  return randomNum;
		}
	
	
	//definisco il metodo che stabilisce il segno di ogni giocatore
	public void setSegno(int s) {
		segno = s;
	}
	
	//metodo che restituisce il segno tirato
	public int getSegno() {
		return segno;
	}
	
	
	//metodo che stampa il segno tirato
	public static void stampaSegno(int a) {
		
		if (a == 1) {
			System.out.println("carta");
		}
		if (a == 2) {
			System.out.println("sasso");
		}
		if (a == 3) {
			System.out.println("forbice");
		}
		
	}
	
	
	//metodo che stabilisce il vincitore
	public static String vincitore(int a, int b) {
		
		if (a == b) {
			return "pareggio";
		}
		else if (a==1 && b==2) {
			return "giocatore1 vince";
		}
		else if (a==1 && b==3){
			return "giocatore2 vince";
		}
		else if (a == 2 && b==3) {
			return "giocatore1 vince";
		}
		else if (a == 2 && b == 1) {
			return "giocatore2 vince";
		}
		else if (a == 3 && b == 1) {
			return "giocatore1 vince";
		}
		else {
			return "giocatore2 vince";
		}
		
	}
	
	
	public static void main(String[] args) throws IOException  {
		
		// definisco il file da scrivere sul disco
		File f = new File("C:\\temp\\morra.txt");
		PrintWriter scrivi = new PrintWriter(f);
		
		// dichiaro gli oggetti giocatori

		Morra giocatore1 = new Morra();
		Morra giocatore2 = new Morra();
	
		
		
		// simulo 10 partite
		
		scrivi.println("giocatore 1"+ "\t"+ "giocatore2"+ "\t"+"pareggio");
		
		for (int i = 0; i<8; i++) {	
		
			giocatore1.setSegno(randInt(1, 3));
			giocatore2.setSegno(randInt(1, 3));
		
			//System.out.println(giocatore1.getSegno());
			//System.out.println(giocatore2.getSegno());
		
			Morra.stampaSegno(giocatore1.getSegno());
			Morra.stampaSegno(giocatore2.getSegno());
		
						
			System.out.println(vincitore(giocatore1.getSegno(), giocatore2.getSegno()));
			
								
			// stampo i risultati su txt
			if ((vincitore(giocatore1.getSegno(), giocatore2.getSegno())) == "giocatore1 vince") {
				
				scrivi.println("    " + "x");
			}
			else if((vincitore(giocatore1.getSegno(), giocatore2.getSegno())) == "giocatore2 vince"){
				
				scrivi.println("                     " + "x");
			}
			
			else
				scrivi.println("                                    "+"x");
		}
		
		
		
	scrivi.close();
		
		
			
		}
	}
		
		

