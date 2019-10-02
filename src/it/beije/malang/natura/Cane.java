package it.beije.malang.natura;

public class Cane extends Mammifero {
	public static void main(String... args) {
		Cane c = new Cane();
		System.out.println("Sono un cane, della famiglia dei mammiferi e quindi: ");
		c.partorire();
		c.respirare();
		c.mangiaCarne();
		c.setEta(10);
		System.out.println(c.getEta());
	}


	public void setEta(int eta) {
		super.setEta(eta);
		
	}
	

}
