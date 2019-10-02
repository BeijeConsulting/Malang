package it.beije.malang.natura;

public class Gatto extends Mammiferi {

	public static void main(String[] args) {
		Gatto gatto = new Gatto();
//		gatto.setEta(3);
		gatto.respirare();
		gatto.mangiare();
		gatto.haPelo();
		
		
		System.out.println("Il gatto ha " + gatto.setEta(5));
		
		
	}
	public int setEta(int eta) {
		super.setEta(eta);	
		return eta;
	}

	@Override
	public void respirare() {
		System.out.println("Il gatto respira con i polmoni");
		
	}

	@Override
	public void mangiare() {
		System.out.println("Il gatto mangia carne");
		
	}

	@Override
	public boolean haPelo() {
		System.out.println("Il gatto ha pelo");
		return true;
	}

	

}
