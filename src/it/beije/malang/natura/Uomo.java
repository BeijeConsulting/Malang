package it.beije.malang.natura;

public class Uomo extends Mammifero implements Onnivoro{
	
	public static void main(String[] args) {
		System.out.println("sono un uomo e...: \n");
		Uomo u = new Uomo();
		u.Parto();
		u.Onnivoro();
		
	}
	
}
