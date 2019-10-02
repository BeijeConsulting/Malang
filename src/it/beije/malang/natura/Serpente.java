package it.beije.malang.natura;

public class Serpente extends Rettile {

	public static void main(String... args) {
		Serpente s = new Serpente();
		System.out.println("Sono un serpente, appartengo ai rettili e: ");
		s.mangiaCarne();
		s.respirare();
		s.depositoUova();
	}

}
