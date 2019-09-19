package it.beije.malang;

public class Parallelepipedo {
	private double lunghezza;
	private double larghezza;
	private double profondita;
	private double volume;
	
	public double getLunghezza() {
		return lunghezza;
	}
	
	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	public double getLarghezza() {
		return larghezza;
	}
	
	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
	
	public double getProfondita() {
		return profondita;
	}
	
	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}
	
	public double getVolume() {
		return volume;
	}
	
	
	public Parallelepipedo(double lunghezza, double larghezza, double profondita) {
		super();
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
		this.volume = lunghezza * larghezza * profondita;
	}
	
	public Parallelepipedo(double larghezza, double profondita) {
		this(1, larghezza, profondita);
	}
	
	
	
	
	
	
	
	
}
