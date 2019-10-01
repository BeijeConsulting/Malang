package it.beije.malang.natura;

public class Mammifero extends Vertebrato{
	private boolean vegetariano;
	private boolean carnivoro;
	
	public void setEta(int eta) {
		super.setEta(eta);;
	}
	
	@Override
	public void respirare() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mangiare() {
		// TODO Auto-generated method stub
		
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	public boolean isCarnivoro() {
		return carnivoro;
	}

	public void setCarnivoro(boolean carnivoro) {
		this.carnivoro = carnivoro;
	}
	
	
	
}
