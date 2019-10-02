package it.beije.malang.natura;

public class Tigre extends Mammifero implements Carnivoro{
	
	public void mangiaCarne() {
		System.out.println("mangio carne \n");
	}
	
	public static void main(String[] args) {
		System.out.println("sono una tigre e....: \n");
		Tigre t = new Tigre();
		t.Parto();
		t.mangiaCarne();
	}

}
