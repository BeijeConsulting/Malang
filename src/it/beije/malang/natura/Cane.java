package it.beije.malang.natura;

public class Cane implements Carnivoro {

	public void Respira() {
		System.out.println("Respiro!");
	}
	
	public static void main(String[] arg) {
		Cane c = new Cane();
		c.Respira();
	}
	
	
 
}
