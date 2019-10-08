package it.beije.malang.natura;

public interface Onnivoro extends Carnivoro, Erbivoro{
	
	public default void cibo() {
		System.out.println("mangia sia carne che erba");
	}
	
}