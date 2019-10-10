package it.beije.malang.natura;

public class Cane implements Mammifero {

	public static void main(String[] args) {
		
		System.out.println(caratteristiche());
	
	}

	public static String caratteristiche() {
		Cane cane = new Cane();
		cane.allatta();
		cane.haPelo();
		cane.mangiaCarne();
		cane.mangiaErba();
		cane.mangiaCarneEerba();
		
		String res = "Il cane ha pelo, allatta e mangia sia carne che erba quindi è un mammifero onnivoro.";
		
		return res;
	}
	
	@Override
	public void mangiaCarne() {
		
		System.out.println("Alcuni mammiferi mangiano carne quindi sono carnivori");
		
	}

	@Override
	public void mangiaErba() {
		System.out.println("Alcuni mammiferi mangiano erba quindi sono erbivori");
		
	}

	@Override
	public void mangiaCarneEerba() {
		System.out.println("Alcuni mammiferi mangiano sia carne che erba quindi sono carnivori");
		
	}

	@Override
	public boolean haPelo() {
		System.out.println("Alcuni mammiferi hanno pelo");
		return true;
	}

	
	
	
}
