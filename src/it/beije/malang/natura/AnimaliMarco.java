package it.beije.malang.natura;

public abstract class AnimaliMarco {
	
	private double eta;
	public double getEta() {
		return eta;
	}
	public void setEta(double eta) {
		this.eta = eta;
	}
	public abstract void riproduzione();
	public abstract void movimento();
	public abstract void respirazione();

}


