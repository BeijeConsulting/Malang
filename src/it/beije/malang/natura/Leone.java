package it.beije.malang.natura;

public class Leone extends Mammiferi implements Carnivoro{

	public void mangiare() {
		mangiaCarne();
	}
	
	public void mangiaCarne() {
		System.out.println("I leoni sono carnivori e mangiano carne");
	}
	public void camminare() {
		System.out.println("I leoni corrono su " + getNumeroZampe() + " zampe");
	}

	public static void main(String[] args) {
		
		Leone leone = new Leone();
		leone.setEta(5);
		int eta = (int)leone.getEta();
		System.out.println("Il leone ha " + eta + " anni ");
		leone.setNumeroZampe(4);
		leone.camminare();
		leone.mangiare();
		

	}

}
