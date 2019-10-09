package it.beije.malang.natura;

public class Orso implements Carnivoro, Erbivoro{
	
	public void mangiaCarne() {
		System.out.println("L'orso mangia la carne");
		}
	
	public void mangiaErba() {
		System.out.println("L'orso mangia l'erba");
		}
	
	
	
	public static void main(String[] args) {
		
		Orso orso = new Orso();
		
		orso.mangiaCarne();
		orso.mangiaErba();
	
	}
}
