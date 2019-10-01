package it.beije.malang.natura;

public class Ragno extends Insetti {
	
	public static void main(String args[]) {
		
		Ragno blackspider = new Ragno();
		
		blackspider.respirare();
		blackspider.mangiare();
		
		blackspider.setEta(0.25);
		System.out.println("Il ragno ha "+blackspider.getEta()+" anni.\n");
	}
	
	public void respirare() {
		System.out.println("Il ragno respira sulla ragnatela.\n");
	}
	
	public void mangiare() {
		System.out.println("Il ragno mangia un insetto.\n");
	}
}
