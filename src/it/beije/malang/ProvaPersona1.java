package it.beije.malang;

public class ProvaPersona1 {
String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProvaPersona1 uomo= new ProvaPersona1();
		uomo.name = "è";
		System.out.println(uomo.name);
		Boolean bool = uomo instanceof ProvaPersona1;
		if(bool); 
		System.out.println("ok");
	}
}
