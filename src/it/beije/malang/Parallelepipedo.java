package it.beije.malang;

public class Parallelepipedo {

	
	private int larghezza;
	private int lunghezza;
	private int profondit�;
	private int volume; 
		
	public Parallelepipedo(int larghezza) {
		this(larghezza, 1);
	}
	
	public Parallelepipedo(int larghezza, int lunghezza) {
		this(larghezza, lunghezza, 1);
	}
		
	public Parallelepipedo(int larghezza, int lunghezza, int profondit�) {
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
		this.profondit� = profondit�;
		this.volume = larghezza * lunghezza * profondit�;
	}
	
	public int getLarghezza() {
		return this.larghezza;
	}
	public int getLunghezza() {
		return this.lunghezza;
	}
	public int getProfondit�() {
		return this.profondit�;
	}
	
	public int getVolume() {
		return volume; 
	}
}
