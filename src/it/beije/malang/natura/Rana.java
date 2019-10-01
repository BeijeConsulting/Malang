package it.beije.malang.natura;

public class Rana extends Anfibi {
	
	public static void main(String args[]) {
		
		Rana prince = new Rana();
		
		prince.respirare();
		prince.mangiare();
		
		prince.setEta(2.5);
		System.out.println("La rana ha "+prince.getEta()+" anni.\n");
	}
	
	public void respirare() {
		System.out.println("La rana gracchia silenziosamente.\n");
	}
	
	public void mangiare() {
		System.out.println("La rana mangia un insetto.\n");
	}
}
