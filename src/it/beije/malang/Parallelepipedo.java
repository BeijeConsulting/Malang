package it.beije.malang;

public class Parallelepipedo {

	private double lunghezza;
	private double larghezza;
	private double profondità;
	private double volume;
	
	public Parallelepipedo(double lunghezza) {
		this(lunghezza, 1); // calls constructor with 2 parameters
	}
	
	public Parallelepipedo(double lunghezza, double larghezza) {
		this(lunghezza, larghezza, 1); // calls constructor with 3 parameters
	}
	
	public Parallelepipedo(double lunghezza, double larghezza, double profondità) {
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
		this.profondità = profondità;
		System.out.println("calcolo il volume...");
		volume = lunghezza*larghezza*profondità;
		}
	public void print() {
		System.out.println(lunghezza + " " + larghezza + " " + profondità);
	}
	
	public double getVolume() {
		return volume;
	}
	public static void main(String[] args) {
		Parallelepipedo p = new Parallelepipedo(15,3,4);
		p.print();
		System.out.println(p.getVolume());
		System.out.println(p.getVolume());
		System.out.println(p.getVolume());
		System.out.println(p.getVolume());
		System.out.println(p.getVolume());
		System.out.println(p.getVolume());
	}
		
}

