package it.beije.malang;

public class Contatto {
	
	private int id;
	private String cognome;
	private String nome;
	private String cognomenome;
	private String telefono;
	private String email;
	

	public static int counter = 0;
	
	public Contatto(){
		++counter;
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
	
	public String getCognomeNome() {
		return cognome + nome;
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
		builder.append("CONTATTO " + counter+'\n');
		builder.append("\tcognome : ").append(cognome).append('\n');
		builder.append("\tnome : ").append(nome).append('\n');
		builder.append("\ttelefono : ").append(telefono).append('\n');
		builder.append("\temail : ").append(email).append('\n').append('\n');
		return builder.toString();
	}
}
