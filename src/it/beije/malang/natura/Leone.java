package it.beije.malang.natura;

public class Leone extends Mammiferi implements Carnivoro {

	
	public void mangiare() {}
	public void respirare() {
		System.out.println("il leone respira con i polmoni");
	}


	public static void main(String[] args) {
				
		Leone l= new Leone();
		
		l.mangiare();
		
		
		l.setEta(5);
		
		l.respirare();
		System.out.println(l.getEta());
		
	}
	
	@Override
	public void mangiaCarne() {
		System.out.println("sto mangiando solo la carne");
		
	}
	
	

	

}
