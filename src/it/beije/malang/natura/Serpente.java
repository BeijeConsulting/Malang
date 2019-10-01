package it.beije.malang.natura;

public class Serpente extends Rettili {
	
	public double getEta() {
		return super.getEta()+5000;
	}

	@Override
	public void respirare() {
		// TODO Auto-generated method stub
		System.out.println("fatti i cazzi tuoi");
	}

	@Override
	public void mangiare() {
		// TODO Auto-generated method stub
		System.out.println("fatti i cazzi tuoi");
	}

	@Override
	public void bere() {
		// TODO Auto-generated method stub
		System.out.println("Ho detto fatti i cazzi tuoi");
	}
	public static void main(String[] tuoPadre) {
		Serpente phrenk= new Serpente();
		phrenk.setEta(25);
		System.out.println(phrenk.getEta());
		phrenk.mangiare();
		phrenk.bere();
		
	}
}
