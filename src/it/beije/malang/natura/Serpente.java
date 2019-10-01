package it.beije.malang.natura;

public class Serpente extends Rettile {

	public static void main(String... args) {
		Serpente s = new Serpente();
		s.mangiare();
		s.respirare();
		s.depositoUova();
	}
	@Override
	public void mangiare() {
		System.out.println("Il serpente mangia i topi");
	}

}
