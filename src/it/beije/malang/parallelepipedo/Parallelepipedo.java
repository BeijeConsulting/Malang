package it.beije.malang.parallelepipedo;

public class Parallelepipedo {
	
	int l,l1,h;
	double volume=0;
	
	public Parallelepipedo(int larghezza) {
		this (larghezza,1,1);
		l=larghezza;
		l1=1;
		h=1;
		}
	
	public Parallelepipedo(int larghezza, int lunghezza) {
		
		this (larghezza,lunghezza,1);
		l=larghezza;
		l1=lunghezza;
		h=1;
		
	}
	public Parallelepipedo(int larghezza, int lunghezza, int altezza)
	{
		l=larghezza;
		l1=lunghezza;
		h=altezza;
	}
	
	public void getLarghezza()
	{
		System.out.println(l);
	}
	
	public void getLunghezza()
	{
		System.out.println(l1);
	}
	
	public void getAltezza()
	{
		System.out.println(h);
	}
	
	public void getVolume()
	{
		volume=l*l1*h;
		System.out.println(volume);
	}

}
