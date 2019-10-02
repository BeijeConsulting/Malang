package it.beije.malang.natura;

public interface  Onnivoro extends Carnivoro, Erbivoro {
		public default void mangiaTutto() {
			System.out.println("Sono Onnivoro");
		}
	}
	
