package it.beije.malang.natura;

public class Salmone extends Pesci {

	
	public void nuotare() {
		System.out.println("I salmoni nuotano contro corrente");
	}
	
	public void mangiare() {
		System.out.println("I salmoni mangiano i pesci pi� piccoli");
	}
	
	public void setEta(int eta) {
		super.setEta(eta);
	}

	public static void main(String[] args) {
	
		Salmone salmon = new Salmone();
		salmon.setEta(1);
		System.out.println("L'et� � pari a " + salmon.getEta());
		salmon.nuotare();
		salmon.mangiare();
		salmon.respirare();

	}

}
