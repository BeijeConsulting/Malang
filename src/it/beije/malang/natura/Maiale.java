package it.beije.malang.natura;

public class Maiale extends Mammiferi implements Carnivoro, Erbivoro{
	
public int zampe = 4;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maiale joseph = new Maiale();
		System.out.println(joseph.numeroDiZampe(joseph.zampe));
		joseph.getEta();
		joseph.mangiare();
		joseph.bere();
		joseph.respirare();
	}

	public void respirare() {
		System.out.println("respiro");
	}

	public void mangiare() {
		System.out.println("mangio");
	}

	public void bere() {
		System.out.println("bevo bevo bevo mi ubriaco e son felice anchhe se poi vomito!");
	}
	public void mangiaCarne() {
		System.out.println("stasera tartar di fassona");
	}
	public void mangiaErba() {
		System.out.println("io l'erba pi� che mangiarla la fumo");
	}
}
