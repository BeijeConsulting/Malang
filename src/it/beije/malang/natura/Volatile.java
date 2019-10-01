package it.beije.malang.natura;

public abstract class Volatile extends Animale{
	public void volare() {
		System.out.println("I volatili possono volare");
	}
	@Override
	public void respirare() {
		System.out.println("I volatili respirano con il naso");

	}
}
