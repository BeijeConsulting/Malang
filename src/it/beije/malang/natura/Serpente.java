package it.beije.malang.natura;

public class Serpente extends Rettile {

	public static void main(String... args) {
		Serpente s = new Serpente();
		s.mangiare();
		s.respirare();
		s.depositoUova();
	}
	@Override
	public void depositoUova() {
		System.out.println("Il serpente deposita le uova");

	}

	@Override
	public void respirare() {
		System.out.println("Il serpente respira con il naso");

	}

	@Override
	public void mangiare() {
		System.out.println("Il serpente mangia i topi");
	}

}
