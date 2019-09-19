package it.beije.malang;

public class Parallelepipedo {

	
	private int larghezza;
	private int lunghezza;
	private int profondità;
	private int volume; 
		
	public Parallelepipedo(int larghezza) {
		this(larghezza, 1);
	}
	
	public Parallelepipedo(int larghezza, int lunghezza) {
		this(larghezza, lunghezza, 1);
	}
		
	public Parallelepipedo(int larghezza, int lunghezza, int profondità) {
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
		this.profondità = profondità;
		this.volume = larghezza * lunghezza * profondità;
	}
	
	public int getLarghezza() {
		return this.larghezza;
	}
	public int getLunghezza() {
		return this.lunghezza;
	}
	public int getProfondità() {
		return this.profondità;
	}
	
	public int getVolume() {
		return volume; 
	}
}
