package it.beije.malang.natura;

public class Trota extends Pesce {

	public static void main(String[] args) {
		Trota trota=new Trota();
		trota.mangiare();
		trota.respirare();
		trota.swim();
	}

	@Override
	public void respirare() {
		System.out.println("respiro come una trota, ammesso che essa sia chiamata respirazione?");
		
	}

	@Override
	public void mangiare() {
		System.out.println("mangio come una trota!");
		
	}

}
