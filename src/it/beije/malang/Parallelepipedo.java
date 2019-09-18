package it.beije.malang;

public class Parallelepipedo {
	private int larghezza;
	private int lunghezza;
	private int profondit�;
	
	public Parallelepipedo(int larghezza) {
		this.larghezza=larghezza;
		this.lunghezza=1;
		this.profondit�=1;
	}
	
	public Parallelepipedo(int larghezza, int lunghezza) {
		this.larghezza=larghezza;
		this.lunghezza=lunghezza;
		this.profondit�=1;
	}
	
	
	public Parallelepipedo(int larghezza , int lunghezza, int profondit�){
		this.larghezza=larghezza;
		this.lunghezza=lunghezza;
		this.profondit�=profondit�;
	}
	
	public int getLarghezza() {
		return larghezza;
	}
	
	public int getLunghezza() {
		return lunghezza;
	}
	
	public int getProfondit�() {
		return profondit�;
	}
	
	public int getVolume() {
		return larghezza*lunghezza*profondit�;
	}
}
