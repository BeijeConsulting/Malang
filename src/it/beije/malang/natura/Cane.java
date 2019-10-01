package it.beije.malang.natura;

public class Cane extends Mammiferi {
	
	public static void main(String args[]) {
		
		Cane carlino = new Cane();
		
		carlino.respirare();
		carlino.mangiare();
		
		carlino.setEta(6.5);
		System.out.println("Il cane ha "+carlino.getEta()+" anni.\n");
	}
	
	public void respirare() {
		System.out.println("Il cane sbuffa dal muso.\n");
	}
	
	public void mangiare() {
		System.out.println("Il cane mangia voracemente.\n");
	}
}
