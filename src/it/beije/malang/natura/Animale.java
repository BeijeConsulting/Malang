package it.beije.malang.natura;

public abstract class Animale {
	
	private double eta;
	public double getEta() {
		return eta;
	}
	public double setEta(double eta) {
		return this.eta=eta;
	}
	public abstract void respirare();
	public abstract void mangiare();

}
