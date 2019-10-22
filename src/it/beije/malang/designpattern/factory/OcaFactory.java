package it.beije.malang.designpattern.factory;

public class OcaFactory {
	
	private OcaFactory() {}
	
	public static Oca getOca(String nome, String cognome) {
		Oca oca = new Oca();
		oca.setNome(nome);
		oca.setCognome(cognome);

		return oca;
	}
}
