package it.beije.malang;

public class Parallelepipedo {

	
	private int larghezza;
	private int lunghezza;
	private int profonditā;
	private int volume; 
		
	public Parallelepipedo(int larghezza) {
		this(larghezza, 1);
	}
	
	public Parallelepipedo(int larghezza, int lunghezza) {
		this(larghezza, lunghezza, 1);
	}
		
	public Parallelepipedo(int larghezza, int lunghezza, int profonditā) {
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
		this.profonditā = profonditā;
		this.volume = larghezza * lunghezza * profonditā;
	}
	
	public int getLarghezza() {
		return this.larghezza;
	}
	public int getLunghezza() {
		return this.lunghezza;
	}
	public int getProfonditā() {
		return this.profonditā;
	}
	
	public int getVolume() {
		return volume; 
	}
}
