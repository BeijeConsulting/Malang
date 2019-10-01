package it.beije.malang.natura;

public class Scimmia extends Mammifero{
	
	

	public static void main(String[] args) {
		
		Scimmia scimmia = new Scimmia();
		
		scimmia.mangiare();
		scimmia.respirare();
		
		System.out.println("La scimmia è incinta ? : " + scimmia.isPregnant());
		
		Scimmia figlio = scimmia.partorire();
		if(figlio == null)
			System.out.println("La scimmia non ha partorito");
		else
			System.out.println("La scimmia ha dato vita");

	}

	@Override
	public void respirare() {
		System.out.println("La scimmia respira con i polmoni attraverso naso e bocca");
	}

	@Override
	public void mangiare() {
		System.out.println("La scimmia mangia le banane");
	}

	@Override
	public Scimmia partorire() {
		if(isPregnant) {
			if(Math.random() > 0.5)
				return new Scimmia();
			else
				return null;
		}
		else {
			return null;
		}
	}

}
