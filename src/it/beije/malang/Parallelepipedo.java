package it.beije.malang;

public class Parallelepipedo {
	private int larghezza;
	private int lunghezza;
	private int profonditā;
	
	public Parallelepipedo(int larghezza) {
		this.larghezza=larghezza;
		this.lunghezza=1;
		this.profonditā=1;
	}
	
	public Parallelepipedo(int larghezza, int lunghezza) {
		this.larghezza=larghezza;
		this.lunghezza=lunghezza;
		this.profonditā=1;
	}
	
	
	public Parallelepipedo(int larghezza , int lunghezza, int profonditā){
		this.larghezza=larghezza;
		this.lunghezza=lunghezza;
		this.profonditā=profonditā;
	}
	
	public int getLarghezza() {
		return larghezza;
	}
	
	public int getLunghezza() {
		return lunghezza;
	}
	
	public int getProfonditā() {
		return profonditā;
	}
	
	public int getVolume() {
		return larghezza*lunghezza*profonditā;
	}
}
