package it.beije.malang.natura;

public abstract class Mammiferi extends Animale {
	
	int numeroZampe;
	
	public void setNumeroZampe(int numeroZampe) {
		this.numeroZampe = numeroZampe;
	}
	public int getNumeroZampe() {
		return numeroZampe;
	}
	public void respirare() {
		System.out.println("Sono un mammifero e respiro");
	}
	
	public abstract void camminare();
	
	
	
}
