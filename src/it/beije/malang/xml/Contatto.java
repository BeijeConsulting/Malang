package it.beije.malang.xml;

public class Contatto {
	
	private int id;
	private String nome;
	private String cognome;
	private String numero;
	private String indirizzo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public void setIndirizzo(String nome,String cognome) {
		this.indirizzo = this.nome+"@"+this.cognome+".IT";
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(cognome).append(';');
		builder.append(nome).append(';');
		builder.append(indirizzo).append(';');
		builder.append(numero).append('\n');
		return builder.toString();
	}
	
}