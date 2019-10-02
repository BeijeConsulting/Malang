package it.beije.malang.natura;

public class Ornitorinco extends Mammifero {

	public static void main(String[] args) {
		Ornitorinco o = new Ornitorinco();
		System.out.println("Sono un ornitorinco, appartengo ai mammiferi e: ");
		o.mangiaCarne();
		o.respirare();
		o.partorire();
		

	}
	
	public void partorire() {
		System.out.println("Anche se sono un mammifero, non partorisco");
	}

}
