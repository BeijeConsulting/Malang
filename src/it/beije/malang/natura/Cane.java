package it.beije.malang.natura;


public  class Cane extends Mammiferi implements Onnivoro {
	
	
	
	public void mangiaCarne() {
		System.out.println("mangia carne");
		
	}


	public void mangiaErba() {
		System.out.println("mangia erba");
		
	}

	public void respirare() {
		System.out.println("respira dal naso");
		
	}
		
	
	
	public void setEta(double eta) {
		super.setEta(eta);
	}
	
	public void mangiare() {
		System.out.println("vegetale");
	}


	public static void main(String[] args) {

		Cane cane = new Cane();
		cane.cibo();
		
	}
}