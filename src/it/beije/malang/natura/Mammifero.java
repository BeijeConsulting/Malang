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
		if(this.isVegetariano() == true && this.isCarnivoro() == true) {
			System.out.println("Onnivoro");
		} else if (this.isVegetariano() == true) {
			System.out.println("Vegetariano");
		}else if (this.isCarnivoro() == true) {
			System.out.println("Carnivoro");
		}else System.out.println("Me magno l'aria");
		
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
