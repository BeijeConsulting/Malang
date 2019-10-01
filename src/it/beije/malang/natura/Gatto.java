package it.beije.malang.natura;


public class Gatto extends Mammifero {
	
	public static void main (String... args) {
		Gatto g = new Gatto();
		g.partorire();
		g.mangiare();
		g.respirare();
	}


	@Override
	public void mangiare() {
		System.out.println("Il gatto mangia il pesce");

	}

}
