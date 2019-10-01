package it.beije.malang.natura;

public abstract class Mammifero extends Animale{
	
	protected boolean isPregnant;
	
	public boolean isPregnant() {
		return isPregnant;
	}

	public abstract Mammifero partorire();
	
}
