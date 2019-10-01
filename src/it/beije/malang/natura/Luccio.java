package it.beije.malang.natura;

public class Luccio extends Pesci {
	
	public void respirare() {
		System.out.println("il luccio respira con le branchie");
	}
	
	public void mangiare() {
		System.out.println("il luccio mangia pesci, rane, topi");
	}
	

	
	public static void main(String[] args) {
		
		Luccio luccio = new Luccio();
		
		luccio.setEta(1);
		luccio.setcolore("grigio");
		luccio.setNumUova(1000);
		luccio.setTipoAcqua("dolce");
		
		System.out.println(luccio.getcolore());
		System.out.println(luccio.getEta());
		System.out.println(luccio.getNumUova());
		System.out.println(luccio.getTipoAcqua());
		
		luccio.respirare();
		luccio.mangiare();
		
		
	}
		
}
	



