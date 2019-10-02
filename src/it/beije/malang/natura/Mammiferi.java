package it.beije.malang.natura;


public abstract class Mammiferi extends Animale {
	
	private int eta;

	public void setEta(double eta) {
		super.setEta(eta);
	}
	
	
	public abstract void respirare();
	public abstract void mangiare();

}