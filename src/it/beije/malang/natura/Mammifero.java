package it.beije.malang.natura;

public interface Mammifero extends Carnivoro, Erbivoro, Onnivoro  {
	public abstract boolean  haPelo();
	public default void allatta() {
		System.out.println("Tutti i mammiferi allattano la prole");
	}

}
