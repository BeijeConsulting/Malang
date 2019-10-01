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
	public void mangiare() {
		System.out.println("Il cane mangia i croccantini");
	}
	public void setEta(int eta) {
		super.setEta(eta);
		
	}
	

}
