package it.beije.malang;

public class Contatto {
	
	private int id;
	private String cognome;
	private String nome;
	private String telefono;
	private String email;
	private int età;
	
	public int getEtà() {
		return età;
	}
	public void setEtà(int età) {
		this.età = età;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cognome : ").append(cognome).append('\n');
		builder.append("nome : ").append(nome).append('\n');
		builder.append("telefono : ").append(telefono).append('\n');
		builder.append("email : ").append(email).append('\n');
		builder.append("età : ").append(età).append('\n');
		return builder.toString();
	}
}
