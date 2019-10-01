package it.beije.malang.natura;

public class DelfinoMarco extends MammiferiMarco{
	
	public void setEta(int eta) {
		super.setEta(eta);
	}
	
	public void riproduzione() {
		System.out.println("parto della prole espellendolo dalla pinna caudale in movimento");
	}
	public void movimento() {
		System.out.println("movimento sussultorio della pinna caudale e del corpo");
	}
	public void respirazione() {
		System.out.println("assume ossigeno dalle branchie ed espelle acqua in eccesso dallo sfiatatoio");
	}
	
	public static void main(String... args) {
		
		DelfinoMarco delfino = new DelfinoMarco();
		delfino.setEta(10);
		delfino.riproduzione();
		delfino. movimento();
		delfino.respirazione();
		
		
	}
}
