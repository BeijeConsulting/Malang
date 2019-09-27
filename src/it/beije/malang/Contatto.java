package it.beije.malang;

public class Contatto implements Comparable<Contatto>{
	
	private int id;
	private String cognome;
	private String nome;
	private String telefono;
	private String email;
	
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
	
	public String getCognomeNome() {
		return cognome + " " + nome;
	}
	
	
	
	public Contatto(String cognome, String nome, String telefono, String email) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Contatto() {
		super();
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(cognome).append(';');
		builder.append(nome).append(';');
//		builder.append(getCognomeNome()).append(';');
		builder.append(email).append(';');
		builder.append(telefono);
		return builder.toString();
	}
	
	@Override
    public int compareTo(Contatto contatto) {
		String cognome=contatto.getCognome();
		
		return this.cognome.compareTo(cognome);
	}
	
}
