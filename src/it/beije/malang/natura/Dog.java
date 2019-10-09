package it.beije.malang.natura;

public class Dog implements Onnivoro, Carnivoro{


	public void mangiaCarne() {
		System.out.println("il cane mangia carne");
	}

	
	public void mangiaErba() {
		System.out.println("il cane mangia erba");
	}
	

	public void Verso(String fra) {
		System.out.println("il verso del cane è: "+ fra );
	 
}
	
	
	public void Zampe()  {
		System.out.println( "il cane ha 4 zampe"  );
	
	}
}