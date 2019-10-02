package it.beije.malang.natura;

public class Umano extends Animale implements Onnivoro {
	
	public static void main(String args[]) {
		
		Umano uomo = new Umano();
		
		uomo.setEta(33.5);
		System.out.println("L'uomo ha "+uomo.getEta()+" anni.\n");
		
		uomo.mangiaTutto();
	}

	@Override
	public void mangiaCarne() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mangiaErba() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mangiaTutto() {
		System.out.println("Mangio un po' di tutto!");

	}

	@Override
	public void respirare() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mangiare() {
		// TODO Auto-generated method stub

	}

}
