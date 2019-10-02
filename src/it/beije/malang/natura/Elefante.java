package it.beije.malang.natura;

public class Elefante extends Mammiferi implements Erbivoro {

	public void mangiare() {
		mangiaErba();
	}
	public void mangiaErba() {
		System.out.println("L'elefante mangia l'erba");
	}
	
	public void camminare() {
		System.out.println("L'elefante cammina lentamente con " + getNumeroZampe());
	}
	public static void main(String[] args) {
		Elefante elefante = new Elefante();
		elefante.setNumeroZampe(4);
		elefante.mangiare();
		elefante.camminare();
		
	}

}
