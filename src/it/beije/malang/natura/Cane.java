package it.beije.malang.natura;

public class Cane extends Mammifero implements Carnivoro{

	@Override
	public void respirare() {
		System.out.println("O2");		
	}

	@Override
	public void mangiare() {
		System.out.println("Croccantini");		

	}

	@Override
	public void mangiaCarne() {
		System.out.println("Bistecca");	
	}

}
