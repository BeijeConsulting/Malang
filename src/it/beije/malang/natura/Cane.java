package it.beije.malang.natura;

public class Cane extends Mammifero {
	public static void main(String... args) {
		Cane c = new Cane();
		c.partorire();
		c.mangiare();
		c.respirare();
		c.setEta(10);
		System.out.println(c.getEta());
	}

	@Override
	public void partorire() {
		System.out.println("Il cane essendo un mammifero, partorisce");

	}

	@Override
	public void respirare() {
		System.out.println("Il cane respira con il naso");

	}

	@Override
	public void mangiare() {
		System.out.println("Il cane mangia i croccantini");
	}
	public void setEta(int eta) {
		super.setEta(eta);
		
	}
	

}
