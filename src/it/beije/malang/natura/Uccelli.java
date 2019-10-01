package it.beije.malang.natura;

public abstract class Uccelli extends Animale {

	int altezzaRaggiunta;
	public Uccelli(int altezzaRaggiunta) {
		this.altezzaRaggiunta = altezzaRaggiunta;
	}
	public void respirare() {
		System.out.println("Gli uccelli respirano");
	}
}
