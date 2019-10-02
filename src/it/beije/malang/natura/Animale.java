package it.beije.malang.natura;

public abstract class Animale implements Onnivoro {
	
	private double eta;
	public double getEta() {
		return eta;
	}
	
	public void setEta(double eta) {
		this.eta = eta;
	}
	
	public void mangiaCarne() {
		System.out.println("Sono carnivoro");
	}
	
	public void mangiaErba() {
		System.out.println("Sono erbivoro");
	}
	
	public abstract void respirare();
}
