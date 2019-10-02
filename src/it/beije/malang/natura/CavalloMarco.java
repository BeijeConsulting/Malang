package it.beije.malang.natura;

public class CavalloMarco extends MammiferiMarco{
	
	public void setEta(int eta) {
		super.setEta(eta);
	}
	
	public void riproduzione() {
		System.out.println("il parto avviene in modo classico, espellendo il puledro partorendo sulle 4 zampe \n");
	}
	public void movimento() {
		System.out.println("galoppo,trotto o passo sono le tipologie di spostamento \n");
	}
	public void respirazione() {
		System.out.println("normali narici collegate con trache e polmoni,respirzione classica \n");
	}
	
	public static void main(String... args) {
		CavalloMarco cavallo = new CavalloMarco();
		cavallo.setEta(10);
		cavallo.riproduzione();
		cavallo.movimento();
		cavallo.respirazione();
	}
}

