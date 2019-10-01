package it.beije.malang.natura;

public class Branzino extends Pesci{
	public void setEta(int eta) {//sto praticamente facendo un overload del metodo setEta che passa da prendere in ingresso double a int
		super.setEta(eta);
	}

public void respirare() {
	System.out.println("respiro");
}

public void mangiare() {
	System.out.println("mangio");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branzino johnny = new Branzino();
		johnny.mangiare();
		johnny.setEta(44);
		System.out.println(johnny.getEta());
	}

}
