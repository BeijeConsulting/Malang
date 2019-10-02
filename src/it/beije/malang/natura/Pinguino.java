package it.beije.malang.natura;

public class Pinguino extends Volatile {
	
	public static void main (String... args) {
		Pinguino p = new Pinguino();
		System.out.println("Sono un pinguino ed appartengo ai volatili");
		p.mangiaCarne();
		p.respirare();
		p.volare();
		
	}
	public void volare() {
		System.out.println("Anche se sono un volatile, non so volare");
	}
}
