package it.beije.malang.natura;


public  class Canarino extends Uccelli implements Onnivoro {
	
	
//impelmento onnivoro che eredita carnivoro ed erbivoro quindi devo dargli un corpo, non lo do ad onnivoro perche messo di default
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
		System.out.println("mangia semi e vermi");
	}

	
//potevo fare direttamente un metodo così, richiamando quello dell'interfaccia che è default quindi non lo definisco
	
//	public void mangiare() {
//	Canarino canarino = new Canarino();
//	canarino.cibo();
//	}
//	
//	
//	
	

	public static void main(String[] args) {

		Canarino canarino = new Canarino();
		canarino.mangiare();
		canarino.volo();
		
	}


}