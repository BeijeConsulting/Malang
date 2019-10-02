package it.beije.malang.natura;


public  class PesceRosso extends Pesci {
	

	public void setEta(double eta) {
		super.setEta(eta);
	}
	
	public void mangiare() {
		System.out.println("vegetale");
	}
	public void acqua() {
		System.out.println("dolce");
	}

	public static void main(String[] args) {

		PesceRosso pesceRosso = new PesceRosso();

		pesceRosso.setEta(2.1);
		
		pesceRosso.respirare();
		pesceRosso.mangiare();
		pesceRosso.acqua();
		

	}
		


}