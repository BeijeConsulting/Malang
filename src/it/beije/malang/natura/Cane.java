package it.beije.malang.natura;

public class Cane extends Mammiferi{


	public void camminare() {
		System.out.println("Cammino su " + getNumeroZampe() + " zampe");
	}
	
	public void mangiare() {
		System.out.println("Mangio tutto il giorno");
	}
	
	public static void main(String[] args) {

		Cane labrador = new Cane();
		labrador.setNumeroZampe(4);
		
		labrador.camminare();
		labrador.mangiare();
		labrador.respirare();
		
	}
	
}
