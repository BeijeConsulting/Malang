package it.beije.malang.natura;

public class Uomo extends Mammiferi implements Carnivoro, Erbivoro {

	public void mangiare() {
		System.out.println("Gli umani sono onnivori, infatti ");
		mangiaCarne();
		System.out.print("e");
		mangiaErba();
	}
	
	public void mangiaCarne() {
		System.out.print(" mangiano carne");
	}
	
	public void mangiaErba() {
		System.out.print(" mangiano erba");
		
	}
	
	public void camminare() {
		System.out.println("Gli esseri umani camminano su " + getNumeroZampe() + " piedi");
	}
	public static void main(String[] args) {
		
		Uomo u = new Uomo();
		u.setNumeroZampe(4);
		u.mangiare();
		u.camminare();
		

	}

}
