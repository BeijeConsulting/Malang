package it.beije.malang.natura;


public abstract class Uccelli extends Animale {
	
	public abstract void respirare();
	public abstract void mangiare();
	public  void volo() {
		System.out.println("vola");
	}

}