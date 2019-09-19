package it.beije.malang.morracinese;

import java.util.Scanner;

public class MorraCinese {

	public static void main(String[] args) {
		System.out.println("Inserisci la mossa del giocatore 1");
		Scanner read = new Scanner(System.in);
		String mossa = read.nextLine();
		Giocatore g1 = new Giocatore(mossa);
		System.out.println("Inserisci la mossa del giocatore 2");
		String mossa2 = read.nextLine();
		Giocatore g2 = new Giocatore(mossa2);
		read.close();
		confronta(g1, g2);
	}
	
	public static void confronta(Giocatore g1, Giocatore g2) {
		if (g1.getGiocata().equals(g2.getGiocata())) System.out.println("pareggio");
		
		if (g1.getGiocata().equals("carta")) {
			if (g2.getGiocata().equals("sasso")) System.out.println("giocatore 1 vince");
			else System.out.println("giocatore 2 vince");
		}
		
		if (g1.getGiocata().equals("sasso")) {
			if (g2.getGiocata().equals("forbice")) System.out.println("giocatore 1 vince");
			else System.out.println("giocatore 2 vince");
		}
		
		if (g1.getGiocata().equals("forbice")) {
			if (g2.getGiocata().equals("carta")) System.out.println("giocatore 1 vince");
			else System.out.println("giocatore 2 vince");
		}
		
	}
}
