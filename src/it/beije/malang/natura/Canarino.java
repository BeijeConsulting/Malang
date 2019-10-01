package it.beije.malang.natura;

public class Canarino extends Volatile {

	public static void main (String... args) {
		Canarino c = new Canarino();
		c.mangiare();
		c.volare();
		c.respirare();
	}

	@Override
	public void mangiare() {
		System.out.println("Il canarino mangia i vermi");

	}

}
