package it.beije.malang.natura;

public class Colomba extends Uccelli {

	public void main(String[] args) {
		Colomba colomba = new Colomba();
		
		//salmone.setEta(3);		
		colomba.respirare();
		colomba.mangiare();
		colomba.vola();
		System.out.println("La colomba ha " + colomba.setEta(3));
		
		
	}
	public int setEta(int eta) {
		super.setEta(eta);	
		return eta;
	}
	

	@Override
	public void respirare() {
		System.out.println("La coloma respira");
		
		
	}

	@Override
	public void mangiare() {
		System.out.println("La coloma mangia");
		
	}
	@Override
	public boolean vola() {
		System.out.println("La coloma vola");
		return true;
	}

	

}

