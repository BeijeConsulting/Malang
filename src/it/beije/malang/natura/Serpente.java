package it.beije.malang.natura;

public class Serpente extends Rettile {

	public static void main(String[] args) {
		Serpente serp=new Serpente();
		
		serp.mangiare();
		serp.respirare();
		serp.doNothing();
		
		Animale prova=new Serpente();
		Serpente s=(Serpente)prova;
		
		s.doNothing();

	}

	@Override
	public void respirare() {
		System.out.println("respiro come un rettile");
	}

	@Override
	public void mangiare() {
		System.out.println("mangio come un rettile");
		
	}

}
