package it.beije.malang.natura;

public abstract class Mammiferi extends Animale {
	public int numeroDiZampe(int numero) {
		return numero;
	}
	public abstract void respirare();
	public abstract void mangiare();
	public abstract void bere();
}
