package it.beije.malang.natura;

public class BalenaMarco extends CetaceiMarco {
	
	public void setEta(int eta) {
		super.setEta(eta);
	}
	
	public double getEta() {
		return (int)super.getEta();
	}
	
	public void riproduzione() {
		System.out.println("le balene partoriscono il cucciolo facendolo fuoriuscire dalla pinna caudale");
	}
	public void movimento() {
		System.out.println("col movimento ondulatorio caudale si sposta nuotando");
	}
	public void respirazione(){
		System.out.println("tramite branchie respira accumolando ossigeno e tramite lo sfiatatoio espellono l'acqua in eccesso");
	}
	
	public static void main(String... args) {
		
		BalenaMarco balena = new BalenaMarco();
		balena.setEta(10);
		balena.riproduzione();
		balena.movimento();
		balena.respirazione();
		
	}
}
