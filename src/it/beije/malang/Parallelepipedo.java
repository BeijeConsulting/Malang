package it.beije.malang;

public class Parallelepipedo {

	static int larghezza;
	 static int lunghezza;
	 static int altezza;
	 static int volume;
	 
	public Parallelepipedo(int larghezza) {
		
this(larghezza,1);
System.out.println("calcolo il volume 1...");
//Parallelepipedo.volume=larghezza*lunghezza*altezza;

	}
	
	public Parallelepipedo(int larghezza, int lunghezza) {
		this(larghezza,lunghezza,1);
		System.out.println("calcolo il volume 2...");
	//	Parallelepipedo.volume=larghezza*lunghezza*altezza;
	}
		
	public Parallelepipedo(int larghezza,int lunghezza,int altezza) {
		Parallelepipedo.larghezza=larghezza;
		Parallelepipedo.lunghezza=lunghezza;
		Parallelepipedo.altezza=altezza;
		System.out.println("calcolo il volume 3...");
		Parallelepipedo.volume=larghezza*lunghezza*altezza;
	}
	
	public static int getLarghezza() {
		return larghezza;
		}
	public static int getLunghezza() {
		return lunghezza;
		}
	public static int getaltezza() {
		return altezza;
		}
	
	
	
	public static void main(String[] args) {
		Parallelepipedo p = new Parallelepipedo(4,5,6);
		System.out.println(volume);
		
//		Parallelepipedo p2 = new Parallelepipedo(4,5);
//		System.out.println(volume);
//		Parallelepipedo p1 = new Parallelepipedo(4,5,6);
//		System.out.println(volume);
		
		System.out.println(getLarghezza());
		System.out.println(getLunghezza());
		System.out.println(getaltezza());
		
		
	}

}
