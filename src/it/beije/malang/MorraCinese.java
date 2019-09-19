package it.beije.malang;
import java.util.*;

public class MorraCinese {
	
	static Scanner t = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Giocatore giocatoreUno = new Giocatore();
		Giocatore giocatoreDue = new Giocatore();
		
		System.out.print("Inserisci il nome del primo giocatore: ");
		giocatoreUno.name = t.nextLine();
		System.out.print("Inserisci il nome del secondo giocatore: ");
		giocatoreDue.name = t.nextLine();
		System.out.print(giocatoreUno.getName() + " scrivi la tua mossa ");
		giocatoreUno.mossaUtente = t.nextLine();
		System.out.print(giocatoreDue.getName() + " scrivi la tua mossa ");
		giocatoreDue.mossaUtente = t.nextLine();
		
		if(!giocatoreUno.getMossaUtente().equalsIgnoreCase("Carta") && !giocatoreUno.getMossaUtente().equalsIgnoreCase("Sasso") && !giocatoreUno.getMossaUtente().equalsIgnoreCase("Forbice")
			&& !giocatoreDue.getMossaUtente().equalsIgnoreCase("Carta") && !giocatoreDue.getMossaUtente().equalsIgnoreCase("Sasso") && !giocatoreDue.getMossaUtente().equalsIgnoreCase("Forbice")){
			
			System.out.println("Il valore inserito non è corretto.\n **** PARTITA TERMINATA ****");
		}else {
			if(giocatoreUno.getMossaUtente().equalsIgnoreCase("sasso")) {
				if(giocatoreDue.getMossaUtente().equalsIgnoreCase("sasso"))
					System.out.println("Avete scelto la stessa mossa.\nNon c'è un vincitore");
				else if(giocatoreDue.getMossaUtente().equalsIgnoreCase("forbice"))
					System.out.println("Complimenti! " + giocatoreUno.getName() + " hai vinto");
				else
					System.out.println("Complimenti! " + giocatoreDue.getName() + " hai vinto");
			}else if(giocatoreUno.getMossaUtente().equalsIgnoreCase("carta")) {
				if(giocatoreDue.getMossaUtente().equalsIgnoreCase("carta"))
					System.out.println("Avete scelto la stessa mossa.\nNon c'è un vincitore");
				else if(giocatoreDue.getMossaUtente().equalsIgnoreCase("forbice"))
					System.out.println("Complimenti! " + giocatoreDue.getName() + " hai vinto");
				else
					System.out.println("Complimenti! " + giocatoreUno.getName() + " hai vinto");		
			}else if(giocatoreUno.getMossaUtente().equalsIgnoreCase("forbice")) {
				if(giocatoreDue.getMossaUtente().equalsIgnoreCase("forbice"))
					System.out.println("Avete scelto la stessa mossa.\nNon c'è un vincitore");
				else if(giocatoreDue.getMossaUtente().equalsIgnoreCase("sasso"))
					System.out.println("Complimenti! " + giocatoreDue.getName() + " hai vinto");
				else
					System.out.println("Complimenti! " + giocatoreUno.getName() + " hai vinto");
					
			}
		}
	
	}
}


class Giocatore{
	
	String mossaUtente;
	String name;
	
	public String getMossaUtente() {
		return mossaUtente;
	}
	
	public String getName() {
		return name;
	}
	
}

