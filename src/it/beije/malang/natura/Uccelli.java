package it.beije.malang.natura;


public abstract class Uccelli extends Animale {
	
	private int eta;
	public int getEta() {
		return eta;
	}
	
	public abstract void respirare();
	public abstract void mangiare();

}