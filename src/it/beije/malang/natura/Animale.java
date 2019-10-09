package it.beije.malang.natura;


// prima classe astratta
public abstract class Animale {
	
	private double eta;
	
	public double getEta() {
		return eta;
	}
	
	public void setEta(double eta) {
		this.eta = eta;
	}
	
	public abstract void respirare();
	public abstract void mangiare();




}


