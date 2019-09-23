package it.beije.malang;

public class Contatto {
	
	private String cognome;
	private String nome;
	private String telefono;
	private String email;


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
	
	public String getCognomeNome() {
		return getCognome()+"_"+getNome();
	}
	
	public String getEmailComposta() {
		return getNome()+"@"+getCognome()+".it";
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cognome : ").append(cognome).append('\n');
		builder.append("nome : ").append(nome).append('\n');
		builder.append("telefono : ").append(telefono).append('\n');
		builder.append("email : ").append(email).append('\n');
		return builder.toString();
	}
	
	
	public String toStringRubricaUno() {
		StringBuilder b = new StringBuilder();
		b.append(cognome).append("\t");
		b.append(nome).append("\t");
		b.append(getCognomeNome()).append("\t");
		b.append(email).append("\t");
		b.append(telefono).append("\t");
		return b.toString();
	}
	
	public String toStringSecondaRubrica() {
		StringBuilder b = new StringBuilder();
		b.append(cognome).append("\t");
		b.append(nome).append("\t");
		b.append(telefono).append("\t");
		b.append(getEmailComposta()).append("\t");
		return b.toString();
		
	}
	
	public String toStringTerzaRubrica() {
		StringBuilder builder = new StringBuilder();
		builder.append(cognome).append('\t');
		builder.append(nome).append('\t');
		builder.append(email).append('\t');
		builder.append(telefono).append('\t');
		builder.append('\n');
		
		return builder.toString();
	}
}
