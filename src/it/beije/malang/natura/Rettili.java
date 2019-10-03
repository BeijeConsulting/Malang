package it.beije.malang.natura;

public abstract class Rettili extends Animale implements Carnivoro,Erbivoro{
	public boolean sangueFreddo() {
		return true;
	}
	public abstract void respirare();
	public abstract void mangiare();
	public abstract void bere();
	public abstract void mangiaCarne(); 
	/*public static void mangiaErba() {
		System.out.println("i rettili non mangiano erba!\n E chi lo dice??\n lo dico io!!!");
	} */
	
}
