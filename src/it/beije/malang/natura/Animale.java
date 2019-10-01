package it.beije.malang.natura;

public abstract class Animale {
	
	private double eta=6;
	public double getEta() {
		return eta;
	}
	
	
	public void setEta(double eta) {
		this.eta=eta;
	}
	
	
	public abstract void respirare();
	public abstract void mangiare();
	
	


}
