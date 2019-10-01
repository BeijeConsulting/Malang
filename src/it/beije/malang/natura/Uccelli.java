package it.beije.malang.natura;


//estensione classe astratta animale
public abstract class Uccelli extends Animale{
	
	private String LunghBecco;
	
	public void setLunghBecco(String LunghBecco) {
		this.LunghBecco = LunghBecco;
	}
	
	public String getLunghBecco() {
		return LunghBecco;
	}
	
	public abstract void migrazione();
	
}
