package it.beije.malang.natura;

public class Mucca implements Erbivoro {
	
	public void mangiaErba() {
		System.out.println("La mucca mangia l'erba");
		}
	
	public static void main(String[] args) {
		Mucca mucca = new Mucca();
		
		mucca.mangiaErba();
		mucca.numStom();
	}
}
