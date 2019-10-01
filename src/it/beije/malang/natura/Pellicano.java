package it.beije.malang.natura;

public class Pellicano extends Uccelli{
	
	public void respirare() {
		System.out.println("il pellicano respira con i polmoni");
	}
	
	public void mangiare() {
		System.out.println("il pellicano mangia i pesci");
	}
	
	public void migrazione() {
		System.out.println("il pellicano non  è un uccello migratore");
	}
	
	
	public static void main(String[] args) {
		
		Pellicano pellicano = new Pellicano();
		pellicano.setEta(5);
		pellicano.setLunghBecco("50 cm");
		
		System.out.println(pellicano.getEta());
		System.out.println("la lunghezza del becco del pellicano è: "+pellicano.getLunghBecco());
		pellicano.respirare();
		pellicano.mangiare();
		pellicano.migrazione();
		
	}

}
