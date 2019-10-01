package it.beije.malang.natura;

public class Piccione extends Uccelli{
	public Piccione() {
		super(6);
	}
	
	public void mangiare() {
		System.out.println("I piccioni mangiano il mangime");
	}
	
	public void altezza() {
		System.out.println("Posso raggiungere i" + super.altezzaRaggiunta + "metri");
	}
	
	public static void main(String[] args) {
		Piccione piccione = new Piccione();
		piccione.altezza();
		piccione.mangiare();
		piccione.setEta(4);
		System.out.println("Il piccione ha " + piccione.getEta() + "anni");
	}

}
