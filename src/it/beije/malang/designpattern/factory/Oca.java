package it.beije.malang.designpattern.factory;

public class Oca {
	
	
	private String nome = null;
	private String cognome = null;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String toString() {
		return nome + " " + cognome + " sta studiando per la certificazione OCA";
	}
}
