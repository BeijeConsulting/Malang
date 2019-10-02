package it.beije.malang.natura;


public abstract class Pesci extends Animale {
	

	public void setEta(double eta) {
		super.setEta(eta);
	}
	

	public abstract void acqua();
	public void respirare() {
		System.out.println("branchie");
	}
}