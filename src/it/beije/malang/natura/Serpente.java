package it.beije.malang.natura;

public class Serpente extends Rettili implements Carnivoro, Erbivoro{
	
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
	
	public void mangiaCarne() {
		System.out.println("stasera tartar di fassona");
	}
	/*public void mangiaErba() {
		System.out.println("io l'erba più che mangiarla la fumo");
	}*/

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
		phrenk.mangiaErba();
		Rettili ret=new Serpente();//cosi va a prendere i metodi di rettili.
		//Rettili.mangiaErba();
		//Erbivoro.mangiaErba();
		
	}
}
