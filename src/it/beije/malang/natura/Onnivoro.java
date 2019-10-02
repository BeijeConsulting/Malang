package it.beije.malang.natura;

public interface Onnivoro extends Carnivoro, Erbivoro {
	
	default void Onnivoro() {
		mangiaCarne();
		mangiaErba();
	}
	
	default void mangiaCarne() {
		System.out.println("mangio carne \n");
	}
	default void mangiaErba() {
		System.out.println("mangio erba \n");
	}
	
	
}





