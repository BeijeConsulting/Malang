package it.beije.malang.natura;

public class Mucca extends Mammifero implements Erbivoro {
	
	public void mangiaErba() {
		System.out.println("mangio erba \n");
	}
	
	public static void main(String[] args) {
		
		Mucca m = new Mucca();
		System.out.println("io sono una mucca e..: \n");
		m.Parto();
		m.mangiaErba();
	}

}
