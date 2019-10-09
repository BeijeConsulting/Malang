package it.beije.malang.natura;

public interface Erbivoro {
	
	void mangiaErba();
	
	public default void numStom() {
		System.out.println("3");;
	}

}
