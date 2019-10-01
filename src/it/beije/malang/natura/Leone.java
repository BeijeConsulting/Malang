package it.beije.malang.natura;

public class Leone extends Mammiferi {

	
	public void mangiare() {
		System.out.println("I leoni mangiano con i denti");
	}
	
	public void respirare() {
		System.out.println("il leone respira con i polmoni");
	}

	public static void main(String[] args) {
				
		Leone l= new Leone();
		
		
		l.setEta(5);
		l.mangiare();
		l.respirare();
		System.out.println(l.getEta());
		
	}
	

	

}
