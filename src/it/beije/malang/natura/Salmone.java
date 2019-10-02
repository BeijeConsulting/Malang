package it.beije.malang.natura;

public class Salmone extends Pesci{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salmone salmone = new Salmone(); 
		//salmone.setEta(3);		
		salmone.respirare();
		salmone.mangiare();
		salmone.nuota();
		System.out.println("Il salmone ha " + salmone.setEta(43));
		
		
	}
	public int setEta(int eta) {
		super.setEta(eta);	
		return eta;
	}
	

	@Override
	public void respirare() {
		System.out.println("Il salmone è un pesce che respira con le branchie chiuse");
		
	}

	@Override
	public void mangiare() {
		System.out.println("Il salmone mangia principalmente pesci, crostacei, seppie e calamari");
		
		
	}

	@Override
	public boolean nuota() {
		System.out.println("Il salmne nuota ");
		return true;
	}

}

