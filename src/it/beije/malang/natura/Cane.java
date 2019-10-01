package it.beije.malang.natura;

public class Cane extends Mammifero {
	
	public void mangiare() {
		System.out.println("eating like a dog");
	}

	public void respirare() {
		System.out.println("breathing like a dog");
	}
	
	public static void main(String [] args) {
		System.out.println("cane:");
		Cane cane=new Cane();
		System.out.println(cane.getEta());
		cane.mangiare();
		cane.respirare();
		cane.walk();
	}
	 
}
