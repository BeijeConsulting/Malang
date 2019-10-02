package it.beije.malang.natura;


public class Gatto extends Mammifero {
	
	public static void main (String... args) {
		Gatto g = new Gatto();
		System.out.println("Sono un gatto, appartengo ai mammiferi e quindi: ");
		g.partorire();
		g.respirare();
		g.mangiaCarne();
	}

}
