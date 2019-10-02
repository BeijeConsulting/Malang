package it.beije.malang.natura;

public class Squalo extends Pesci implements Carnivoro {
	
	public static void main(String args[]) {
		
		Squalo shark = new Squalo();
		
		shark.respirare();
		shark.mangiare();
		
		shark.setEta(12.5);
		System.out.println("Lo squalo ha "+shark.getEta()+" anni.\n");
		
		shark.mangiaCarne();
	}
	
	public void respirare() {
		System.out.println("Lo squalo respira in movimento.\n");
	}
	
	public void mangiare() {
		System.out.println("Lo squalo divora una preda.\n");
	}
	
	public void mangiaCarne() {
		System.out.println("Mangio solo carne!");
	}
}
