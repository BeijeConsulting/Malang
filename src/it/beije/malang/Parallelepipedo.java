package it.beije.malang;
import java.util.*;

public class Parallelepipedo {
	private	static int lunghezza;
	private static int larghezza;
	private static int altezza;
	private static int volume;
	
	
	public  Parallelepipedo(int lunghezza) {
		this(lunghezza, 1);		
	}
	
	public Parallelepipedo(int lunghezza, int larghezza) {
		this(lunghezza, larghezza, 1);
	}
	
	public Parallelepipedo(int lunghezza, int larghezza, int altezza) {
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
		this.altezza   = altezza;
		
		this.volume = lunghezza * larghezza * altezza;
	}
	
	public static void print() {
		System.out.println(lunghezza + " " + larghezza + " " + altezza);
		}
	// metodi che restituiscono solo il valore chiesto in caso servissero
	//ma inutile perchè ho fatto il print
//	public int getLunghezza() {
//		return lunghezza;
//	}
//	public int getLarghezza() {
//		return larghezza;
//	}
//	public int getAltezza() {
//		return altezza;
//	}
//	
	public static int getVolume() {
		return volume;
		
	}
	
	
	public static void main(String[] args) {
		
		
		Parallelepipedo parallelepipedo = new Parallelepipedo(3, 5);
		Parallelepipedo.print();
		System.out.println("voulume = " + Parallelepipedo.getVolume());
	}
}