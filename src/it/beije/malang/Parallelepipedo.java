package it.beije.malang;

public class Parallelepipedo {
	private int larghezza;
	private int lunghezza;
	private int profondità;
	
	public Parallelepipedo(int larghezza) {
		this.larghezza=larghezza;
		this.lunghezza=1;
		this.profondità=1;
	}
	
	public Parallelepipedo(int larghezza, int lunghezza) {
		this.larghezza=larghezza;
		this.lunghezza=lunghezza;
		this.profondità=1;
	}
	
	
	public Parallelepipedo(int larghezza , int lunghezza, int profondità){
		this.larghezza=larghezza;
		this.lunghezza=lunghezza;
		this.profondità=profondità;
	}
	
	public int getLarghezza() {
		return larghezza;
	}
	
	public int getLunghezza() {
		return lunghezza;
	}
	
	public int getProfondità() {
		return profondità;
	}
	
	public int getVolume() {
		return larghezza*lunghezza*profondità;
	}
}
