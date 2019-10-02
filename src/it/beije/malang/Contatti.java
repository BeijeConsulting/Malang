package it.beije.malang;

import java.util.ArrayList;

public class Contatti {
		
	private int id;
	private String cognome;
	private String nome;

	private String telefono;
	private ArrayList<String> email = new ArrayList<String>();
		

	public static int counter = 0;
		
	public Contatti(){
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
		
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public ArrayList<String> getEmail() {
		return email;
	}
	public void addEmail(String email) {
		this.email.add(email);
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



