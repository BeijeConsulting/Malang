package it.beije.malang.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Animale a = new Cane();
		Animale b = new Gatto();
		//Cane c=(Cane)a;
		//Animale d=new Animale();
		//Cane f=(Cane)d;
		System.out.println("Io sono un cane e mangio: " + a.mangia());
		System.out.println("Io sono un gatto e mangio: " + b.mangia());
	}

}
