package it.beije.malang.parallelepipedo;

public class Main {

	public static void main(String[] args) {
		Parallelepipedo p1 = new Parallelepipedo(3);
		Parallelepipedo p2 = new Parallelepipedo(3,2);
		Parallelepipedo p3 = new Parallelepipedo(3,2,2);
		
		System.out.print("Il volume del primo parallelepipedo e': ");
		p1.getVolume();
		System.out.print("Il volume del secondo parallelepipedo e': ");
		p2.getVolume();
		System.out.print("Il volume del terzo parallelepipedo e': ");
		p3.getVolume();
		
		System.out.print("L'altezza del primo parallelepipedo e': ");
		p1.getAltezza();
		System.out.print("La larghezza del secondo parallelepipedo e': ");
		p2.getLarghezza();
		System.out.print("La lunghezza del terzo parallelepipedo e': ");
		p3.getLunghezza();
		

	}

}
