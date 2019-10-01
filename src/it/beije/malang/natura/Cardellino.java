package it.beije.malang.natura;

public class Cardellino extends Uccello {

	public static void main(String[] args) {
		Cardellino card=new Cardellino();
		card.setEta(10);
		card.mangiare();
		card.respirare();
		System.out.println(card.getEta());
		card.fly();

	}
	
	public void setEta(int eta) {
		super.setEta(eta);
	}

	@Override
	public void respirare() {
		System.out.println("respiro");
		
	}

	@Override
	public void mangiare() {
		System.out.println("mangio");
		
	}

}
